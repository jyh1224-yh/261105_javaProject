package day07;

import java.lang.reflect.Method;

public class Method01 {

	// 메서드 작성 위치
	// 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	// 매개변수 :int a, int b
	// 메서드명 : sum
	// 리턴타입: int

	public int sum(int a, int b) {
		return a + b;
	}

	// 두 정수가 주어지면 두 수의합을 출력하는 메서드
	// 매개변수; int a, int b
	// 매서드명 : sub
	// 리턴타입 : void

	public void sub(int a, int b) {
		System.out.println(a + b);
	}
	/* 매개변수가 없는 케이스 / return 은 있는 케이스*/
	/* 매개변수 : 없음
	 * 메서드명 : sum3
	 * 리턴타입 : 합 => int
	 */
	public int sum3() {
		int a = 5;
		int b =4 ;
		return a+b;
	}
	
	
	/* 매개변수가 없는 케이스 / return 도 없는 케이스
	 * 매서드명 : sum04
	 * 리턴타입 : void
	 */
	
	public void sum4() { 
		int a = 10;
		int b = 4;
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		// 실행용 메인
		int num1 = 100;
		int num2 = 80;
		// 객체를 먼저 생성하고 출력
		Method01 c = new Method01();
		int sum = c.sum(num1, num2);
		System.out.println(sum);
		c.sub(num1, num2); // 출력 구문을 이미 포함
		// System.out.println(sub);
		int sum1 = c.sum3();
		System.out.println(sum1);
		c.sum4();

	}

	// 메서드 작성 위치

}
