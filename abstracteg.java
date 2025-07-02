// abstract class Animal {
//     // Abstract method (no body)
//     abstract void sound();

//     // Concrete method
//     void eat() {
//         System.out.println("Animal Eating");
//     }
// }

// class Dog extends Animal {
//     // Implementation of abstract method
//     void sound() {
//         System.out.println("Dog is barking");
//     }
// }

// public class abstracteg {
//     public static void main(String[] args) {
//         Animal d = new Dog(); 
//         d.sound(); // Calls Dog's sound()
//         d.eat();   // Calls Animal's eat()
//     }
// }


abstract class payment{ 
    abstract void processpayment(double amount);
}
class creditcardpayment extends payment{ 
    @Override
    void processpayment( double amount){
        System.out.println("Payment through credit card: "+amount);
    }
}
class upipayment extends payment{ 
    @Override
    void processpayment(double amount){
        System.out.println("Payment through UPI: "+amount);
    }
}

public class abstracteg{
    public static void main(String[] args) {
        payment p = new upipayment();
        payment c = new creditcardpayment(); 

        p.processpayment(45.2);
        c.processpayment(46.2);

        
    }
}