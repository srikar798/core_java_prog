package com.meta.cj.day16;

import static java.lang.Math.*;
import static java.lang.System.out;



    class Student {
        private long regNo;
        private String name;
        private int std;
        private final static String schoolName = "ABC School";

        public Student(long regNo, String name, int std) {
            this.regNo = regNo;
            this.name = name;
            this.std = std;
        }

        public void showDetails() {
            out.println("RegNo : " + regNo);
            out.println("Name : " + name);
            out.println("Std : " + std);
            out.println("School Name : " + schoolName);
        }
    }

public class StaticKeywordUsage {
    static {
        out.println("This is static block 1");
    }

    public static void main(String[] args) {
        out.println(PI);
        out.println(sqrt(23));
        out.println(pow(2,3));
        out.println(random());

        GenericUtil.m1();
        GenericUtil.m2();

        Student s1 = new Student(1001,"Srikar",10);
        Student s2 = new Student(1002,"Sai",10);
        Student s3 = new Student(1001,"Tanvi",6);

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
    static {
        out.println("This is static block 2");
    }
    static {
        out.println("This is static block 3");
    }

}
