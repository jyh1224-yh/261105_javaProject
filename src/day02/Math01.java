package day02;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 쿨래스 : 수학과 관련된 기능을 제공하는 클래스
		//Math.round(값) : 반올림 - 정수로 반올림 => 소수자리수가 0
		//Math.floor(값) : 버림 => 소수자리수0
		//Math.ceil(값) : 올림 => 소수자리수0
	    //Math.random() : 0~1사이의 아무수 => double
		
		double number = 3.14159;
		
		long pi = Math.round(number); //return long
		System.out.println(pi);
		
		//실수의 기본 자료형은 double 정수의 기본 자료형은 int
		
		int r = (int)Math.round(number);
		//(왼쪽)내가 원하는 자료가 int면 소수점을 자른 넘버를 바꿔줘
		
		//floor()
		int floorNum = (int)Math.floor(number); //return double
		
		int ceilNum = (int)Math.ceil(number); //return double
		
		double ran = Math.random()*10; //return double
		System.out.println(ran);
		
		//0 ~ 9 중의 한자리를 랜덤 선택
		//int random = (int)(Math.random()*10); //우선순위 중요
		//System.out.println(random);
		
		// 1~ 10 까지의 랜덤선택
		int random = (int)(Math.random()*10)+1;
		System.out.println(random);
		
		
		// (int)(Math.random()*count) + start
		//주사위 값 1 ~ 6
		//(int)(Math.random()*6)+1
		System.out.println("주사위 값");
		System.out.println((int)(Math.random()*6)+1);
		
		//로또 1 ~ 15
		//(int)(Math.random()*45)+1
		System.out.println("로또값");
		System.out.println((int)(Math.random()*45)+1);
		
		//Random() 클래스 new 키워드
		Random random1 = new Random();
		random1.nextInt(); // int 자료형으로 랜덤값을 리턴 , 범위를 알고 싶으면 ()안에 수 기입
		//random.nextIn(count)+start
		System.out.println(random1.nextInt(45)+1); 
	
		
		// Math.max(값1, 값2) / Math.min(값1, 값2)
		System.out.println(Math.max(10, 40));
		System.out.println(Math.min(20, 30));
		
		
		
		

	}

}
