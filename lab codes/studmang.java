class Student {
    String name;
    int age;
    String department;

    Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }
}
public class studmang {
    public static void main(String[] args) {
        Student student1 = new Student();  
        Student student2 = new Student("Piyush", 21);  
        Student student3 = new Student("Riya", 22, "Computer Engineering");  

        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("Student 2 Details:");
        student2.displayDetails();

        System.out.println("Student 3 Details:");
        student3.displayDetails();
    }
}
