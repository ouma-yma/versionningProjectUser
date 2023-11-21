package com.example.userprojectversionningmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients

@SpringBootApplication
public class UserProjectVersionningMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProjectVersionningMicroApplication.class, args);
    }

}
