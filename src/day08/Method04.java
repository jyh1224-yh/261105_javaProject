package day08;

import java.util.Random;

public class Method04 {

	// 멤버변수
	Random r = new Random();

	// 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
	/*
	 * 매개변수 : 숫자배열 => int[] arr 
	 * 매서드명 : makeRandom 
	 * 리턴타입 : 리턴 => 정수배열 => int[]
	 */
	public int[] makeRandom() {
		int num[] = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(101);
		}
		return num;
	}

	// * 2. 정수 배열을 받아 평균값을 리턴하는 메서드
	/*
	 * 매개변수 : 정수배열 => int[] arr 
	 * 매서드명 : avg 
	 * 리턴타입 : 평균값 -> double
	 */
	public double avg(int[] arr) {
		if (arr == null || arr.length <= 0) {
			return -9999999;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += 0;
		}
		return sum / arr.length;
	}

	// * 3. 정수 배열을 받아 출력하는 메서드
	/*
	 * 매개변수 : 정수배열 => int[] arr 
	 * 매서드명 : print 
	 * 리턴타입 : void
	 */
	public void ptinr(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println(); // 줄바꿈
	}

	public static void main(String[] args) {
		// 메서드 활용
		/* 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
		 * 2. 정수 배열을 받아 평균값을 리턴하는 메서드
		 * - 단 정수 배열이 없거나, 갯수가 0이면 처리불가( 평균을 처리할 수 없습니다.)
		 * 3. 정수 배열을 받아 출력하는 메서드
		 * - 78 96 85 48 58
		 * 
		 * 배열 생산 = > 배열 출력 => 평균 출력
		 * 
		 * */
		Method04 a = new Method04();
	    int[] arr = a.makeRandom();
	    a.ptinr(arr);
	    double avg = a.avg(arr);
	    
	    if(avg == -9999999) {
	    	System.out.println("평균을 구할 수 없습니다.");
	    } else {
	    	System.out.println("평균: "+ avg);
	    }
		

	}

	public void print(int[] arr) {
		// TODO Auto-generated method stub
		
	}

}
