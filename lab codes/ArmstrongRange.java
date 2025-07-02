import java.util.Scanner;

public class ArmstrongRange {
    public static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int sum = 0;

            int temp = num;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;

                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power *= digit;
                }
                sum += power;
                temp /= 10;
            }
            if (sum == originalNum) {
                System.out.println(originalNum + " is an Armstrong number.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("\nArmstrong numbers between " + start + " and " + end + " are:");
        printArmstrongNumber(start, end);

        scanner.close();
    }
}
