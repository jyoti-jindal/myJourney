package oops.basics.inheritance.byabstractclass;

import oops.basics.inheritance.byinterface.IVehicle;

public class FordVehicle implements IVehicle {
    protected String brand = "Ford";        // FordVehicle attribute
    boolean hasWheels = false;

    public void honk() {                    // FordVehicle method
        System.out.println("Tuut, tuut!");
    }

    public void display() {
        throw new IllegalArgumentException();
    }
}