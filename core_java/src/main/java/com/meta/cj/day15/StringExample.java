package com.meta.cj.day15;

import java.util.List;

public class StringExample {

    public static void main(String[] args) {
        List<String> mainList = List.of("Krish", "Manoj", "Charan", "Tanvi", "Manoj", "Suresh", "Manoj", "Charan");
        StringBuilder sb = new StringBuilder();

        for(String name: mainList){
            sb.append("<html>")
                    .append("<head>")
                    .append("<title>Welcome to web world</title>")
                    .append("</head>")
                    .append("<body>")
                    .append("<h1>Hello ").append(name).append("</h1>")
                    .append("<p>Welcome to HTML and web world</p>")
                    .append("</body>")
                    .append("</html>");
            System.out.println(sb.toString());
            System.out.println("-".repeat(300));
         }
    }
}
