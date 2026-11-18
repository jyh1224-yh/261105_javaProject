package day05;

import java.util.Scanner;

public class Exam03a {

	public static void main(String[] args) {
		/*
		 * 가위 바위 보 게임 컴퓨터와 유저가 가위바위보 게임을 진행 컴퓨터는 랜덤으로 0 1 2 값 중 선택 가위=0 / 바위 =1 / 보 =2
		 * 
		 * 유저도 input 0 1 2 중 선택
		 * 
		 * ex) com = 0 / user =0 com(가위) / user(가위) => 무승부 com = 0 / user = 1 com(가위) /
		 * user(바위) => user 승리 / 패배도
		 * 
		 * 
		 * 유저의 입력값 중 0 1 2 외의 다른 값이 입력되면 입력 오류 => 다시입력 처리 종료버튼 지정 3?
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String[] choice = { "가위", "바위", "보" };
		System.out.println("가위바위보 시작");

		while(true) {
			
			int comNum = (int) (Math.random() * 3); // 0~2 까지 3개
			
			// System.out.println(comNum +" /"+ choice[comNum]);
			
			System.out.println("가위0, 바위1, 보2, 종료3 중 선택");
			
			int mtNum = scan.nextInt();
			if (mtNum ==3) {
				System.out.println("종료합니다.");
				break;
			}
			while (mtNum <0 || mtNum > 2) {
				System.out.println("다시 입력하세요");
				mtNum = scan.nextInt();
			} 
			
			
			System.out.println(mtNum + " /" + choice[mtNum]);
			
			if (comNum == mtNum) {
				System.out.println("com: " + comNum + " /" + "user :" + choice[mtNum] + "=>");
				
				System.out.println("무승부");
			} else {
				
				if (mtNum == 0) {
					System.out.println(comNum == 2 ? "유저승" : "유저패");
				} else if (mtNum == 1) {
					System.out.println(comNum == 0 ? "유저승" : "유저패");
				} else {
					System.out.println(comNum == 1 ? "유저승" : "유저패");
				}
			}
			
		}

		scan.close();

	}

}
