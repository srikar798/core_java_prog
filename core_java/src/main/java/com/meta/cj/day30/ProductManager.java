package com.meta.cj.day30;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.*;

public class ProductManager {
    @SneakyThrows
    public static void main(String[] args) {
        Student student = init(ProductManager.class.getResourceAsStream("/student.properties"),Student.class);
        System.out.println(student);
        Product product = init(ProductManager.class.getResourceAsStream("/product.properties"),Product.class);
        System.out.println(product);
        ObjectMapper obj = new ObjectMapper();
        Student student1 = obj.readValue(ProductManager.class.getResourceAsStream("/student.json"),Student.class);
        System.out.println(student1);
    }

    private static <T> T init(InputStream is, Class<T> typeRef){
        Properties props1 = new Properties();
        Properties props2 = new Properties();
        Object type = null;
        try {
            //props1.load(ProductManager.class.getResourceAsStream("/app.properties"));
            props2.load(is);
            Class<?> cls = Class.forName(typeRef.getName());
            type = cls.getConstructors()[0].newInstance();
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields){
                field.setAccessible(true);
                String name = field.getName();
                String value = props2.getProperty(name);
                if(field.getType().getName().equals("double")){
                    field.set(type,Double.parseDouble(value));
                }else if(field.getType().getName().equals("int")){
                    field.set(type,Integer.parseInt(value));
                }else{
                    field.set(type,value);
                }
                field.setAccessible(false);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)type;

    }
}
