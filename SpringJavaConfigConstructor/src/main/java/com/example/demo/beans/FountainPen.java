package com.example.demo.beans;

import com.example.demo.beans.interfaces.Ink;
import com.example.demo.beans.interfaces.Pen;

public class FountainPen implements Pen {
	
	private Ink ink;
	
	public FountainPen(final Ink ink) {
		this.ink = ink;
	}
	
	public void write() {
		System.out.println("Writing with " + ink.getColor() + 
				" ink of " + ink.getBrandName() + " brand");
	}

}
