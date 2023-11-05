package com.meta.cj.day28;

import com.meta.cj.day21.iplstats.JsonUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample4 {

    public static void main(String[] args) {
        String data = "Java,Python,Python,.Net,Java,Angular,Java,.Net,Java,Angular";

        String[] words = data.split(",");


        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Integer> wordCount1 = new HashMap<>();

        for (String word : words) {
            wordCount.putIfAbsent(word, 0);
            int count = wordCount.get(word);
            count++;
            wordCount.put(word,count);
        }

        System.out.println(wordCount);

        System.out.println("-".repeat(60));

        for(String word: words){
            int count = wordCount1.getOrDefault(word,0);
            count++;
            wordCount1.put(word,count);
        }
        System.out.println(wordCount1);

        Map<String, Long> map = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }
}

