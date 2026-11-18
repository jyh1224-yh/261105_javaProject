package day04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/* ---menu---
		 *  1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4. 젤리(500원) | 5. 종료
		 *  menu > 1
		 * 과자 1개를 선택했습니다. 2000원
		 * menu > 2
		 * 라면 1개를 선택했습니다. 3000원
		 * menu > 5
		 * 과자 1개 : (금액) (개수 카운팅 하는 변수)
		 * 라면 1개 : (금액)
		 * -------- 
		 * 총금액  :
		 *  
		 * 종료를 누를 때 까지 반복
		 * 1~5를 벗어난 메뉴는 다시 입력
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(System.in);
		
		int sum= 0;
		
		int menu =0;
		
		int cnt1 =0; //1번 메뉴의 개수
		int cnt2 =0; //2번 메뉴의 개수
		int cnt3 =0; //3번 메뉴의 개수
		int cnt4 =0; //4번 메뉴의 개수
		
		
		do {
			System.out.println("---menu---");
			System.out.println("1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4. 젤리(500원) | 5. 종료");
			System.out.println("menu > ");
			menu = scan.nextInt();
			
			if(menu < 1 || menu > 5) {
				System.out.println("다시입력");
				continue;
			} switch(menu) {
			case 1 :
				System.out.println("과자 1개를 선택했습니다. 2000원");
				cnt1++;
				sum = sum + 2000;
				break;
			case 2 :
				System.out.println("라면 1개를 선택했습니다. 3000원");
				cnt2++;
				sum = sum + 3000;
				break;
			case 3 :
				System.out.println("사탕 1개를 선택했습니다. 500원");
				cnt3++;
				sum = sum + 500;
				break;
			case 4:
				System.out.println("젤리 1개를 선택했습니다. 500원");
				cnt4++;
				sum = sum + 500;
				break;
			case 5:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("메뉴에 없습니다.");
			}
			
			
			
		} while (menu != 5); // while ( menu !=5)
		//sum = (count1*2000) + (count2*3000) + (count3 * 500) + ( count4*500);
		
		System.out.println("과자" + cnt1 + "  = " + cnt1*2000);
		System.out.println("라면" + cnt2 + "  = " + cnt2*3000);
		System.out.println("사탕" + cnt3 + "  = " + cnt3*500);
		System.out.println("젤리" + cnt4 + "  = " + cnt4*500);
		System.out.println("총 금액: " + sum);
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
			scan.close();

	}

}
