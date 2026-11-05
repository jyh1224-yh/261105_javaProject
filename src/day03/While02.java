package day03;

public class While02 {

	public static void main(String[] args) {
		// 1~50 까지의 짝수만 출력
		/*
		 * 2 4 6 8 10 12 14 16 18 20 ...
		 * 
		 */
		int i = 0;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				if (i % 10 == 0) {
					System.out.println();
				}
			}
			i++;

		}
		
		System.out.println("----------");
		// 5번 출력 enter => 출력 count 변수가 필요
		i=1;
		int count=0;
		while(i<=50) {
			if(i % 2 ==0) {
				System.out.print(i + " ");
				count++;
			}
			if(count == 5) {
				System.out.println();
				count=0;
			}
			i++;
		}
		
		
		
	}
}