package oops.basics;

public class Car {
    int modelYear;
    String modelName;

    public Car() {

    }

    // Parameterized Constructor
    public Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public void fullThrottle() {
        System.out.println("Car is going in full speed!!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max Speed of the car is: " + maxSpeed);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.fullThrottle();
        car.speed(180);
        Car car2 = new Car(1969, "Mustang");
        System.out.println(car2.modelYear +  " " + car2.modelName);
    }
}
