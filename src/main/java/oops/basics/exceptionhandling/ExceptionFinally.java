package oops.basics.exceptionhandling;

public class ExceptionFinally {
    public static void main(String[] args) {

        double x = 22.9d;
        System.out.println(Math.round(x));
        ExceptionFinally exceptionFinally = new ExceptionFinally();
        try {
            System.out.println(exceptionFinally.divide(10, 0));
        } catch (Exception ex) {
            System.out.print("Division by 0!");
        }

    }

    public Integer divide(int a, int b) {
        try {
            return a / b;
        } finally {
            System.out.print("finally");
        }

    }

}
