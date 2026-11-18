package day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*가위 바위 보 게임
		 * 컴퓨터와 유저가 가위바위보 게임을 진행
		 * 컴퓨터는 랜덤으로 0 1 2 값 중 선택
		 * 가위=0 / 바위 =1 /  보 =2
		 * 
		 * 유저도 input 0 1 2 중 선택
		 * 
		 * ex) com = 0 / user =0
		 * com(가위) /  user(가위) => 무승부
		 * com = 0 / user = 1
		 * com(가위) / user(바위) => user 승리 / 패배도
		 * 
		 * 
		 * 유저의 입력값 중 0 1 2 외의 다른 값이 입력되면 입력 오류 => 다시입력 처리
		 * 종료버튼 지정 3?
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		String menu[] = { "가위, 바위, 보" };
		int user=0;
		
		do {
			int random = (int) (Math.random() * 3); //50까지의 수를 받는데 시작값을 1로 해서 +1
			System.out.println("게임을 생성했습니다");
			System.out.println("0. 가위 | 1. 바위 | 2. 보 | 3. 종료하기");
			System.out.println("입력 > ");
			user = scan.nextInt();
			
			while (user <0 || user > 3) {
				System.out.println("다시 입력하세요");
				user = scan.nextInt();
			} 
			
			if(user == 3) { 
				System.out.println("종료");
				break;
			} 
			if (random == user) {
				System.out.println("무승부");
			} 
			if(user ==0) {
				System.out.println(random==2 ? "유저승":"유저패"); //삼환연산자
			} else if (user ==1) {
				System.out.println(random==0 ? "유저승":"유저패");
			} else {
				System.out.println(random==1 ? "유저승":"유저패");
			} 
				
			
			
			
			
		} while (user != 3);
		
		
		scan.close();

	}

}
