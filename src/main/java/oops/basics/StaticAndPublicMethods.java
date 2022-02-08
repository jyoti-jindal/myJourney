package oops.basics;

public class StaticAndPublicMethods {
    public static void main(String[] args) {
        myStaticMethod();
        // myPublicMethod(); // This would compile an error
        StaticAndPublicMethods obj = new StaticAndPublicMethods();
        obj.myPublicMethod();
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
