public class condition {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<=100; i++){
            if(sum == 15){
                break;
            }
            sum = sum + i;
            
        }
        System.out.println(sum);
    }
}
