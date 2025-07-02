public class Studdent {
    private String name;
    private int age;
    private String department;

    public Studdent(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public static void main(String[] args) {
        Studdent s1 = new Studdent("Piyush",19, "Computer Engineering");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Department: " + s1.getDepartment());
    }
}
