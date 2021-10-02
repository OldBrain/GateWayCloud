package ru.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StartGateWayServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(StartGateWayServiceApp.class, args);
    }
}
