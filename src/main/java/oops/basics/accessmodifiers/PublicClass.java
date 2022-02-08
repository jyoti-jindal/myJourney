package oops.basics.accessmodifiers;

public class PublicClass {
    public String publicVar = "John";
    protected int protectedVar = 24;
    String defaultVar = "Doe";
    private String privateVar = "john@doe.com";

    public PublicClass() {

    }

    protected PublicClass(int protectedVar) {
        this.protectedVar = protectedVar;
    }

    PublicClass(String defaultVar) {
        this.defaultVar = defaultVar;
    }

    private PublicClass(String privateVar, int x) {
        this.privateVar = privateVar;
    }

    public static void main(String[] args) {
        // The class is accessible by any other class.
        System.out.println("This class is defined with Public Access Modifier.");
        PublicClass publicClass = new PublicClass();
        PublicClass protectedCons = new PublicClass(19);
        PublicClass defCons = new PublicClass("Jyoti");
        PublicClass privateCons = new PublicClass("Jyoti",19);
        System.out.println(publicClass.publicVar);
        System.out.println(publicClass.protectedVar);
        System.out.println(publicClass.defaultVar);
        System.out.println(publicClass.privateVar);
        publicClass.publicMethod();
        publicClass.protectedMethod();
        publicClass.defaultMethod();
        publicClass.privateMethod();
    }

    public void publicMethod() {
        System.out.println("I am a public Method");
    }

    protected void protectedMethod() {
        System.out.println("I am a protected Method");
    }

    void defaultMethod() {
        System.out.println("I am a default Method");
    }

    private void privateMethod() {
        System.out.println("I am a private Method");
    }
}
