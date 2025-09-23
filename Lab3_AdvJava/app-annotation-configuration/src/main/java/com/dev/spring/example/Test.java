package com.dev.spring.example;
 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
import org.springframework.context.*; 
 
 
public class Test { 
 
public static void main(String[] args) { 
 
   ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml"); 
   Book book = ctx.getBean(Book.class); 
   book.setId(95468); 
   book.setName("Spring In Action"); 
   System.out.println(book); 
   } 
}