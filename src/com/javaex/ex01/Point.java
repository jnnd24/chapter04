package com.javaex.ex01;

public class Point {
	
	//필드
	private int x;
	private int y;

	
	//생성
	public Point() {
		super(); //Object()
	}
	public Point(int x, int y) {
		super(); //Object()
		this.x = x;
		this.y = y;
	}
	
	
	//메소gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소일
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
