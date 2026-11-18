package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 배열생성 5명의 정수를 입력 받기
		// 0~100까지
		// 합계와 평균을 출력
		// 입력값의 범위가 벗어나면 다시 입력받기

		Scanner scan = new Scanner(System.in);

		int arr[] = new int[5];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("점수 입력 > ");
			int score = scan.nextInt();
			while (score < 0 || score > 100) { //if는 조건을 한번만 확인함.
				System.out.println("다시입력 하세요");
				score = scan.nextInt();
			}

			arr[i] = score; //담다?
			sum += arr[i]; //누적
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double) (sum / arr.length));

		scan.close();
	}

}
