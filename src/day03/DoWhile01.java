package day03;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// 반복문
		/*
		 * do{ 실행문; } while(조건식); 실핼문을 먼저 실행하고, 조건식을 나중에 비교하는 구문 for,while : 조건식이 맞지 않으면
		 * 한번도 실행을 못할 수도 있음 do~while : 반드시 1번은 실행
		 */
		// 한글자를 입력 받아 출력, 입력 형식: char
		// y를 입력하면 종료 ==같다 !=같지않다

		Scanner scan = new Scanner(System.in);
		
		char ch;

		do {
			System.out.println("y를 입력하면 종료");
			ch = scan.next().charAt(0);
			System.out.println(ch);
		} while (ch != 'y');

		scan.close();

	}

}
