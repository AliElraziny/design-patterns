package com.trycoding.designpattern.creational.builder;

public class SandwitchBuilder {
	
	private String bread;
	private String filling ;
	private String sauce;
	private boolean hasTomato;
	
	
	
	public SandwitchBuilder(String bread, String filling) {
		this.bread = bread;
		this.filling = filling;
	}
	public SandwitchBuilder setSauce(String sauce) {
		this.sauce = sauce;
		return this ;
	}
	public SandwitchBuilder setHasTomato(boolean hasTomato) {
		this.hasTomato = hasTomato;
		return this ;
	}
	
	public Sandwitch build() {
		
		Sandwitch sandwich= new Sandwitch();
		sandwich.setBread(bread);
		sandwich.setFilling(filling);
		sandwich.setHasTomato(hasTomato);
		sandwich.setSauce(sauce);
		
		return sandwich;
		
	}
	
	

}
