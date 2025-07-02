import java.sql.*;
import java.util.Scanner;

public class emp_management {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database connection successful!");

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n======= Employee Management =======");
                System.out.println("1. Add New Employee");
                System.out.println("2. Delete Employee by ID");
                System.out.println("3. Show All Employees");
                System.out.println("4. Search Employee by ID");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: "); 
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();
                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();

                        PreparedStatement insertStmt = conn.prepareStatement(
                                "INSERT INTO employee (emp_id, emp_name, dept_name, email) VALUES (?, ?, ?, ?)");
                        insertStmt.setInt(1, id);
                        insertStmt.setString(2, name);
                        insertStmt.setString(3, dept);
                        insertStmt.setString(4, email);

                        int rowsInserted = insertStmt.executeUpdate();
                        if (rowsInserted > 0)
                            System.out.println(" Employee added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter Employee ID to delete: ");
                        int delId = sc.nextInt();
                        PreparedStatement delStmt = conn.prepareStatement("DELETE FROM employee WHERE emp_id = ?");
                        delStmt.setInt(1, delId);
                        int rowsDeleted = delStmt.executeUpdate();
                        if (rowsDeleted > 0)
                            System.out.println(" Employee deleted successfully!");
                        else
                            System.out.println(" No employee found with ID: " + delId);
                        break;

                    case 3:
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
                        System.out.println("\n--- All Employees ---");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("emp_id")
                                    + ", Name: " + rs.getString("emp_name")
                                    + ", Department: " + rs.getString("dept_name")
                                    + ", Email: " + rs.getString("email"));
                        }
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to search: ");
                        String searchId = sc.nextLine();
                        PreparedStatement searchStmt = conn.prepareStatement("SELECT * FROM employee WHERE emp_id = ?");
                        searchStmt.setString(1, searchId);
                        ResultSet searchRs = searchStmt.executeQuery();

                
                    case 0:
                        System.out.println("👋 Exiting...");
                        break;

                    default:
                        System.out.println(" Invalid choice. Try again.");
                }

            } while (choice != 0);

            conn.close();
            sc.close();

        } catch (SQLException e) {
            System.out.println(" SQL Error!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(" JDBC Driver not found!");
            e.printStackTrace();
        }
    }
}
