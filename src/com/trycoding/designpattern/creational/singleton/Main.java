package com.trycoding.designpattern.creational.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton Design pattern Test
		Singleton obj  = Singleton.getSingleton();
		obj.print(40);
		  obj.printInteger(10);
		Integer val = new Integer(10);
		Singleton obj1  = Singleton.getSingleton();
		obj.print(40);
		obj.printInteger(val);
		System.out.println(val);
		
		System.out.println("hello");
		
		///////////////////////////////////////////////////
		
		
		

	}

}
