import java.util.Scanner;

public class factorial {
    void getfactorial(){
        int fact =1; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for(int i = 1; i <= number ; i++){
            fact = fact*i;
        }
        System.out.println("The Factorial of "+number + " is: "+fact);
    }
    public static void main(String[] args) {
        factorial f= new factorial();
        f.getfactorial();
    }
}

