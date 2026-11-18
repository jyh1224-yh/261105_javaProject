package day10;

import java.util.Arrays;
import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// Report Class 객체 생성 => 실행
		// 성적 산출 인원 >3 (입력. 스캐너)
		// 이름,국어,영어,수학 (입력 또는 랜덤)
		// 이름   국어  영어  수학  합계  평균  등수  \t
		// 
		
		//합계 평균 등수가 출력이 되는지 선행 후 아래 할 것.
		//Report[] = new Report[count];배열 생성
		//Report 객체가 들어가는 배열
		//Report r = new Report("이름", 58,70,38)
		//report[0] = r;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 산출 인원 >");
		int count = scan.nextInt();
		Report[] report = new Report[count];
		
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번 이름, 국어, 영어, 수학 순으로 입력>");
			String name = scan.next();
			// random()
			int kor = (int)(Math.random()*70)+30;
			int eng = (int)(Math.random()*70)+30;
			int math = (int)(Math.random()*70)+30;
			report[i] = new Report(name, kor, eng, math);
			
		}
		
		// 순위
		for(int i=0; i<count; i++) {  // 내꺼
			int rank = 1;
			for(int j=0; j<count; j++) {  // 비교대상
				if(report[i].getAvg() < report[j].getAvg()) {
					rank++;
				}
			}
			// 내 순위 저장
			report[i].setRank(rank);
		}
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-------------------------------------------------------");
		for(Report tmp : report) {
			System.out.println(tmp);
		}
		
		
//		Report r = new Report("hong", 78, 96, 63);
//		System.out.println(r); // r.toString();
//		
//		Report r1 = new Report();
//		r1.setName("kim");
//		r1.setKor(88);
//		r1.setEng(63);
//		r1.setMath(50);
//		r1.sum();
//		r1.avg();
//		System.out.println(r1);
//		
//		report[0] = r;
//		report[1] = r1;
//		
//		System.out.println(Arrays.toString(report));
		//System.out.println(report);
		
		scan.close();

	}

}
