package org.studyeasy.parentchild;

public class Phone {
	
	private String model;
	private String mfd;
	
	public Phone(String model) {
		this.model = model;
	}
	
	public Phone(String model, String mfd) {
		super();
		this.model = model;
		this.mfd = mfd;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMfd() {
		return mfd;
	}
	public void setMfd(String mfd) {
		this.mfd = mfd;
	}
	
}
