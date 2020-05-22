package com.javaex.ex02;

public class BirdApp {

    public static void main(String[] args) {
        Bird bird01 = new Duck();
        bird01.setName("꽥꽥이");
        bird01.Fly();
        bird01.Sing();
        bird01.showName();

        Bird bird02 = new Sparrow();
        bird02.setName("짹짹이");
        bird02.Fly();
        bird02.Sing();
        bird02.showName();
    }

}
