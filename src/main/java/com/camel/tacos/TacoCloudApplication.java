package com.camel.tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {

    public static void main(final String[] args) {
        System.out.println(TacoCloudApplication.class.getResource("/").toString());
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}
