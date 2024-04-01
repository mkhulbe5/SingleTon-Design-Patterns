package com.mohit.client;

import com.mohit.singleton.Singleton;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
	}

}
