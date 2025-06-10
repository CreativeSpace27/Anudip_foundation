import java.util.Scanner;

public class vowelandconsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        char a = sc.next().charAt(0);

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.println(a +" is Vowel");
        }
        else{
            System.out.println(a+ " consonant");
        }
    }
}
