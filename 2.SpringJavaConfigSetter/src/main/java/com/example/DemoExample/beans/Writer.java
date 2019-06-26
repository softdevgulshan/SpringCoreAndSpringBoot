package com.example.DemoExample.beans;

import com.example.DemoExample.beans.interfaces.Pen;

public class Writer {
	
	private Pen pen;
	
	
	
	public Pen getPen() {
		return pen;
	}



	public void setPen(Pen pen) {
		this.pen = pen;
	}



	public void write() {
		pen.write();
	}

}
