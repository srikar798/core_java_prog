package com.meta.cj.day30;

import com.meta.cj.day12.txn.TransactionDetails;
import com.meta.cj.day12.txn.TransactionReaderUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    public static void main(String[] args) {
        List<Employee> employees = getEmployees();

        System.out.println(employees);

        List<EmployeeDto> employeeDtos = getEmployeeDetails(employees);
        employeeDtos.forEach(System.out::println);


        // Find employee name and age

        // Find employee name and experience


    }

    private static List<EmployeeDto> getEmployeeDetails(List<Employee> employees){
        List<EmployeeDto> employeeDtos = new ArrayList<>();

        for(Employee employee: employees){
            String name = employee.getName();
            LocalDate date = LocalDate.now();
            long age = ChronoUnit.YEARS.between(employee.getDob(),date);
            long experience = ChronoUnit.YEARS.between(employee.getDoj(),date);
            EmployeeDto employeeDto1 = new EmployeeDto(name,age,experience);
            employeeDtos.add(employeeDto1);
        }
        return employeeDtos;


    }

    public static List<Employee> getEmployees() {
        // Read the data from employees.csv file and return the list of employees
        List<Employee> employeeList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            File file = new File(TransactionReaderUtil.class.getResource("/employees.csv").getFile());
            List<String> list = Files.readAllLines(file.toPath());
            for(int i =1; i< list.size();i++){
                String data = list.get(i);
                String[] arr = data.split(",");
                long id = Long.parseLong(arr[0]);
                String name = arr[1];
                LocalDate doj = LocalDate.parse(arr[2], formatter);
                LocalDate dob = LocalDate.parse(arr[3], formatter);
                Employee emp = new Employee(id,name,doj,dob);
                employeeList.add(emp);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
