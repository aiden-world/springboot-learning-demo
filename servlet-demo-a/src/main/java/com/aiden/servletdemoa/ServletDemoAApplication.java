package com.aiden.servletdemoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ServletDemoAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletDemoAApplication.class, args);
    }

}
