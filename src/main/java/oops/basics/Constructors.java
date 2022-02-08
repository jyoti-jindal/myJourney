package oops.basics;

public class Constructors {
    int x = 9;
    final int y;
    public Constructors() {
        this.x = 5;
        this.y = 10;
    }
    public Constructors(int y) {
        this.x = y;
        this.y = 10;
    }

    public static void main(String[] args) {
        Constructors constructors1 = new Constructors();
        System.out.println(constructors1.x);
        System.out.println(constructors1.y);
        Constructors constructors2 = new Constructors(15);
        System.out.println(constructors2.x);
        System.out.println(constructors2.y);
    }
}
