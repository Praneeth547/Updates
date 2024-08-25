package com.CreationalDesignPatterns.SingletonMethodPatternEx;

public class SingletonEx1 {

private static SingletonEx1 instance;
    
    private SingletonEx1() {}
    
    public static synchronized SingletonEx1 getInstance() {
        if (instance == null) {
            instance = new SingletonEx1();
        }
        return instance;
    }
}
