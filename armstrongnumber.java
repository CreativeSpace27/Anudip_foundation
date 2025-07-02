
import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        String numstr = String.valueOf(num);

        for(int i= 0; i<numstr.length(); i++){ 
            int degit = Character.getNumericValue(numstr.charAt(i)); 
            sum +=degit*degit*degit;
        }

        if(sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
