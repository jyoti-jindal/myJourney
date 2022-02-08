package oops.basics;

public class Main {
    int x = 5;
    int y;
    final int z = 18; // can't be modified, requires to be initialized here, or in block or constructor.
    public static void main(String[] args) {
        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        System.out.println(myObj1.x);
        myObj1.x = 10;
        myObj2.x = 15;
        System.out.println(myObj2.x);
        //myObj1.z = 7; // will generate an error: cannot assign a value to a final variable
        myMethod(); // Hello World!
    }

    static void myMethod() {
        System.out.println("Hello World!");
    }
}
