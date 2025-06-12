// Program Question   :Create a Java Singleton class
// The singleton pattern is a design pattern that restricts the instantiation of an object to 
// only one instance. To do this, you’ll need to create a Singleton class that has a non-parameterized constructor.
// The class should have one public variable called str. It should also have a static method called 
// getSingleInstance that’ll return the single instance of the class


public class singlleton {
    public static void main(String[] args) {
        a obj1 = a.getSingleInstance();
        a obj2 = a.getSingleInstance();

        if(obj1.equals(obj2)){
            System.out.println("same object of singletone class");
        }
    }
}
class  a{ 
    static a obj = new a(); 
    private a(){

    }
    public static a getSingleInstance(){
        System.out.println("Hello Singletone class");
        return obj; 
    }
}
