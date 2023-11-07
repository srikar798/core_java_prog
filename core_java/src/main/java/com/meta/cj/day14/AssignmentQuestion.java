package com.meta.cj.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employees{

    private String department;
    private int empId;
    private String eName;
    private double salary;
    private String mobile;

    public Employees(String department, int empId, String eName, double salary, String mobile) {
        this.department = department;
        this.empId = empId;
        this.eName = eName;
        this.salary = salary;
        this.mobile = mobile;
    }

    public String getDepartment() {
        return department;
    }

    public int getEmpId() {
        return empId;
    }

    public String geteName() {
        return eName;
    }

    public double getSalary() {
        return salary;
    }

    public String getMobile() {
        return mobile;
    }
    public void showDetails(){
        System.out.print("  Dept   = "+department);
        System.out.print("  EmpId  = "+empId);
        System.out.print("  Salary = "+salary);
        System.out.print("  Mobile = "+mobile);
        System.out.print("  Ename  = "+eName);
    }
}
public class AssignmentQuestion {

    private static List<Employees> employeeList = new ArrayList<>();

    public static void main(String[] args) {


            String data = "CS-1001-Manoj-55000-9876543210," +
                    "CS-1002-Rajesh-45000-9876543211," +
                    "CS-1003-Suresh-65000-9876543212," +
                    "CS-1004-Ramesh-75000-9876543213," +
                    "IS-1005-Suresh-55000-9876543214," +
                    "EC-1006-Ramesh-45000-9876543215," +
                    "IS-1007-Manoj-65000-9876543216," +
                    "EC-1008-Ramesh-75000-9876543217," +
                    "EC-1009-Jayesh-55000-9876543218," +
                    "EC-1010-Rani-45000-9876543219";

            String[] arr = data.split(",");


            for (int i = 0; i < arr.length; i++) {
                String str = arr[i];
                String[] list = str.split("-");
                String department = list[0];
                int empId = Integer.parseInt(list[1]);
                String name = list[2];
                double salary = Double.parseDouble(list[3]);
                String mobile = list[4];

                Employees emp = new Employees(department, empId, name, salary, mobile);
                employeeList.add(emp);
            }
            Scanner sc = new Scanner(System.in);
            while(true) {
                System.out.println("""
                        1. Get All Department Names
                        2. Get ALl Mobile Numbers of Employee
                        3. Get Employees details of EC Department
                        4. Exit
                        Enter your choice(1-4):""");
                int N = sc.nextInt();

                System.out.println("-".repeat(30));
                switch (N) {

                    case 1 -> getDepartmentNames();
                    case 2 -> getMobileOfEmployees();
                    case 3 -> getEcDepartmentEmplyees();
                    case 4 -> System.exit(0);
                    default -> System.out.println("Invalid choice");

                }
                System.out.println("-".repeat(30));
            }

    }

    private static void getEcDepartmentEmplyees(){
        for(Employees employe : employeeList){
            if(employe.getDepartment().equals("EC")){
                employe.showDetails();
                System.out.println("");
            }

        }
    }
    private static void  getDepartmentNames(){
        List<String> departmentNames = new ArrayList<>();
        for(Employees emp : employeeList){
            if(!departmentNames.contains(emp.getDepartment())){
                departmentNames.add(emp.getDepartment());
            }
        }
        for(String employee : departmentNames){
            System.out.println(employee);
        }
    }

    private static void getMobileOfEmployees() {
        List<String> mobileNumbers = new ArrayList<>();
        for (Employees emp : employeeList) {
            mobileNumbers.add(emp.getMobile());
        }
        for(String mobiles : mobileNumbers){
            System.out.println(mobiles);
        }
    }
}
