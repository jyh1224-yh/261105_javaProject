package day04;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 집합
		/*
		 * 6의 약수 : 1, 2 ,3 , 6 6%1==0 6%2==0 6%3==0 6%4==2 6%5==1 6%6==0
		 */

		int number = 20;
		// for 1~number 까지 반복
		// number % i(로 나눈) ==0 => 출력
		for (int i = 1; i <= number; i++)
			if (number % i == 0) {
				// 약수의 조건
				System.out.println(i);
			}
		System.out.println("-----------");
		// 공약수 : 두 수의 공통된 약수
		/*
		 * 6, 12의 공약수 12: 1,2,3,4,5,6,12 공약수 : 1,2,3,6 공약수 중 가장 큰 수는 = 최대 공약수 => 6
		 * 
		 */

		int num1 = 6; // num1 % i == 0
		int num2 = 12; // num2 % i == 0

		int gcd = 0;

		// 1부터 했을경우
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				gcd = i;
			}
		}
		System.out.println("최대 공약수: " + gcd);

		// 뒤에서부터 했을 경우 반대로 가는거임
		for (int i = num1;; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("최대 공약수 : " + i);
				break;
			}
		}

		// ---------------------------------
		// 배수 : 곱해서 나오는 값 (끝이없음)
		// 10의 배수 : 10, 20, 30, 40, 50
		// 15의 배수 : 15, 30, 45 , 60...
		// 공배수: 두 수의 공통된 배수 => 30, 60, 90
		// 최소 공배수 : 30
		// 10*1, 10*2, 10*3...
		// 15*1, 15*2...

		
		//1번
		int n1 = 10;
		int n2 = 15;
		
		
		for(int i=n1; ;i=i+n1) {
			//10 20 30 40....
			if(i % n1 ==0 && i % n2 ==0) {
				System.out.println("최소공배수: "+i);
				break;
			}
		}
		
		
		//2번
		a: for (int i = 1;; i++) {
			int si = n1 * i;
			for (int j = 1;; j++) {
				int sj = n2 * j;
				if (si < sj) {
					break;
				}
				if(si == sj) {
					System.out.println("최소공배수 : " + sj);
					break a;
				}
			}

		}

	}

}
