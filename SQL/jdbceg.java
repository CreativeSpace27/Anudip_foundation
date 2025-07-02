import java.sql.*;
public class jdbceg{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/department";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC driver

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connection successful!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM emmployee");

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("emp_id") +
                                ", Name: " + rs.getString("emp_name") +
                                ", Department ID: " + rs.getString("dept_id"));
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found!");
            e.printStackTrace();
        }
    }
 }
