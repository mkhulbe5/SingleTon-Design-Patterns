package com.mohit.singleton;

public class Singleton {

	//using eager intialization
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
		
	}
}
