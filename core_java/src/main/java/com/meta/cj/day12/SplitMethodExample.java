package com.meta.cj.day12;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int empno;
    private String ename;
    private double salary;
    private String job;
    public Employee(int empno, String ename, double salary, String job) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        this.job = job;
    }
    public void showDetails(){
        System.out.println("Empno  = "+empno);
        System.out.println("Ename  = "+ename);
        System.out.println("Salary = "+salary);
        System.out.println("Job    = "+job);
    }
}
public class SplitMethodExample {

    public static void main(String[] args) {
        String data = "1001,Krish,Manager,50000-1002,Manoj,Developer,40000-1003,Charan,Developer,40000-1004,Praveen,Tester,30000";
        String[] arr = data.split("-");
        List<Employee> employees = new ArrayList<>();
        for(String ele:arr){
            String[] empData = ele.split(",");
            int empno = Integer.parseInt(empData[0]);
            String ename = empData[1];
            String job = empData[2];
            double salary = Double.parseDouble(empData[3]);
            Employee emp = new Employee(empno, ename, salary, job);
            employees.add(emp);
        }
        for(Employee emp:employees){
            emp.showDetails();
            System.out.println("--------------------");
        }
    }
}
