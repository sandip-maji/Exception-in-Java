package com.org;

public class SingletonClass {
	
	private static SingletonClass singletonClassObject = null;
	
	static {
		singletonClassObject = new SingletonClass();
	}
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance(){
        return singletonClassObject;
    }
     
    public void checkMe(){
        System.out.println("Hey.... it is working!!!");
    }

}
