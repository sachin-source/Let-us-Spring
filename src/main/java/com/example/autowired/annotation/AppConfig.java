package com.example.autowired.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Instructing the spring to refer below defined package for all the materials
@ComponentScan(basePackages = "com.example.autowired.annotation") // This is to define the package
public class AppConfig {
}
