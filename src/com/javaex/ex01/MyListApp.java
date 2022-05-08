package com.javaex.ex01;

public class MyListApp {
	
	public static void main(String[] args) {
		
		/*
		Point[] pArray = new Point[100]; // 갯수를 미리 정할수있음,, 단점: 갯수를 정해야만 함
		
		Point p00 = new Point(2, 3);
		Point p01 = new Point(12, 13);
		Point p02 = new Point(22, 23);
		
		pArray[0] = p00;
		pArray[1] = p01;
		pArray[2] = p02;
		
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/
		
		
		PointList pList = new PointList();

		Point p01= new Point(2, 3);
		Point p02 = new Point(12, 13);
		
		pList.add(p01);
		pList.add(p02);
		
		// Point의 갯수
		System.out.println(pList.size()); 
		
		//[1]의 y값
		Point p = pList.get(1);
		System.out.println(p.getY());
		
		//전체출력 toString
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("====================");
		//Circle
		
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(11);
		
		cList.add(c01);
		cList.add(c02);
		
		
		
		
		
	}

}
