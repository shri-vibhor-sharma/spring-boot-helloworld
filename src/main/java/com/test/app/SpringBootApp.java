package com.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp 
{
     public static void main(String[] args) 
     {
         SpringApplication.run(SpringBootApp.class, args);
         System.out.println("It's working now..!!");
     }
}