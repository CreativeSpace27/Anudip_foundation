public class constructor {
    String name; 
    int age;

    // default const
     constructor() {
        System.out.println("Constructor has called");
    }

    //parametrize const
    constructor(String name, int age) {
        this.name = name; 
        this.age = age;
    }


    //copy const
    constructor(constructor c){ 
        this.name = c.name;
        this.age = c.age;
    }

    

    public static void main(String[] args) {
        constructor c1 = new constructor(); //default
        constructor c2 = new constructor("Piyush", 18); //parametrize  
        System.out.println("Name: "+c2.name);
        System.out.println("Age: "+c2.age);

        constructor c3 = new constructor(c2); //copy
        System.out.println(c3.name +" - "+  c3.age);
    }
}
