abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 3.14159 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;
    }
}
public class calarea {
    public static void main(String[] args) {
        Circle circle = new Circle(5); 
        Rectangle rectangle = new Rectangle(4, 6); 
        System.out.printf("Area of the Circle: %.2f\n", circle.calculateArea());
        System.out.printf("Area of the Rectangle: %.2f\n", rectangle.calculateArea());
    }
}
