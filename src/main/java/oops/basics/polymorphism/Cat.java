package oops.basics.polymorphism;

public class Cat extends Animal{
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myCat = new Cat();  // Create a Cat object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}