package day02;


public class Exam03 {

	public static void main(String[] args) {
		// kor, eng, math 점수를 랜덤으로 생성 (0~100)
		// 각 점수를 출력 합계, 평균, pass
		//pass 80점이상이면 상 /  60점 이상이면 중 / 나머지는 하
		
		//for 가능하면 5명의 값을 출력
		//(int)(Math.random()*count)+start
		//random Class 사용시 => random.nextInt(count)+start
		int kor =(int)Math.random()*100; //컨트롤 알트 밑으로 하면 복사
		int eng =(int)Math.random()*100;
		int math =(int)Math.random()*100;
		
		int total = kor+eng+math;
		double average = (double)total / 3;
		
		String pass = "";
		
		if(average>=80) {
			pass="상";
		}else if(average>=60) {
			pass = "중";
		}else {
			pass = "하";
		}
		
		System.out.println("국어: "+kor+"영어: "+eng+"수학: "+ math );
		System.out.println("합계 : " + total+"평균" + average+ "pass"+ pass);
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
