package com.javaex.ex01;

public class Circle extends Shape {

//---------------------------------------------						필터

	private int radius;

//---------------------------------------------						생성자

	public Circle(String fillColor, int radius) {
		super(fillColor);
		this.radius = radius;
	}

//---------------------------------------------						draw()

	public void draw() {
		System.out.println("[원]#면색:" + super.fillColor + "  #반지름:" + radius + " 그렸습니다.");
	}

}
