package com.meta.cj.day17;


class Student{

    int rollNo;
    String name;
    String email;
    String mobile;

    public Student(int rollNo,String name,String email){
        this.rollNo = rollNo;
        this.email = email;
        this.name = name;
    }
// constructor overloading
    public Student(int rollNo, String name, String email, String mobile) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Srikar", "srikar@gmail.com");

        System.out.println(student1);
    }

}
