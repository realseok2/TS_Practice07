package com.javaex.ex01;

public abstract class Shape {

//---------------------------------------------						필터

	protected String fillColor;

//---------------------------------------------						생성자

	public Shape(String fillColor) {
		this.fillColor = fillColor;
	}

//---------------------------------------------						draw()

	public abstract void draw();

}
