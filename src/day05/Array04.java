package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int arr[] = { 30, 87, 59, 79, 59, 38, 50, 48, 59, 20, 75 };
		// 합계와 평균을 출력
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (sum / arr.length));

		// 가장 큰값, 가장 작은값

		int max = arr[0]; // 20
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				  max = arr[i];
			}
			if (min > arr[i]) {
				  min = arr[i];
			}
		}
			System.out.println(max);
			System.out.println(min);

			//Math.max(a, b); Math.min(a,b)
			System.out.println("---Math class활용---");
			
			max = arr[0]; // 20
			min = arr[0];
			
			for (int i = 0; i < arr.length; i++) {
				max = Math.max(max,arr[i]);
				min = Math.min(min,arr[i]);
				} 
			System.out.println(max);
			System.out.println(min);
			//System.out.println(Math.max());
			//System.out.println(Math.min());
			
			
			scan.close();
		

	}
}
