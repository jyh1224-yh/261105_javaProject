package day01;

public class Switch {

	public static void main(String[] args) {
		// 조건문 : if, switch
		/*
		 * switch(변수 / 식){ case 값1: 실행문; break; case 값2: 실행문; break; case 값3: 실행문;
		 * break; .... default: 실행문; }
		 * 
		 * break : 실행 중인 구문을 강제로 빠져나오게 하는 구문 (반드시 조건문을 동반)
		 */
		int number = 2;

		// number % 2
		switch (number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("나머지");
		}

		// 1~6까지 주사위 숫자를 num라고 가정한다
		// switch 문을 이용하여 나온 숫자만큼 전진시킨다. (그 이상과 이하의 숫자는 아니다라는 구문을 입력하라)

		int num = 8;
		switch (num) {
		case 1:
			System.out.println(num + "칸 전진");
			break;
		case 2:
			System.out.println(num + "칸 전진");
			break;
		case 3:
			System.out.println(num + "칸 전진");
			break;
		case 4:
			System.out.println(num + "칸 전진");
			break;
		case 5:
			System.out.println(num + "칸 전진");
			break;
		case 6:
			System.out.println(num + "칸 전진");
			break;
		default:
			System.out.println("다시 하세요");
			// 반복적인 입력을 줄일 수 있는 방법은?
			///
			/// ------
			switch (num) {
			case 1:case 2:case 3:case 4:case 5:case 6:
				System.out.println(num + "칸전진");
				break;
			default:
				System.out.println("다시입력하세요");
			}

		}
		
		int month = 7;
		//3~5 봄 6~8 여름 9~11 가을 12~2 겨울
		switch (month) {
		case 3:case 4: case 5:
			System.out.println(month+"월 봄");
			break;
		case 6:case 7 : case 8:
			System.out.println(month+"월 여름");
			break;
		case 9: case 10: case 11:
			System.out.println(month+"월 가을");
			break;
		case 12: case 1: case 2:
			System.out.println(month+"월 겨울");
			break;
			default:
				System.out.println("존재하지 않습니다.");
				
				// case 3: case 4: case 5:
				//System.out.println("봄"); 이렇게만 적으면 됨.
		}

	}

}
