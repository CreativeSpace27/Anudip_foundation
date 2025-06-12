
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt(); 

        switch (num) {
            case 1 :
                System.out.println("Good Morning");
                break;
            case 2:
                System.out.println("namste");
                break;
            case 3:
                System.out.println("Good night");
                break;
            default:
                System.out.println("invalid");;
        }
        sc.close();
    }
}
