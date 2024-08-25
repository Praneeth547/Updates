package com.CreationalDesignPatterns.PrototypePatternEx;

public interface Shape extends Cloneable{
	Shape clone();
    void draw();
}
