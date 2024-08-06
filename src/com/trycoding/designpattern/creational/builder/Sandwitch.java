package com.trycoding.designpattern.creational.builder;

public class Sandwitch {
	
	private String bread;
	private String filling;
	private String sauce;
	private boolean hasTomato;
	

	
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setFilling(String filling) {
		this.filling = filling;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setHasTomato(boolean hasTomato) {
		this.hasTomato = hasTomato;
	}
	@Override
	public String toString() {
		return "Sandwitch [bread=" + bread + ", filling=" + filling + ", sauce=" + sauce + ", hasTomato=" + hasTomato
				+ "]";
	}
	
	
	

}
