package org.studyeasy.phone;

public class Phone {

	private String model;
	

	public Phone(String model) {
		super();
		this.model = model;
	}
	
public void features() {
	System.out.println("Featured Phone ");
	
}

@Override
public String toString() {
	return "Phone [modelss=" + model + "]";
}

public String getModel() {
	return model;
}
	
	
}
