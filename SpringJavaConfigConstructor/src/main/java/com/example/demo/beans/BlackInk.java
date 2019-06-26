package com.example.demo.beans;

import com.example.demo.beans.interfaces.Ink;

public class BlackInk implements Ink {

	public String getBrandName() {
		return "Parker";
	}

	public String getColor() {
		return "Black";
	}

}
