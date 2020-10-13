package com.carrot.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SeventhweekSpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeventhweekSpringbootTestApplication.class, args);
    }

}
