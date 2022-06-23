package oops.basics.enums;

public class Registration {
    enum Status {
        ACTIVE,
        CANCELLED
    }
}

class Main {
    public static void main(String[] args) {
        Registration.Status status = Registration.Status.ACTIVE;
        print(status);

    }

    public static void print(Registration.Status status) {
        switch (status) {
            case ACTIVE:
                System.out.println("Hi");
                break;
            default:
                System.out.print("bye");
        }
    }
}