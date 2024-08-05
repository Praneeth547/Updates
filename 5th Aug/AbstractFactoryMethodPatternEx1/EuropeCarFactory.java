package com.CreationalDesignPatterns.AbstractFactoryMethodPatternEx1;

public class EuropeCarFactory implements CarFactory{

	public Car createCar() {
        return new Hatchback();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
