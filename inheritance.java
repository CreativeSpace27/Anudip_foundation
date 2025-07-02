// class parent{ 
//      void display0(){
//         System.out.println("Inheritance ");
//      }
// }
// class child extends parent{
//     void display(){
//         System.out.println("derived  class");
//     }
// }
// class childs extends child{
//     void show(){
//         System.out.println("multilevel inheritance");
//     }
// }
//hirarchical inheritance
class shape{
    void display1(){ 
        System.out.println("hirarchical inheritance");
    }
}
class traingle extends shape{ 
    void display2(){ 
        System.out.println("hirarchical inheritance");
    }
}
class eqtraingle extends shape  {
    void display3(){ 
        System.out.println("hirarchical inheritance");
    }
}
//-----------------------------

public class inheritance {

    public static void main(String[] args) { 
        // childs p1 = new childs();
        // p1.display0();
        // p1.display();
        // p1.show();

        System.out.println("------Hirerchical inheritance-----");
        eqtraingle e = new eqtraingle(); 
        e.display3();
    }
}


