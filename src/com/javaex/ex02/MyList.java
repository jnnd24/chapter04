package com.javaex.ex02;

public class MyList {
	
	//필드
	private Object[] oArray;
	private int crtPos; // 다음에 추가해줄 방번호
	
	
	//생성
	public MyList() {
		//배열 3개 만들어 봄 // 원랜 안만듦
		oArray = new Object[3]; // 형변환으로해줘야 함 , 그냥 문법임
		crtPos = 0;
	}
	
	
	//메소gs
	
	
	//메소일반
	public void add(Object obj) {
		//현재배열갯수+1
		//기존배열의 내용은 그대로 복사
		//마지막방에 point를 대입
		
		oArray[crtPos] = obj;
		crtPos = crtPos + 1;
		
	}

	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		
		return oArray[index];
	}
	
}
