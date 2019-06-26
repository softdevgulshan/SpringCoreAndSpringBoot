package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.beans.BlackInk;
import com.example.demo.beans.FountainPen;
import com.example.demo.beans.Writer;
import com.example.demo.beans.interfaces.Ink;
import com.example.demo.beans.interfaces.Pen;

@Configuration
public class SpringConfig {

	@Bean
	public Writer writer(Pen pen) {
		return new Writer(pen);
	}
	
	@Bean
	public Pen fountainPen(Ink ink) {
		return new FountainPen(ink);
	}
	
	@Bean
	public Ink blackInk() {
		return new BlackInk();
	}
}
