
// import java.util.Scanner;

// class shape{
//     public void area(){
//         System.out.println("Display area of rectangle");
//     }
// }
// class rectangle extends shape{
//     Scanner sc = new Scanner(System.in);
//     void display(){
//         System.out.print("Enter the Length of rectangle: ");
//         int l = sc.nextInt(); 
//         System.out.print("Enter the breadth of rectangle: ");
//         int b = sc.nextInt();
//         int area = l*b;
//         System.out.println("Area is rectangle is : "+area);
//     }
// }

// public class singleinheritance {
//     public static void main(String[] args) {
//         rectangle t1 = new rectangle();
//         t1.area();
//         t1.display();
//     }
// }




import java.util.Scanner;

class shape{
    public void area(){
        System.out.println("Display area of triangle");
    }
}
class triangle extends shape{
    Scanner sc = new Scanner(System.in);
    void display(){
        System.out.print("Enter the Length of triangle: ");
        int l = sc.nextInt(); 
        System.out.print("Enter the breadth of triangle: ");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println("Area is rectangle is : "+area);
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.area();
        t1.display();
    }
}



