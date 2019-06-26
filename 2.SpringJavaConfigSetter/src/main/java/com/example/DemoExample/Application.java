package com.example.DemoExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.DemoExample.beans.Writer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(Application.class, args);
		Writer writer=applicationContext.getBean(Writer.class);
		writer.write();
	}

}
