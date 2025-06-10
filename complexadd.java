
import java.util.Scanner;

public class complexadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real first part of Complex Number: ");
        int r1 = sc.nextInt();
        System.out.println("Enter real second part of Complex Number: ");
        int r2 = sc.nextInt();

        System.out.println("Enter Imagnary first part of Complex Number: ");
        int i1 = sc.nextInt();
        System.out.println("Enter Imagnary second part of Complex Number: ");
        int i2 = sc.nextInt();

        int real = r1 + r2;
        int imag = i1  + i2;
        
        System.out.println("The Addition of two complex number is "+real+ " + "+ imag +" i");

        
    }
}
