package com.trycoding.designpattern.creational.builder;

public class CarBuilder {
	
	private String name ;
	
	private int model ;
	
	private int engineNum;
	
	private int number ;
	
	private String color ;

	public CarBuilder(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Car build() {
		return new Car(this);
	}

	public String getName() {
		return name;
	}

	public int getModel() {
		return model;
	}

	public int getEngineNum() {
		return engineNum;
	}

	public int getNumber() {
		return number;
	}

	public String getColor() {
		return color;
	}

	public CarBuilder setModel(int model) {
		this.model = model;
		return this;
	}

	public CarBuilder setEngineNum(int engineNum) {
		this.engineNum = engineNum;
		return this;
	}

	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	
	
	
	
	

}
