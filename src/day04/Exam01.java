package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		//
		/*
		 * ----menu---- 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * 
		 * menu > 1 두 수를 입력 > 2 3 결과 => 2+3=5
		 * 
		 * 종료를 누를 때까지 반복 두번째 값이 0인 경우 / % 연산은 할 수 없음. (0으로 나눌 수 없습니다.
		 * 
		 */

Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("---menu---");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("menu > ");
			menu = scan.nextInt();
			
			if(menu == 6) {
				System.out.println("종료합니다.");
				break;
			}else if(menu < 1 || menu > 6) {
				System.out.println("잘못된 메뉴입니다. 다시입력해주세요.");
			}else {
				// 1,2,3,4,5 정상적인 메뉴
				System.out.println("두 수를 입력 >");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				
				while(num2 == 0 && (menu == 4 || menu == 5)) {
					System.out.println("피연산자가 0입니다.");
					//continue;
					System.out.println("피연산자를 다시입력해주세요.");
					num2 = scan.nextInt();
				}
				
				switch(menu) {
				case 1: 
					System.out.println(num1+"+"+num2+"="+(num1+num2));
					break;
				case 2: 
					System.out.println(num1+"-"+num2+"="+(num1-num2));
					break;
				case 3: 
					System.out.println(num1+"*"+num2+"="+(num1*num2));
					break;
				case 4: 
					if(num2 == 0) {
						System.out.println("00으로 나눌 수 없습니다.");
					}else {
						System.out.println(num1+"/"+num2+"="+(num1/num2));						
					}
					break;
				case 5: 
					System.out.println(num1+"%"+num2+"="+(num1%num2));
					break;
				default: break;
				}
				
			}
			
		}while(menu != 6);
		
		
		scan.close();

	}

}
