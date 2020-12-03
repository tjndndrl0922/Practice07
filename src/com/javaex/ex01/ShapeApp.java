package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		
		//Shape s = new Shape("빨강"); 추상클래스
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		Shape[] sArray = new Shape[3];
		sArray[0] = c1;
		sArray[1] = r1;
		sArray[2] = sr1;
		
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		System.out.println("sr1의 가로는 "+sr1.width()+" 입니다.");
	}
}

	
	