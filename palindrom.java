import java.util.Scanner;

public class palindrom {
    void chkpalin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
    
        String str = new StringBuilder(s).reverse().toString();
        
        if(str.equals(s)){
            System.out.println("Ths String is Plaindrome ");
        }
        else{
            System.out.println("String is not plaindrome");
        }
        sc.close();
    }
    public static void main(String[] args) {
        palindrom p = new palindrom();
        p.chkpalin();

    }
}



