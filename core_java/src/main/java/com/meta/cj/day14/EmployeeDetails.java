package com.meta.cj.day14;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int empno;
    private String name;
    private double salary;

    public Employee(int empno, String name, double salary) {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
public class EmployeeDetails {

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee(1001,"Krish",45000),
                new Employee(1002,"Manoj",55000),
                new Employee(1003,"Charan",65000),
                new Employee(1004,"Manish",75000),
                new Employee(1005,"Tanvi",85000),
                new Employee(1006,"Sai",95000)
        );

        String empIds = getEmployeeIdsSalaryGte(employeeList,75000);
        System.out.println(empIds);
        }

        private static String getEmployeeIdsSalaryGte(List<Employee> employeeList, double salary) {
            List<String> idList = new ArrayList<>();
            for(Employee employee : employeeList){
                if(employee.getSalary() > salary){
                    idList.add(""+employee.getEmpno());
                }
                }
            return String.join(",",idList);
    }



}
