package oops.basics.nonaccessmodifiers;

public abstract class AbstractClass {
    {
        System.out.println("Abstract class cannot be used to create objects (To access an abstract class, it must be inherited from another class.");
    }
    public String fname = "John";
    public String lname = "Doe";
    public String email = "john@doe.com";
    public int age = 24;

    public abstract void study(); // abstract method

    public void fullName() {
        System.out.println(fname + " " + lname);
    }
}

// Subclass (inherit from Person)
class SubClass extends AbstractClass {
    public int graduationYear = 2018;

    public void study() {
        System.out.println("Studying all day long");
    }

    public void run() {
        System.out.println("I can run!!");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.fname + " " +
                subClass.lname);
        System.out.println(subClass.email);
        System.out.println(subClass.age);
        System.out.println(subClass.graduationYear);
        subClass.fullName();
        subClass.study();
        subClass.run();

        AbstractClass abstractClass = new SubClass();
        System.out.println(abstractClass.fname + " " +
                subClass.lname);
        System.out.println(abstractClass.email);
        System.out.println(abstractClass.age);
        System.out.println(((SubClass) abstractClass).graduationYear);
        abstractClass.fullName();
        abstractClass.study();
        ((SubClass) abstractClass).run();
    }
}