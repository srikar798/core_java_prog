package com.meta.cj.day15;

enum Gender{
    M,F;
}
class Employee{
    private int empno;
    private  String name;
    private Gender gender;
    private double salary;

    public Employee(int empno, String name, Gender gender, double salary) {
        this.empno = empno;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
}

enum TShirtSize{
    S(38),M(40),L(42),XL(44),XXL(46);

    private int size;
    TShirtSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
public class EnumExamples {
    public static void main(String[] args) {

        Employee emp = new Employee(1001,"Manoj",Gender.M,50000);

        for(TShirtSize tShirtSize: TShirtSize.values()){
            System.out.println(tShirtSize + " : " + tShirtSize.getSize());
        }
    }

}
