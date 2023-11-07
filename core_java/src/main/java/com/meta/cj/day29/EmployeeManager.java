package com.meta.cj.day29;

import lombok.*;

import java.util.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Employee implements Comparable<Employee>{
   private String name;
   private double salary;

    @Override
    public int compareTo(Employee o) {
        int res = Double.compare(o.salary, this.salary);
        if(res == 0){
            res = this.name.compareTo(o.name);
        }
        return res;
    }
}

class EmpSortBySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getSalary(), o1.getSalary());
    }
}

class EmpSortByName implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


public class EmployeeManager
{

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Krishna",1000));
        empList.add(new Employee("Charan",3000));
        empList.add(new Employee("Manoj",2000));
        empList.add((new Employee("Tanvi", 3000)));

        empList.sort(new EmpSortBySalary());
        empList.forEach(System.out::println);
        System.out.println("-".repeat(50));
        Collections.sort(empList,Comparator.comparing(Employee::getName).reversed());
        empList.forEach(System.out::println);

        String[] arr = {"Krish","Manoj","Charan","Tanvi","Anil"};
        List<String> names = Arrays.asList(arr);
        System.out.println(names);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));




    }
}
