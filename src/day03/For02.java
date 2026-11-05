package day03;

public class For02 {

	
	public static void main(String[] args) {
		// for문을 사용하여 1~100까지의 합계를 출력
		//for(변수선언; 조건식; 증감식) {실행문;}
		
		int sum =0; //local variable (지역변수): 반드시 초기화
		for(int i=1; i<=100; i++) {
			sum = sum +i; //sum += i
			//System.out.println(sum);

		}
		System.out.println(sum);
		
		//1~100까지 짝수의 합계
		// i % 2 == 0
		sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		} System.out.println(sum);
		
		//for 1~10까지의 랜덤수를 5번 출력
		
		sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.println(int)(Math.random()*10);
			
		} 
	
		
		
		
	}

}
