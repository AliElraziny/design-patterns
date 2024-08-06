package com.trycoding.designpattern.creational.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sandwitch sandwitch = Factory.prepareSandwitch(Factory.CHEESE_SANDWITCH);
		
		Sandwitch sandwitch1 = Factory.prepareSandwitch(Factory.CHEESE_SANDWITCH);
		sandwitch.prepareSandwitch();
		
		System.out.println(sandwitch.hashCode());
		System.out.println(sandwitch1.hashCode());
		System.out.println(sandwitch.equals(sandwitch1));
		
		
	}

}
