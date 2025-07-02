public class calculator {
    int add(int a , int b){ 
        return a + b;
    }
    int add(int a , int b, int c){ 
        return a + b + c;
    }
    double add(double a , double b){ 
        return a + b;
    }
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println("Addition of two numbers is: " + c.add(2,2));
        System.out.println("Addition of three numbers is: " + c.add(2,2,2));
        System.out.println("Addition two float number is: " + c.add(4.6,6.2));
    }
}
