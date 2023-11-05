package com.meta.cj.day24;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

class MyOwnResource implements Closeable{
    public void close() throws IOException{
        System.out.println("Closing the resource");
    }

    public void showInfo(){
        System.out.println("JDK version : "+ Runtime.version() + " \n OS :" + System.getProperty("os.name"));
    }
}
public class CheckedExceptionExample {

    public static void main(String[] args) {

       // readDataFromFile();
       // showFileContent();

        showFileContentWithResourceHandle();

    }

    public static void readDataFromFile(){

        try {
            List<String> list =  Files.readAllLines(Paths.get(new File(CheckedExceptionExample.class.getResource("/product.csv").getFile()).getAbsolutePath()));
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true){
            System.out.println("Enter number 1: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("Enter number 2: ");
            int b = sc.nextInt();
            System.out.println("Enter a operator: ");
            String ope = sc.next();
            try {
                int result = result(a, b, ope);
                System.out.println(result);
            }catch (ArithmeticException e){
                e.printStackTrace();
            }
            System.out.println("Do you want to continue? (yes/no)");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("no")){
                break;
            }
        }
    }

    public static void showFileContentWithResourceHandle() {
        try (
                FileReader fr = new FileReader(CheckedExceptionExample.class.getResource("/product.csv").getFile());
                BufferedReader br = new BufferedReader(fr);
                MyOwnResource myOwnResource = new MyOwnResource();
        ) {
            myOwnResource.showInfo();
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("After while loop");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }
    }
    public static void showFileContent(){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(new File(CheckedExceptionExample.class.getResource("/product.csv").getFile()));
            br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally block");
            try{
                if(fr != null){
                    fr.close();
                }if(br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static int result(int a , int b, String ope){
        int res = switch(ope){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if(b == 0){
                    throw new ArithmeticException("Denominator should not be Zero");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid Operation");
        };
        return res;
    }


}
