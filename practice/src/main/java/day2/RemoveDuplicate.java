package day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "Java";

        Set<Character> charSet = new LinkedHashSet<>();
        char[] input = str.toCharArray();

        for(char data: input ){
            charSet.add(data);
        }
        StringBuilder result = new StringBuilder();
        for(char c : charSet){
            result.append(c);
        }
        System.out.println(result);
    }
}
