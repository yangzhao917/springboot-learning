package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 引导类，启动 Spring Boot项目的入口
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        // 启动方法
        SpringApplication.run(App.class, args);
    }
}