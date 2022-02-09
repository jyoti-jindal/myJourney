package oops.basics.encapsulation;

public class Student {
    private String name;
    private Integer rollNumber;
    private String phoneNumber;

    public Student(String name, int rollNumber, String phoneNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}