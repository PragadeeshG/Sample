package com.test1;

public class Zebra extends Animal {
	private boolean is_wild;

	public Zebra(boolean is_wild) {
		super();
		this.is_wild = is_wild;
	}

	public boolean isIs_wild() {
		return is_wild;
	}

	public void setIs_wild(boolean is_wild) {
		this.is_wild = is_wild;
	}

}
