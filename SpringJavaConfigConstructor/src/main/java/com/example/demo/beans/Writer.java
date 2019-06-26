package com.example.demo.beans;

import com.example.demo.beans.interfaces.Pen;

public class Writer {
	
	private Pen pen;
	
	public Writer(final Pen pen) {
		this.pen = pen;
	}
	
	public void write() {
		pen.write();
	}

}
