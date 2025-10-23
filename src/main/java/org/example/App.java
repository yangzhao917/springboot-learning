package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * 引导类，启动 Spring Boot项目的入口
 * @author yangzhao
 */
@SpringBootApplication
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // 启动方法
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        ConfigurableEnvironment env = run.getEnvironment();

        App.log.info(
                String.format("appName: %s, appTitle: %s, appDescription: %s, appVersion: %s, Author: %s",
                        env.getProperty("spring.application.name"),
                        env.getProperty("app.title"),
                        env.getProperty("app.description"),
                        env.getProperty("app.version"),
                        env.getProperty("app.author")
                )
        );
    }
}