package com.javaex.ex02;

public abstract class Bird {

//-----------------------------------------						필터

	private String name;

// ----------------------------------------- 						setter, getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//-----------------------------------------						showName()

	public abstract void showName();

	public abstract void Fly();

	public abstract void Sing();

}
