import java.util.Scanner;
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Dog {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}
public class methodovrr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an animal:");
            System.out.println("1. Animal");
            System.out.println("2. Dog");
            System.out.println("3. Cat");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Animal animal;
            switch (choice) {
                case 1:
                    animal = new Animal();
                    animal.makeSound();
                    break;
                case 2:
                    animal = new Dog();
                    animal.makeSound();
                    break;
                case 3:
                    animal = new Cat();
                    animal.makeSound();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
