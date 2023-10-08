package com.meta.cj.day14;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Department  = "+department);
        System.out.println("EmpId  = "+empId);
        System.out.println("Ename  = "+eName);
        System.out.println("Salary = "+salary);
        System.out.println("Mobile    = "+mobile);
    }
}
public class AssignmentQuestion {
    public static List<Employees> employeeList = new ArrayList<>();
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


        for(int i=0; i< arr.length;i++){
            String str = arr[i];
            String[] list = str.split("-");
            String department = list[0];
            int empId = Integer.parseInt(list[1]);
            String name = list[2];
            double salary = Double.parseDouble(list[3]);
            String mobile = list[4];

            Employees emp = new Employees(department,empId,name,salary,mobile);
            employeeList.add(emp);
        }

        List<String> emp = getDepartmentNames();
        for(String employee : emp){
            System.out.println(employee);
        }

        List<String> mobileNumbers = getMobileOfEmployees();
        for(String mobiles : mobileNumbers){
            System.out.println(mobiles);
        }

        for(Employees employe : employeeList){
            if(employe.getDepartment().equals("EC")){
                employe.showDetails();
            }
        }


    }

    public static List<String>  getDepartmentNames(){
        List<String> departmentNames = new ArrayList<>();
        for(Employees emp : employeeList){
            if(!departmentNames.contains(emp.getDepartment())){
                departmentNames.add(emp.getDepartment());
            }
        }

        return departmentNames;
    }

    public static List<String> getMobileOfEmployees() {
        List<String> mobileNumbers = new ArrayList<>();
        for (Employees emp : employeeList) {
            mobileNumbers.add(emp.getMobile());
        }
        return mobileNumbers;
    }
}
