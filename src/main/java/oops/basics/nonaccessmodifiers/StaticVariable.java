package oops.basics.nonaccessmodifiers;

public class StaticVariable {

    static int var = 10;
    int x;

    public static void main(String[] args) {
        StaticVariable staticVariable = new StaticVariable();
        staticVariable.m1(10);
//        System.out.println(var);
        var = 5;
//        System.out.println(var);
        StaticVariable staticVariable2 = new StaticVariable();
        staticVariable2.m1(2);
//        x = 0; //error
    }

    public void m1(int arg) {
//        var = arg;
        System.out.println(var);
        var = 9;
        x = 10;
    }

    public static void staticMethod() {

    }

}
