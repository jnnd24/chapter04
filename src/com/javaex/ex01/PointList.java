package com.javaex.ex01;

public class PointList {
	
	//필드
	private Point[] pArray;
	private int crtPos; // 다음에 추가해줄 방번호
	
	
	//생성
	public PointList() {
		//배열 3개 만들어 봄 // 원랜 안만듦
		pArray = new Point[3];
		crtPos = 0;
	}
	
	
	//메소gs
	
	
	//메소일반
	public void add(Point point) {
		//현재배열갯수+1
		//기존배열의 내용은 그대로 복사
		//마지막방에 point를 대입
		
		pArray[crtPos] = point;
		crtPos = crtPos + 1;
		
	}

	public int size() {
		return crtPos;
	}
	
	public Point get(int index) {
		
		return pArray[index];
	}
	
}
