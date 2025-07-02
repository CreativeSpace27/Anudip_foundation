// class student{ 
//     static  String collegename = "PICT";
//     String name;
//     int age; 

//     public student(String name, int age) {
//         this.name = name; 
//         this.age = age;
//     }

//     void display(){
//         System.out.println(collegename);
//         System.out.println(name);
//         System.out.println(age);
//     }

    
// }
// public class staticeg {
//     public static void main(String[] args) {
//         student s1 = new student("piyush", 18); 
//         student s2 = new student("raju", 19); 

//         s1.display();
//         System.out.println("--------------");
//         s2.display();  
//     }
// }


//static methos:

// class mathutil{ 
//     static int square(int x){ 
//         return x*x;
//     }

// }
// public  class staticeg{ 
//     public static void main(String[] args) {
//         System.out.println(mathutil.square(2));
//     }
// }



//static block
class staticeg{
    static {
        System.out.println("hello");
    }  
    public static void main(String[] args) {
        System.out.println("main method called after static block");
    }
}


