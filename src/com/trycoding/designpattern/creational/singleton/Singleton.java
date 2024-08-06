package com.trycoding.designpattern.creational.singleton;

public class Singleton{
	
	
	static Singleton singleton;
	private  Integer printValue ;
	private int[] printArr ; 
	

	private Singleton() {
		
		printArr = new int[]{100,2,3,5,4};
	}
	
	public static Singleton getSingleton() {
		
		if(singleton == null) {
			
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	public void print(Integer printValue ) {
		printArr[0]+=100;
		System.out.println(printArr[0]);
		
	}
	public void printInteger(Integer printValue ) {
		printValue+=500;
		System.out.println(printValue);
		
	}

	public Integer getPrintValue() {
		return printValue;
	}
	
	public void setPrintValue(Integer printValue) {
		this.printValue = printValue;
	}

	public int[] getPrintArr() {
		return printArr;
	}

	public void setPrintArr(int[] printArr) {
		this.printArr = printArr;
	}
}
