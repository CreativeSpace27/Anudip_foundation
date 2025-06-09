import java.util.Scanner;

public class evenodd {

    void getinput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        if(num % 2== 0){
            System.err.print("Number is Even");
        }
        else{
            System.out.print("Nunmber is odd");
        }
    }

    public static void main(String[] args) {
        evenodd a = new evenodd();
        a.getinput();
    }
}

