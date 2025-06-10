
import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle(amount): ");
        double p = sc.nextDouble();

        System.out.println("Enter the time: ");
        double n = sc.nextDouble();

        System.out.println("Enter the rate of intrest: ");
        double r = sc.nextDouble();

        double si = p*n*r/100;

        System.out.println("Simple intrest: " + si);
    }
}
