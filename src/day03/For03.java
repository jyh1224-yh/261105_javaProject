package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		/*2*1=2
		 * 2*2=4
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		//int dan = 7;
		//for(int i=1; i<=9; i++) {
			//System.out.println(dan+ "*" + i + "=" + (dan*i) );
		//}

		//단을 콘솔에서 입력받아 출력
		System.out.println("단을 입력하세요> ");
		
		int dan =scan.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(dan+ "*" + i + "=" + (dan*i) );
		}
		
		int i=1;
		for(; i<=9; i++) {//밖에서 쓰면 i첫 생략 가능
			System.out.println(i);
		}
		scan.close();
		
	}

}
