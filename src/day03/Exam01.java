package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지 중 랜덤 수 하나를 컴퓨터가 생성 => user는 모름
		// user가 랜덤수를 맞추는 게임
		/*
		 * 출력예시) 컴퓨터가 랜덤수를 생성했습니다 입력이라는 프롬프트 생성 (38) 입력 > 30 > up 입력 > 40 > down 입력 > 38
		 * > 정답 (몇회 걸렸는지) => 종료
		 * 
		 * 랜덤수 > 유저수 up!! 랜덤수 < 유저수 down 랜덤수 = 유저수 정답
		 */
		Scanner scan = new Scanner(System.in);

		int user;
		int count = 0;
		int random = (int) (Math.random() * 50) + 1;
		System.out.println("게임을 생성했습니다");
		

		while (true) {
			System.out.println("유저입력 >");
			user = scan.nextInt();
			count++;
			if (random > user) {
				System.out.println("Up");
			} else if (random < user) {
				System.out.println("Dwon");
			} else {
				System.out.println("정답입니다"+ "/" + "Count 횟수 :" + count);
				
				break;
			}

		}

		
		scan.close();
	}

}
