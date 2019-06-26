package com.example.DemoExample.beans;

import com.example.DemoExample.beans.interfaces.Ink;
import com.example.DemoExample.beans.interfaces.Pen;

public class FountainPen implements Pen {
	
	private Ink ink;
	
	
	
	public Ink getInk() {
		return ink;
	}



	public void setInk(Ink ink) {
		this.ink = ink;
	}



	public void write() {
		System.out.println("Writing with " + ink.getColor() + 
				" ink of " + ink.getBrandName() + " brand");
	}

}
