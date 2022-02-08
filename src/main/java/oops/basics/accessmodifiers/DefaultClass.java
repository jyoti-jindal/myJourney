package oops.basics.accessmodifiers;

class DefaultClass {
    public String publicVar = "John";
    protected int protectedVar = 24;
    String defaultVar = "Doe";
    private String privateVar = "john@doe.com";

    public DefaultClass() {

    }

    protected DefaultClass(int protectedVar) {
        this.protectedVar = protectedVar;
    }

    DefaultClass(String defaultVar) {
        this.defaultVar = defaultVar;
    }

    private DefaultClass(String privateVar, int x) {
        this.privateVar = privateVar;
    }

    public static void main(String[] args) {
        System.out.println("This class is defined with Default Access Modifier.");
        DefaultClass defaultClass = new DefaultClass();
        DefaultClass protectedCons = new DefaultClass(19);
        DefaultClass defCons = new DefaultClass("Jyoti");
        DefaultClass privateCons = new DefaultClass("Jyoti",19);
        System.out.println(defaultClass.publicVar);
        System.out.println(defaultClass.protectedVar);
        System.out.println(defaultClass.defaultVar);
        System.out.println(defaultClass.privateVar);
        defaultClass.publicMethod();
        defaultClass.protectedMethod();
        defaultClass.defaultMethod();
        defaultClass.privateMethod();
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
