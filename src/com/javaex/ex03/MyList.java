package com.javaex.ex03;

public class MyList<T>{ // ex02랑 똑같은데 T로 제네릭 한 것
	
	//필드
	private T[] oArray;
	private int crtPos; // 다음에 추가해줄 방번호
	
	
	//생성
	public MyList() {
		//배열 3개 만들어 봄 // 원랜 안만듦
		oArray = (T[])new Object[3]; // 형변환으로해줘야 함 , 그냥 문법임
		crtPos = 0;
	}
	
	
	//메소gs
	
	
	//메소일반
	public void add(T obj) {
		//현재배열갯수+1
		//기존배열의 내용은 그대로 복사
		//마지막방에 point를 대입
		
		oArray[crtPos] = obj;
		crtPos = crtPos + 1;
		
	}

	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		
		return oArray[index];
	}
	
}
