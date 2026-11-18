package day07;

import java.lang.reflect.Method;

public class Method02 {
	/*
	 * 매서드 => 기능을 정의하는 역할(함수) 접근제어자 리턴타입 매서드명(매개변수) { 구현; return }
	 * 
	 * - 리턴타입 : 기능을 구현 후 결과로 반환하는 값의 타입 - 매개변수 : 기능을 구현하기 위해 외부에서 받아와야 하는 값 - 매서드명 :
	 * 의미있게 소문자로 작성
	 */

	// 매서드 생성영역
	// + - * / %
	// 두 정수를 주고(매개변수) 각 연산의 결과를 리턴하는 메서드
	// / % b 0이 나왔을 때 리턴을 어떻게 받을 때 매서드 안에서 if로 고민하기
	// 나누기는 더블로, 퍼ㅔㄴ트는 인트로

	public int sum(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public double div(int a, int b) {
		if (b == 0) {
			return -999999;
		}
		return a / b;
	}

	public int mod(int a, int b) {
		if (b == 0) {
			return -999999;
		}
		return a % b;
	}

	public static void main(String[] args) {
		// 매서드 호출영역
		Method02 c = new Method02();
		int num1 = 100;
		int num2 = 80;

		int sum = c.sum(num1, num2);
		System.out.println(sum);
		int sub = c.sub(num1, num2);
		System.out.println(sub);
		int mul = c.mul(num1, num2);
		System.out.println(mul);
		double div = c.div(num1, num2);
		System.out.println(div);

		if (div == -999999) {
			System.out.println("0으로 나울 수 없습니다.");
		} else {
			System.out.println(div);
		}

		int mod = c.mod(num1, num2);
		if (mod == -999999) {
			System.out.println("0으로 나울 수 없습니다.");
		} else {
			System.out.println(mod);
		}
	}

}
