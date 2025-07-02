import java.util.Scanner;
public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accNumber = scanner.nextInt();

        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();

        BankAccount account = new BankAccount(name, accNumber, initialBalance);

        System.out.print("Enter deposit amount: ");
        int depositAmount = scanner.nextInt();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = scanner.nextInt();
        account.withdraw(withdrawAmount);

        int currentBalance = account.getBalance();
        System.out.println("Current Balance: " + currentBalance);

        String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("Status: " + status);

        scanner.close();
    }
}
