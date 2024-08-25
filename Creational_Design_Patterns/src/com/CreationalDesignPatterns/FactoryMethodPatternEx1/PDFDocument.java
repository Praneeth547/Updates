package com.CreationalDesignPatterns.FactoryMethodPatternEx1;

public class PDFDocument implements Document{

	  public void open() {
	        System.out.println("Opening PDF Document");
	    }
	    public void save() {
	        System.out.println("Saving PDF Document");
	    }
}
