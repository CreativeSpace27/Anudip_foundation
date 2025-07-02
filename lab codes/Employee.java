public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee emp = new Employee();

        // emp.age = 35.5; 

        emp.age = (int) 35.5;  

        System.out.println("Successfully started");
    }
}
