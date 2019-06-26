package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.beans.Writer;

@SpringBootApplication
public class SpringJavaConfigConstructorApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJavaConfigConstructorApplication.class, args);
		Writer writer = context.getBean(Writer.class);
		//Writer writer = (Writer) context.getBean("writer");
		writer.write();
	}

}
