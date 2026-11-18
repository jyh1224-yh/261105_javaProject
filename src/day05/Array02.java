package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열
		/*
		 * int arr[] = new int[5];
		 * 
		 * //사용자에 직접 입력 for(int i=0; i<arr.length; i++) {
		 * System.out.println("점수 입력 > "); arr[i] = scan.nextInt();
		 * //system.out.println(arr[i]);
		 */
			
		//}
		
		//System.out.println(Arrays.toString(arr));
		
		//-------------------------------
		
		// 0~100점 사이의 점수를 랜덤으로 입력
		
		int arr2[] = new int[10];
		int sum = 0;
		//랜덤으로 10개 반복
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*101);
			sum += arr2[i];
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("총합계: " +sum);
		System.out.println("평균: " + (double)(sum / arr2.length));
	
		scan.close();
		}
		

	}

