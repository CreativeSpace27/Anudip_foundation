import java.util.Scanner;

public class leepyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long year = sc.nextLong(); 

        if(year % 4 == 0 || year % 400 == 0 || year% 100 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year +" Not a Leap year");
        }
    }
}
