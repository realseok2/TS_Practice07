package com.javaex.ex02;

public class Duck extends Bird {

	public void Sing() {
		System.out.println("오리 [ " + super.getName() + " ] 가 소리내어 웁니다.");
	}

	public void Fly() {
		System.out.println("오리 [ " + super.getName() + " ] 가 날지 않습니다.");
	}

	public void showName() {
		System.out.println("오리의 이름은 [ " + super.getName() + " ] 입니다.");
	}

}