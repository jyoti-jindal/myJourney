package oops.basics;

public class Person {
    String firstName = "John";
    String lastName = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println("Name: " + myObj.firstName + " " + myObj.lastName);
        System.out.println("Age: " + myObj.age);
    }
}
