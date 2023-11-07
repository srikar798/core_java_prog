package com.meta.cj.day21;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Account{
    private int accno;
    private String name;
    private double balance;

}
public class JsonManager {
    @SneakyThrows
    public static void main(String[] args) {
        String jsonStr = """
                {
                    "accno":1001,
                    "name":"Krish",
                    "balance": 10000.0
                
                }
                """;
        String jsonAccountsStr = """
                [
                {
                    "accno":1002,
                    "name":"Krishna",
                    "balance": 20000.0
                
                },
                {
                    "accno":1003,
                    "name":"Charan",
                    "balance": 30000.0
                
                }
                ]
                """;
        ObjectMapper objMapper = new ObjectMapper();
        Account acc = objMapper.readValue(jsonStr,Account.class);
        System.out.println(acc);

        String json = objMapper.writeValueAsString(acc);
        System.out.println(json);

        List<Account> accountList = objMapper.readValue(jsonAccountsStr, new TypeReference<>() {});
        System.out.println(accountList);
    }

}
