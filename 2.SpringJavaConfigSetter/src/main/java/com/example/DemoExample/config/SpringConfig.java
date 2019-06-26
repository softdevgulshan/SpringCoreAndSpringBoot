package com.example.DemoExample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.DemoExample.beans.BlackInk;
import com.example.DemoExample.beans.FountainPen;
import com.example.DemoExample.beans.Writer;
import com.example.DemoExample.beans.interfaces.Ink;
import com.example.DemoExample.beans.interfaces.Pen;

@Configuration
public class SpringConfig {

	@Bean
	public Writer writer(Pen pen) {
		Writer writer = new Writer();
		writer.setPen(pen);
		return writer;
	}
	
	@Bean
	public Pen fountainPen(Ink ink) {
		FountainPen fountainPen = new FountainPen();
		fountainPen.setInk(ink);
		return fountainPen;
		
	}
	
	@Bean
	public Ink blackInk() {
		return new BlackInk();
	}
}
