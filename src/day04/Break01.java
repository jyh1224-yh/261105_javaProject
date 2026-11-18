package day04;

public class Break01 {

	public static void main(String[] args) {
		// break : 반복문을 빠져나오는 키워드
		/*
		 * 조건문(if)을 동반해서 조건이 맞을 때 빠져오도록 설계
		 * 
		 * continue : pass, skip 개념
		 * 
		 * return : 매서드를 빠져나오는 키워드
		 */
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		//반복문이 중첩일 경우 break는 나를 감싸고 있는 가장 안쪽의 반복문만 벗어남
		//반복문에 이름을 붙일 수 있음
		//break 이름;
		int i = 0, j = 0, k = 0;

		a: for (;;) {
			i++;
			for (;;) {
				j++;
				for (;;) {
					k++;
				System.out.println("i :" + i + ", j: " + j + ", k:" + k);
				if (k == 10) {
					break;
				}
			}
		}
	}
}
}