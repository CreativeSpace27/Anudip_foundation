import java.util.Scanner;

public class grosalcal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.print("Enter basic salary of the employee: ");
            double basicSalary = scanner.nextDouble();

            double hra, da, grossSalary;

            if (basicSalary > 15000) {
                hra = 0.20 * basicSalary;
                da = 0.60 * basicSalary;
            } else {
                hra = 3000;
                da = 0.70 * basicSalary;
            }
            grossSalary = basicSalary + hra + da;

            System.out.println("Gross Salary = " + grossSalary);

            System.out.print("Enter -1 to calculate salary for another employee, or any other number to exit: ");
            choice = scanner.nextInt();

        } 
        while (choice == -1);
        System.out.println("Program terminated.");
        scanner.close();
    }
}
