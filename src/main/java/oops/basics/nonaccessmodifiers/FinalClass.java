package oops.basics.nonaccessmodifiers;

/**
 * The class cannot be inherited by other classes
 */
public final class FinalClass {
    {
        System.out.println("Final class cannot be inherited by other classes");
    }
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

//class Main extends FordVehicle { ... } Can't extend final class.

class Outer {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        System.out.println(finalClass.brand);
        finalClass.honk();
    }

}