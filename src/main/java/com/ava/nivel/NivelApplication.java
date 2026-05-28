package com.ava.nivel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ava.nivel")
public class NivelApplication {

    public static void main(String[] args) {
        SpringApplication.run(NivelApplication.class, args);
    }

}
