package com.javaex.TS_ex03;

public class SoundApp {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());
	}

	public static void printSound(Soundable soundable) {
		// 구현

		System.out.println(((Soundable) soundable).sound());

	}

}
