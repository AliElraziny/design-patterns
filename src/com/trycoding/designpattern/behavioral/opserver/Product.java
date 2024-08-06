package com.trycoding.designpattern.behavioral.opserver;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	private String name ;
	private String availability ;
	
	private List<Opserver> opservers ;
	
	public Product(String name) {
		this.name = name;
		opservers = new ArrayList<>();
	}

	@Override
	public void addOpserver(Opserver opserver) {
			opservers.add(opserver);
	}

	@Override
	public void removeOpserver(Opserver opserver) {
			opservers.remove(opserver);
	}

	@Override
	public void sentNotification() {
		
		
		for(Opserver opser : opservers) {
			
		//	opser.update(avalability);
		}
		
	}
	
	
}
