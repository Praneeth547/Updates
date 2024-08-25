package com.CreationalDesignPatterns.SingletonMethodPatternEx;

public class SingletonEx2 {
	
private static SingletonEx2 instance;
    
    private SingletonEx2() {}
    
    public static synchronized SingletonEx2 getInstance() {
        if (instance == null) {
            instance = new SingletonEx2();
        }
        return instance;
    }
}
