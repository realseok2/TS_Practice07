package com.javaex.ex01;

public class Ractangle extends Shape {

//---------------------------------------------						필터

	private int width;
	private int height;

//---------------------------------------------						생성자

	public Ractangle(String fillColor, int width, int height) {
		super(fillColor);
		this.width = width;
		this.height = height;
	}

//---------------------------------------------						getter
	
	public int getWidth() {
		return width;
	}

//---------------------------------------------						showInfo()

	public void draw() { // 부모 클래스에 showInfo()가 선언되어 있지 않으므로 draw를 사용한다.
		System.out.println("[사각형]#면색:" + super.fillColor + " " + " #가로:" + width + " #세로:" + height + "그렸습니다.");
	}

}
