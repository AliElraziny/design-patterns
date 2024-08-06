package com.trycoding.designpattern.creational.builder;

public class BuilderPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sandwitch cheeseSandwitch = new SandwitchBuilder("Crwason", "cheese")
												.setHasTomato(false)
												.build();
		
		SandwitchBuilder burgerSandwitchBuild = new SandwitchBuilder("Crwason", "cheese")
														.setHasTomato(false);
		
		Sandwitch burgerSandwitch = new SandwitchBuilder("Crwason", "cheese")
											.setHasTomato(false)
											.build();
		
		Pizza pizza = new Pizza.PizzaBuilder("cheese", "medium").build();
		
		
		CarBuilder carBuilder = new CarBuilder("Fiat", 123);
		Car car = new Car(carBuilder);
		
		
		Car bmCar = new CarBuilder("BMW",155)
						.setColor("yellow")
						.setEngineNum(144).build();
		
		
		System.out.println(cheeseSandwitch);
		System.out.println(burgerSandwitch);
		System.out.println(car);
		System.out.println(bmCar);
		
		
		

	}

}
