package com.trycoding.designpattern.creational.builder;

public class Car {
	
	
	private String name ;
	
	private int model ;
	
	private int engineNum;
	
	private int number ;
	
	private String color ;

	public Car(CarBuilder carBuilder ) {
		this.name = carBuilder.getName();
		this.model=carBuilder.getModel();
		this.engineNum=carBuilder.getEngineNum();
		this.number=carBuilder.getNumber();
		this.color=carBuilder.getColor();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", engineNum=" + engineNum + ", number=" + number + ", color="
				+ color + "]";
	}
	
	
	
	
	
	
	
	
	

}
