package com.FlyWeight.Ex2;

public class Main {

	public static void main(String[] args) {
		
		  Color red = ColorFactory.getColor("Red", "#FF0000");
	        Color blue = ColorFactory.getColor("Blue", "#0000FF");
	        Color redAgain = ColorFactory.getColor("Red", "#FF0000");

	        System.out.println(red == redAgain); // true

	}

}
