package com.FlyWeight.Ex2;

// FlyWeight
public class Color {
	 private String name;
	    private String hexCode;

	    public Color(String name, String hexCode) {
	        this.name = name;
	        this.hexCode = hexCode;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getHexCode() {
	        return hexCode;
	    }
}
