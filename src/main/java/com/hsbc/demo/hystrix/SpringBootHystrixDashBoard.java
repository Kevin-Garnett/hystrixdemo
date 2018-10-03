package com.hsbc.demo.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringBootHystrixDashBoard {

    public static void main(String[]args){
        SpringApplication.run(SpringBootHystrixDashBoard.class);
    }

}
