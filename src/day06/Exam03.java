package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 야구게임
		/*
		 * 컴퓨터가 랜덤으로 3자의 숫자를 생성 각 자리의 숫자는 0~9까지 랜덤숫자로 구성 0~9 / 0~9 / 0~9 => 중복 불가능 배열로
		 * 저장
		 * 
		 * 유저는 3자리는 맞추는 게임 위치와 숫자가 맞으면 스트라이크 숫자만 맞으면 볼 자리도 숫자도 없으면 out ex) com : 1 2 3
		 * (한번만 생성) 유저 입력 (반복) : 1 9 8 => 1s 유저 : 2 3 8 => 2b * 유저 : 1 3 2 = 1s 2b 유저 :
		 * 1 2 5 => 2s 유저 : 7 8 9 => ! OUT ! 유저 : 1 2 3 => 정답!! break;
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		int com[] = new int[3];
		int userNum[] = new int[3];


		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					// 중복발생
					// 변수 = 값 (저장) 0
					i--; // i위치의 값 재생성
				}
			}
		}
		System.out.println(Arrays.toString(com));

		while (true) {
			System.out.println("0~9 사이 숫자 입력");
			for (int i = 0; i < userNum.length; i++) {
				userNum[i] = scan.nextInt();
			}
			System.out.println("user: " + Arrays.toString(userNum));

			int st = 0;
			int bl = 0;
			if (Arrays.toString(com).equals(Arrays.toString(userNum))) {
				System.out.println("!정답!");
				break;
			} else {
				for (int i = 0; i < com.length; i++) {
					if (com[i] == userNum[i]) {
						st++;
					} else {
						for (int j = 0; j < com.length; j++) {
							if (com[i] == userNum[j]) {
								bl++;
							}
						}
					}
				}
				System.out.println("st : " + st);
				System.out.println("bl : " + bl);
			}
		}
		scan.close();

	}

}
