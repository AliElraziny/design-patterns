package com.trycoding.designpattern.creational.factory;

public class Factory {
	
	public static final int BURGER_SANDWITCH = 1 ;
	public static final int CHEESE_SANDWITCH = 2 ;
	
	public static Sandwitch prepareSandwitch(int sandwitchKind ) {
		
		
		switch(sandwitchKind) {
			case 1 :
				return new BurgerSandwitch();
			case 2 :
				return new CheeseSandwitch();
			default:
				return new Sandwitch();
		
		
		}
		
		
		
		
	}

}
