package com.javaex.ex01;

public class CircleList {
	
	//필드
	private Circle[] cArray;
	private int crtPos;

	
	
	
	//생성
	public CircleList() {
		cArray = new Circle[2];
		crtPos = 0;
	}
	
	//메소gs
	
	
	//메소일반
	
	public void add(Circle circle) {
		cArray[crtPos] = circle;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	
	

}
