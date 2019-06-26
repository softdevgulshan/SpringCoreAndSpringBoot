package com.example.DemoExample.beans;

import com.example.DemoExample.beans.interfaces.Ink;

public class BlackInk implements Ink {

	public String getBrandName() {
		return "Parker";
	}

	public String getColor() {
		return "Black";
	}
}
