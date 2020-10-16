package com.carrot.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages="com.carrot.train")
public class SeventhweekSpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeventhweekSpringbootTestApplication.class, args);
    }

}
