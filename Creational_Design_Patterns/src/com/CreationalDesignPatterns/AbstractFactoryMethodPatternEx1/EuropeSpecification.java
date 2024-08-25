package com.CreationalDesignPatterns.AbstractFactoryMethodPatternEx1;

public class EuropeSpecification implements CarSpecification{
	public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }

}
