import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4}; 
        arr[2]= 23;
        
        System.out.println("1D Array:");
        System.out.println("element at index 2 is "+ arr[2]);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        int arr2[][] = new int[3][3];

        System.out.println("---Without Taking input Array(3x3)---");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(); 
        }
        

        System.out.println("---Taking array input---");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
            System.out.println(); 
        }
        
        System.out.println("---Displaying Inputed Array element in(3x3)---");
        System.out.println("2D Array (Matrix):");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}





        // int count = 0; 
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 0; j < 3; j++) {
        //             arr2[i][j] = count++ ;                
        //     }
        // }
