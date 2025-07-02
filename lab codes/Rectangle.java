public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);  
        Rectangle r2 = new Rectangle(7, 8);

        int area1 = r1.calculateArea();
        int area2 = r2.calculateArea();

        System.out.println("Area of Rectangle1: " + area1);
        System.out.println("Area of Rectangle2: " + area2);

        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } 
        else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } 
        else {
            System.out.println("They are equal");
        }
    }
}
