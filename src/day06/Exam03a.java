package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam03a {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
// 선생님 답
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

		// user 입력을 한번에 받기 123 => 1 2 3
		// String으로 받아서 split "" => 한글자씩 잘라서 배열로 리턴
		// 형변환( Integer.parseInt)
		while (true) {
			System.out.println("숫자를 입력하세요(중복숫자x)");
			String myNum = scan.next();
			
			//힌글자씩 나누어 배열에 저장
			String myArr[] = myNum.split("");
			for(int i =0; i<myArr.length; i++) {
				userNum[i] = Integer.parseInt(myArr[i]);
			}
			System.out.println(Arrays.toString(userNum));
			
			int stk=0;
			int ball=0;
			for(int i =0; i<com.length; i++) {
				for (int j = 0; j < com.length; j++) {
					if (com[i] == userNum[j] && i==j) {
						stk++;
					}else if(com[i] == userNum[j] && i != j) {
						ball++;
					}
				}
			}
			
			if(stk==0 && ball ==0) {
				System.out.print(" => OUT");
			} else {
				System.out.println( "=>  " + stk+"s " + ball + "b");
			}
			if(stk==3) {
				System.out.println("정답");
				break;
			}
			
			if(userNum != null) {
				break;
			}
			
		}

		scan.close();
	}

}
