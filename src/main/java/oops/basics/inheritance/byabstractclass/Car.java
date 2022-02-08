package oops.basics.inheritance.byabstractclass;

public class Car extends FordVehicle {
    private String modelName = "Mustang";    // Car attribute

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the FordVehicle class) on the myCar object
        myCar.honk();
        System.out.println(myCar.hasWheels);

        // Display the value of the brand attribute (from the FordVehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
