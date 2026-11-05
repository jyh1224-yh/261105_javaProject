package day02;



public class For01 {

	public static void main(String[] args) {
		// 반복문
		// for, while, do~while
		// for: 반복 횟수가 정해져 있을 때
		//while : 횟수가 정해져있지 않을 때
		// for(초기화; 조건식; 증감식){
		// 실행문;
		//}
		// 1. 초기화 : 반복 횟수를 세는 변수 = i(인덱스의 약자)
		// 2. 조건식 : 번복의 횟수가 끝나는 조건식 (참이되면 실행)
		// 3. 증감식 : 반복 횟수의 증가 /  감소 담당 반복 
		// 4. 실행문 : 조건식이 참일 떄 실행
        // 실행순서
		// 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> 3
		
		// 1~5까지 출력만
		for(int i =0; i<5; i++ ) {
			System.out.println(i);
		}
		
		
		// 1~10
		for(int i=1; i<=10; i++ ) {
			System.out.print(i+" ");
		}
		
		// 줄바꿈
		System.out.println();
		
		System.out.println("출력값");
		
		
		// 1~10까지 중 짝수만 출력( % 2)
	
		for(int i=1; i<=10; i++) {
			if(i % 2 ==0) {
				System.out.print(i+" ");
			}
			
		}
		
		// 1~10까지 합계 => 55
		// 
	
		int sum = 0;  //int sum;도 가능하지만 값이 없어서 연산이 안됨
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		
	}

}
