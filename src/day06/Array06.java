package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// 10개의 숫자를 가지는 배열 생성
		// 0~100까지 랜덤수를 배열에 저장 => 출력
		// 랜덤을 일반/ 출력(최대 최소 비교할 때 향상문)
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
		}
		
		int sum=0;
		int max = 0; // 배열의 값 중 가장 큰 값을 찾기  arr[0]
		int min = 100; // 배열의 값 중 가장 작은 값을 찾기 위한 초기값
		
		for(int tmp : arr) {
			sum += tmp;
//			if(max < tmp) {
//				max = tmp;
//			}
			
//			if(min > tmp) {
//				min = tmp;
//			}
			
			max = Math.max(tmp, max);
			min = Math.min(tmp, min);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(sum / (double)arr.length));
		System.out.println("최대 : "+max);
		System.out.println("최소 : "+min);
		
		
	}
}
