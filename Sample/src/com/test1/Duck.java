package com.test1;

public class Duck extends Animal {
	private String beakColor;

	public Duck() {
		beakColor = "yellow";
	}

	public Duck(String beakColor) {
		super();
		this.beakColor = beakColor;
	}

	public String getBeakColor() {
		return beakColor;
	}

	public void setBeakColor(String beakColor) {
		this.beakColor = beakColor;
	}

}
