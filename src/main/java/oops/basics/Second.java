package oops.basics;

public class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x); // 5
        System.out.println(myObj.y); // 0, default value
        System.out.println(myObj.z); // 18
        myObj.x= 3;
        System.out.println(myObj.x); // 3
        myObj.y = 9;
        System.out.println(myObj.y); // 9
        // myObj.z = 7; // will generate an error: cannot assign a value to a final variable


        Car car = new Car();
        car.fullThrottle();
        car.speed(200);
    }
}
