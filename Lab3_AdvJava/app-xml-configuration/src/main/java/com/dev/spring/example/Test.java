package com.dev.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext; 
import org.springframework.context.*; 
public class Test { 
public static void main(String[] args) { 
ApplicationContext ctx= new ClassPathXmlApplicationContext("confix.xml"); 
Book book = ctx.getBean(Book.class); 
System.out.println(book); 
} 
} 