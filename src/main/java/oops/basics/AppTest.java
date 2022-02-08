package oops.basics;

import oops.basics.encapsulation.Student;

public class AppTest {
    public static void main(String[] args) {
        Student student = new Student("Jyoti", 1, null);
//        student.name = "John";  // error name has private access in Student
//        System.out.println(student.name); // error
        student.setPhoneNumber("9876543210");
        System.out.println(student.getRollNumber() + " " + student.getName() + " - " + student.getPhoneNumber());
    }
}
