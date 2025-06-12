
import java.util.Scanner;

// public class functions {
//     public static void main(String[] args) {
//         // functions f = new functions(); if function is not static u have to use class object to call that function
//         // functions f = new functions(); like this
//         // f.printinfo();

//         printinfo();
//     }
//     public static void printinfo(){ 
//             System.out.println("Hello Function");
//         }
// }


public class functions{
    public static void main(String[] args) {
        add();
        
    }
    public static void add(){ 
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        int res = a + b;
        System.out.println("The addition of "+ a+ " & "+ b+" is: "+res);

        sc.close();
    } 
}