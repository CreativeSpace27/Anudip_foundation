public class fibonacii {
    void chkfibo(){
        int a= 0;
        int b = 1; 
        int c;
        System.out.println(a);
        for(int i = 0; i<=10; i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        fibonacii f = new fibonacii();
        f.chkfibo();
    }
}
