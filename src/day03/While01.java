package day03;

public class While01 {

	public static void main(String[] args) {
		// While
		/* while(조건식) { 실행문;}
		 * 조건식이 참이면 실행문을 실행 
		 * 반복할 조건의 증감식이 항상 실행문에 포함
		 * for : 반복횟수가 정해져 있을 경우
		 * while : 반복횟수가 정해져 있지 않을 경우
		 * while 무한루프 주의
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		int i =1;
		while(i <= 10) {
			System.out.println(i);
			i++;
			//조건을 이용한 break;
			if(i==5) {
				break;
			}
			
		}
		
		//while 이용하여 1~10까지 출력
		i=0;
		while(i<=10) {
			i++;
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		//break; 문을 사용
		
		i=0;
		int sum =0;
		while(true) {
			if(i % 2 == 0) {
				System.out.println(i);
				sum += i;
			}
			i++;
			if(i==11) {
				break;
			}
			
		}
		System.out.println(sum);
		
	}
}
