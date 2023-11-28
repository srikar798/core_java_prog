package com.career.springcore.di.javaConfig;

import com.career.common.util.BubbleSort;
import com.career.common.util.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public Printer sonyPrinter(){
        return new SonyPrinter();
    }
    @Bean
    @Primary
    public Printer hpPrinter(){
        return new HpPrinter();
    }

    @Bean
    public Sort sort(){
        return new BubbleSort();
    }

    @Bean
    public PrintService printService(@Qualifier("sonyPrinter")Printer printer){
        PrintService printService = new PrintService();
        printService.setPrinter(printer);
        return printService;
    }
}
