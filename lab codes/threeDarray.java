import java.util.Random;
public class threeDarray {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3]; 
        Random rand = new Random();

        int sum = 0;
        int totalElements = 0;
        int max = Integer.MIN_VALUE;

        System.out.println("3D Array Elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = rand.nextInt(100); 
                    System.out.print(array[i][j][k] + "\t");

                    sum += array[i][j][k];
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                    totalElements++;
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
        double average = (double) sum / totalElements;

        System.out.println("Maximum value in the array: " + max);
        System.out.printf("Average of all elements: %.2f\n  ", average);
    }
}
