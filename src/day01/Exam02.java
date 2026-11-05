package day01;

public class Exam02 {

	public static void main(String[] args) {
		// kor, eng, math 세 점수를 입력하고, 합계와 평균을 출력
		// 각 접수는 0~100 => 넘어가면 점수가 잘못 입력되었습니다. 
		//pass : 평균이 60점 이상이면 합격, 아니면 불합격 if문으로 변경해서

		int kor = 10;
		int eng = 82;
		int math = 60;
		
		if(kor >=0 && kor <=100) {
			if(eng >=0 && eng <=100){
				if(math >= 0 && math <=100) {

					int total = kor + eng + math;
					double avr = total / (double)3.0;
					System.out.println("합계 " + total);
					System.out.println("평군 "+((total) / (double)3));
					
					
				}else {
				System.out.println("수학 점수가 잘못 되었습니다.");
				}
				
			}else {
				System.out.println("영어 점수가 잘못 되었습니다");
			}
		
		}else {
			System.out.println("국어 점수가 잘못되었습니다");
		}
		
		if( avr >= 60) {
			System.out.println("합격");
			}else {
				System.out.println("불합격");
			// 
				
				
				
				
		}
	
	}

}
