package day07;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		/*
		 * 전체인원 > 3 (입력) = 인원수만큼 배열 생성 이름 국어 영어 수학 합계 평균 등수 엔터 hong 89 78 88 00 00 kim
		 * 86 50 60 00 00 min 40 45 76 00 00
		 * 
		 * 등수 이름, 국어, 영어, 수학 점수를 입력받아 합계 평균 등수 배열은 스트링과 숫자를 함께 넣을 수는 없음
		 */
		// 각각의 필요한 배열을 따로 생성 같은 번지의 학생은 값은 값으로 정의

		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		// System.out.printf("%.1f", 56.53215); //소수 두자리수로 표현하는 방식
		Scanner scan = new Scanner(System.in);

		System.out.println("성적산출인원 > ");
		int tester = scan.nextInt();
		int subject = 3;
		
		
		String[] name = new String[tester];
		int[][] scores = new int[tester][subject];
		double[] avg = new double[tester];
		int[] ranking = new int[tester];
		int[] total = new int[subject];

		// 이름 입력 / 성적 입력
		for (int i = 0; i < tester; i++) {
			System.out.println((i + 1) + ". 번째 학생 이름");
			name[i] = scan.next();
			System.out.println(name[i] + "학생의 성적(국,영,수) > ");
			for (int j = 0; j < subject; j++) {
				scores[i][j] = (int)(Math.random()*70)+30;
				
			} 
			
		}
		
		//합계 평균
		for(int i=0; i<tester; i++) {
			for(int j=0; j<subject; j++) {
				total[i] = total[i]+scores[i][j];
			}
			avg[i] = total[i]/(double)subject;
			
		}
		
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			//System.out.println();
			for(int j=0; j<subject; j++) {
				System.out.print(scores[i][j]+"\t");
				//System.out.println();
			}
			//합계 평균 출력
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f\t", avg[i]);
			
			int r =1;
			// i = 순위를 구할 대상
			//j = 비교대상
			for(int j=0; j<tester; j++) {
				if(avg[i] < avg[j]) {
					r++;
				}
			}
			ranking[i] = r;
			System.out.print(ranking[i]+"\t");
			System.out.println();
			
		} 
		//System.out.println(avg +"\t");
		
		
		scan.close();

	}
}