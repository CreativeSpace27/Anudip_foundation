import java.util.Scanner;

public class evenoddcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int number;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("\nTotal even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        scanner.close();
    }
}
