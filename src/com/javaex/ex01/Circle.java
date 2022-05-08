package com.javaex.ex01;

public class Circle {
	
	//필드
	private int radius;
	
	
	//생성
	public Circle() {
		super();
	}


	public Circle(int radius) {
		super();
		this.radius = radius;
	}


	//gs
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
	
}
