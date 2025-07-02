
public class arrlargele {
    public static void main(String[] args) {
        int  arr[] = {5,3,8,2,10,4};

        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >max) {
                max =arr[i]; 
            }

        }
        
        System.out.println("2nd Largest element in array is: " + max);
    }
}
