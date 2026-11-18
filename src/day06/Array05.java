package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		// 숫자 5개를 입력할 수 있는 배열을 생성
		// 랜덤으로 0~100까지 숫자를 입력
		// 합계를 출력
		
		
		int sum=0;
		
		int arr[] = new int[5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*101);
			sum += arr[i];
		}
		//전체 보기 비교,연산 x
		System.out.println(Arrays.toString(arr));
		System.out.println("합계: " +sum);
		
		//비교,연산o 
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("================");
		
		
		
		//향상된 for문
		//for(출력할 리스트의 자료형 임의변수값 : 리스트) { }
		//향상된 for문은 원본의 리스트를 하나씩 순차적으로 임의 변수값에 저장 => 
		// 처리문으로 실행 / 원본 자체를 변경x
		sum=0;
		for(int tmp : arr) {
			System.out.println(tmp);
			if(tmp>=60) {
				sum += tmp;				
			}
		}
		
		
	}

}
