package oops.basics.accessmodifiers;

public class Test {
    public static void main(String[] args) {
        // Constructors
        PublicClass publicClass = new PublicClass();
        PublicClass protectedCons = new PublicClass(19);
        PublicClass defcons = new PublicClass("Jyoti");
//        PublicClass privatecons = new PublicClass("Jyoti",19); Can't be accessed outside of the class.

        // Variables
        System.out.println(publicClass.publicVar);
        System.out.println(publicClass.protectedVar);
        System.out.println(publicClass.defaultVar);
//        System.out.println(publicClass.privateVar); Can't be accessed outside of the class.

        // Methods
        publicClass.publicMethod();
        publicClass.protectedMethod();
        publicClass.defaultMethod();
//        publicClass.privateMethod(); Can't be accessed outside of the class.

        // Constructors
        DefaultClass defaultClass = new DefaultClass();
        DefaultClass protectedDefaultClass = new DefaultClass(19);
        DefaultClass defaultDefaultClass = new DefaultClass("Jyoti");
//        DefaultClass privateDefaultClass = new DefaultClass("Jyoti",19); Can't be accessed outside of the class.

        // Variables
        System.out.println(defaultClass.publicVar);
        defaultClass.protectedVar = 7;
        System.out.println(defaultClass.protectedVar);
        System.out.println(defaultClass.defaultVar);
//        System.out.println(defaultClass.privateVar); Can't be accessed outside of the class.

        // Methods
        defaultClass.publicMethod();
        defaultClass.protectedMethod();
        defaultClass.defaultMethod();
//        defaultClass.privateMethod(); Can't be accessed outside of the class.
    }
}
