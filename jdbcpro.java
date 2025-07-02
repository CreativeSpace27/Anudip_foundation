import java.sql.*;
import java.util.*;

public class jdbcpro {

    static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo";
    static final String USER = "root";
    static final String PASS = "root";

    static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }

    record Employee(int id, String name, int age, String dept, String email, String phone, String address) {
        public Employee(String name, int age, String dept, String email, String phone, String address) {
            this(0, name, age, dept, email, phone, address);
        }
        public String toString() {
            return String.format("ID: %d | Name: %s | Age: %d | Dept: %s | Email: %s | Phone: %s | Address: %s",
                    id, name, age, dept, email, phone, address);
        }
    }

    static void addEmployee(Employee emp) throws Exception {
        String sql = "INSERT INTO employees(name, age, department, email, phone, address) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emp.name()); ps.setInt(2, emp.age());
            ps.setString(3, emp.dept()); ps.setString(4, emp.email());
            ps.setString(5, emp.phone()); ps.setString(6, emp.address());
            ps.executeUpdate();
            System.out.println("✅ Employee added.");
        }
    }

    static List<Employee> getAll() throws Exception {
        List<Employee> list = new ArrayList<>();
        try (Connection con = getConnection();
             ResultSet rs = con.createStatement().executeQuery("SELECT * FROM employees")) {
            while (rs.next()) list.add(getEmp(rs));
        }
        return list;
    }

    static Employee getById(int id) throws Exception {
        String sql = "SELECT * FROM employees WHERE id=?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return rs.next() ? getEmp(rs) : null;
        }
    }

    static void update(int id, Employee emp) throws Exception {
        String sql = "UPDATE employees SET name=?, age=?, department=?, email=?, phone=?, address=? WHERE id=?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emp.name()); ps.setInt(2, emp.age());
            ps.setString(3, emp.dept()); ps.setString(4, emp.email());
            ps.setString(5, emp.phone()); ps.setString(6, emp.address()); ps.setInt(7, id);
            ps.executeUpdate();
            System.out.println("✅ Updated.");
        }
    }

    static void delete(int id) throws Exception {
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM employees WHERE id=?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("✅ Deleted.");
        }
    }

    static List<Employee> search(String keyword) throws Exception {
        String sql = "SELECT * FROM employees WHERE name LIKE ? OR department LIKE ? OR email LIKE ? OR phone LIKE ? OR address LIKE ?";
        List<Employee> list = new ArrayList<>();
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            for (int i = 1; i <= 5; i++) ps.setString(i, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) list.add(getEmp(rs));
        }
        return list;
    }

    static Employee getEmp(ResultSet rs) throws Exception {
        return new Employee(rs.getInt("id"), rs.getString("name"), rs.getInt("age"),
                rs.getString("department"), rs.getString("email"), rs.getString("phone"), rs.getString("address"));
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    
                    --- Employee Menu ---
                    1. Add Employee
                    2. Show All Employees
                    3. Search by ID
                    4. Update by ID
                    5. Delete by ID
                    6. Read by ID
                    7. Search (Keyword)
                    8. Exit
                    Enter choice: """);
            int ch = sc.nextInt(); sc.nextLine();

            switch (ch) {
                case 1 -> addEmployee(inputEmployee(sc));
                case 2 -> getAll().forEach(System.out::println);
                case 3, 6 -> {
                    System.out.print("Enter ID: ");
                    Employee emp = getById(sc.nextInt());
                    System.out.println(emp != null ? emp : "❌ Not found.");
                }
                case 4 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    update(id, inputEmployee(sc));
                }
                case 5 -> {
                    System.out.print("Enter ID: ");
                    delete(sc.nextInt());
                }
                case 7 -> {
                    System.out.print("Keyword: ");
                    search(sc.nextLine()).forEach(System.out::println);
                }
                case 8 -> {
                    System.out.println("👋 Exiting...");
                    return;
                }
                default -> System.out.println("❌ Invalid choice!");
            }
        }
    }

    static Employee inputEmployee(Scanner sc) {
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Age: "); int age = sc.nextInt(); sc.nextLine();
        System.out.print("Department: "); String dept = sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();
        System.out.print("Phone: "); String phone = sc.nextLine();
        System.out.print("Address: "); String address = sc.nextLine();
        return new Employee(name, age, dept, email, phone, address);
    }
}
