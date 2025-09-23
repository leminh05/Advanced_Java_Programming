package com.dev.spring.example.app_xml_configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.dev.spring.example.Book;

@SpringBootApplication
public class AppXmlConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppXmlConfigurationApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			Book book = ctx.getBean(Book.class);
			System.out.println(book);
		};
	}
}
