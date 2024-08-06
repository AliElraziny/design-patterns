package com.trycoding.designpattern.behavioral.opserver;

public interface Subject {
	
	void addOpserver(Opserver opserver);
	void removeOpserver(Opserver opserver);
	void sentNotification();

}
