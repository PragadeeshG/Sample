package com.test1;

public class Dish extends Animal {
	private int sizeInFt;
	private boolean canEat;

	public Dish(int sizeInFt, boolean canEat) {
		super();
		this.sizeInFt = sizeInFt;
		this.canEat = canEat;
	}

	public int getSizeInFt() {
		return sizeInFt;
	}

	public void setSizeInFt(int sizeInFt) {
		this.sizeInFt = sizeInFt;
	}

	public boolean isCanEat() {
		return canEat;
	}

	public void setCanEat(boolean canEat) {
		this.canEat = canEat;
	}

}
