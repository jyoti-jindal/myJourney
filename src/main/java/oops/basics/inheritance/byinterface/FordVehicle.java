package oops.basics.inheritance.byinterface;

public class FordVehicle implements IVehicle {
    protected String brand = "Ford";        // FordVehicle attribute
    boolean hasWheels = true;
    FordVehicle() {}
    FordVehicle(String brand) {
        this.brand = brand;
    }
    public void honk() {                    // FordVehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Main {
    public static void main(String[] args) {
        IVehicle iVehicle = new FordVehicle("Ford");
        iVehicle.honk();
        // Create a myVehicle object
        FordVehicle myVehicle = new FordVehicle();
        // Call the honk() method from the FordVehicle class on the myCar object
        myVehicle.honk();

        // Display the value of the brand attribute from the FordVehicle class
        System.out.println(myVehicle.brand);
    }
}