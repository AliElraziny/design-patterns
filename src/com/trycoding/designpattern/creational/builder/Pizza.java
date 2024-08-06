package com.trycoding.designpattern.creational.builder;

public class Pizza {
	
	private String topping;
	
	private String sauce ;
	
	private String filling ; 
	
	private String size ;
	
	private  Pizza(PizzaBuilder pizzaBuilder) {
		this.filling = pizzaBuilder.filling;
		this.topping = pizzaBuilder.topping;
		this.sauce = pizzaBuilder.sauce;
		this.size = pizzaBuilder.size;
	}

	public static class PizzaBuilder {
		
		private String topping;
		
		private String sauce ;
		
		private String filling ; 
		
		private String size ;

		public PizzaBuilder(String topping, String size) {
			this.topping = topping;
			this.size = size;
		}

		public PizzaBuilder setSauce(String sauce) {
			this.sauce = sauce;
			return this;
		}

		public PizzaBuilder setFilling(String filling) {
			this.filling = filling;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);	
		}

	}

	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", sauce=" + sauce + ", filling=" + filling + ", size=" + size + "]";
	}
	
	
	

}
