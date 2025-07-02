public class Car {
    String make; 
    String model; 
    short year; 
    int price; 

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model; 
        this.year = year; 
        this.price = price;
    }
    public void displayInfo(){ 
        System.out.println("--Car detail--");
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        Car c = new Car("India","maruti",(short) 2000,100000);
        c.displayInfo();
    }
}
