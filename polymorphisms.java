
// //Compile time polymorphism

// class student{ 
//     String name; 
//     int age; 

//     void printinfo(String name, int age){ 
//         System.out.println("Name: "+name);
//         System.out.println("Age: "+age);

//     }
//     void printinfo(int age){ 
//         System.out.println("age : "+age);
//     }
//     void printinfo(String name){ 
//         System.out.println("Name : "+name);
//     }
// }

// public class polymorphism { 
//     public static void main(String[] args) {
//         student s1 = new student(); 
//         s1.printinfo("Piyush", 18);
//         s1.printinfo(18);    
//         s1.printinfo("piyush");    
//     }
// }


//Runtime polymorphism

class animal{ 
    void sound(){ 
        System.out.println("Animal is sounding");
    }
}
class dog extends animal{ 
    @Override
    void sound(){ 
        System.out.println("Dog Barks");
    }
}
public class polymorphisms { 
    public static void main(String[] args) {
       dog d = new dog();
       d.sound();
    }
}