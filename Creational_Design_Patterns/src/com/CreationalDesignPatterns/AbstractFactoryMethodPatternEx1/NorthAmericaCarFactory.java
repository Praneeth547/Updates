package com.CreationalDesignPatterns.AbstractFactoryMethodPatternEx1;

public class NorthAmericaCarFactory implements CarFactory{
	public Car createCar() {
        return new Sedan();
    }

    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }

}
