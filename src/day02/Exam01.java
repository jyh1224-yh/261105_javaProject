package day02;

import java.util.Scanner;



public class Exam01 {

	public static void main(String[] args) {
		// 국어,영어,수학 점수를 입력 받아 합계,평균,pass 출력
		//입력 받은 점수는 0~100점 사이에 있어야함.
		//return; 해당 메서드를 빠져나오는 키워드
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요. >");
		int kor = scan.nextInt();
		
		//비교
		//0~100 많지 않으면 빠져나가라 
		if(kor > 100 || kor < 0) {
			System.out.println("잘못 입력되어 종료합니다.");
			return;
		} //여기까지 왔다는 건 국어점수가 범위안에 들어왔다는 뜻
		System.out.println("영어 > ");
		int eng = scan.nextInt();
		if(eng  > 100 || eng  < 0) {
			System.out.println("잘못 입력되어 종료합니다.");
			return;
		}
		System.out.println("수학 > ");
		int math = scan.nextInt();
		if(math > 100 || math < 0) {
			System.out.println("잘못 입력되어 종료합니다.");
			return;
		}
		
		//모든 점수 범위내에 잘 입력되었을 때 위치.
		
		int total = kor + eng + math;
		double avg = (double)total / 3;
		
		System.out.println("total : "+ total + " average : "+avg);
		
		if(avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
	
	
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		scan.close();
		

	}

}
