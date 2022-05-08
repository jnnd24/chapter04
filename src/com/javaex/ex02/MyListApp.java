package com.javaex.ex02;

public class MyListApp {
	
	public static void main(String[] args) {
		
		MyList pList = new MyList();
		
		Point p01 = new Point(2,3);
		Point p02 = new Point(12,13);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size()); // 2
		System.out.println(pList.get(0).toString());
		
		for(int i=0; i<pList.size(); i++) {
			Point p = (Point)pList.get(i);
			System.out.println(p.getX());
		}
		
		
		System.out.println("=============");
		MyList cList = new MyList();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(13);
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		
		
		
	}

}
