package com.CreationalDesignPatterns.SingletonMethodPatternEx;

public class SingletonEx3 {
	
	private static SingletonEx3 obj = new SingletonEx3();
    private SingletonEx3() {
    	
    }

    public static SingletonEx3 getInstance() { 
    	
    	return obj; 
    	
    }

}
