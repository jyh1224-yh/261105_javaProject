package day06;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx02 {

	public static void main(String[] args) {
		// 정수배열[10] => 0~100까지 랜덤으로 채우기 => 출력
		// 오름차순으로 정렬 =>

		int arr[] = new int[10];
		
		for(int i=0; i <arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			//int t = arr[i];
		} 
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		//Collections.reverOrder() => object
	
		
		
		
		
	}

}
