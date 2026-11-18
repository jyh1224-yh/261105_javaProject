package day03;

import java.util.Random;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 연도를 숫자로 입력받아 어린이(13), 청소년(19), 어른으로 구분
		// 어린이 5000원, 청소년 7000원, 성인 10000원 입장료 출력
		// ex) 2017 => 9살 어린이입니다. 입장료는 5000원 입니다.
		// 2026 - (연도) => 나이, 입장료
		// 생년의 유효한 값을 1900~2026
		// 기준에 넘어간 데이터는 다시 입력하라고 요청
		// " 유효하지 연도, 다시 입력해주세요(1900~2026) >"

		// +한가족(5명)의 입장료
		// 반복적인 생년을 입력받고 싶음, => 종료 키워드 0
		// 반복이 종료되면 최종 결제금액

		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			
			System.out.println("연도를 입력하세요(1900~2026)");
			
			int user;
			user = scan.nextInt();
			
			if(user == 0) {
			System.out.println("종료");
			break;
			}

			while (true) {
				if (user >= 1900 && user <= 2026) {
					System.out.println();
					break;
				} else {
					System.out.println("연도를 다시 입력하세요");
					user = scan.nextInt();
				}
			}
			
			int age = 2026 - user;
			
			if (age <= 13) {
				System.out.println("어린이: " + "5000원입니다");
				sum = sum + 5000; //sum+=5000
			} else if (age <= 19) {
				System.out.println("청소년: " + "7000원입니다");
				sum += 7000;
				System.out.println("성인: " + "10000원입니다.");
				sum += 10000;
				
			}
		}
		System.out.println("총 요금: "+sum);
	}

}
