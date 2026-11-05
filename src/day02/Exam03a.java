package day02;


public class Exam03a {

	public static void main(String[] args) {
		        // kor, eng, math 점수를 랜덤으로 생성 (0~100)
				// 각 점수를 출력 합계, 평균, pass
				//pass 80점이상이면 상 /  60점 이상이면 중 / 나머지는 하
				//for 가능하면 5명의 값을 출력
		int kor =0, eng = 0, math =0;
		for(int i=1; i<6; i++) {
			kor = (int)(Math.random()*101);
			eng = (int)(Math.random()*101);
			math =(int)(Math.random()*101);
			System.out.println(i+ "번째 사람의 점수 ->국어 : " + kor+ "점, 영어: "+ eng + "점, 수학 : "+math+"점");
			int total = kor + eng + math;
			double avg = total / 3.0;
			String pass;
			if(avg >= 80) {
				pass = "상";
			}else if(avg>=60) {
				pass = "중";
			}else {
				pass = "하";
			}
			
			System.out.println(i+"번째 학생의 세 과목의 합계 : " +total);
			System.out.println(i+"번째 학생의 세 과목의 평균: "+ avg);
			System.out.println(i+"번째 학생의 성적 평가: "+ pass);
			System.out.println();

		}

	}

}
