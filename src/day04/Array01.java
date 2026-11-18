package day04;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// Array : 배열
		/* 같은 타입의 같은 의미를 가지는 변수
		 * 
		 * 기본 8개형 자료형(기본형 변수) 빼고는 전부 클래스 자료형(참도형 변수)
		 *  -new 키워드로 생성
		 *  - 배열 선언 방법
		 *  타입  배열명[]; // 아직 배열객체를 생성하지 않은 단계
		 *  타입[] 배열명; // 기본값 null
		 *  
		 *  타입[] 배열명 = new 타입[길이];
		 *  생성된 배열 안 변수값은 자동으로 초기화가 이루어짐.
		 *  
		 *  int[] arr = new int[5];
		 *  int[] arr = new int[]{1,2,3,4,5};
		 *  int[] arr = {1,2,3,4,5}; //test 할 때
		 *  
		 *  배열의 길이는 0 이상이어야한다. (- 는 허용안됨)
		 *  배열의 index는 항상 0부터 시작
		 *  배열[5] => 0 1 2 3 4   => 마지막번지는 [개수-1]
		 *  배열의 총길이 => length => 번지는 [length-1]
		 *
		 */
		int[] arr; //null 선언만 객체는 x
		arr = new int[5]; //선언한 변수에 객체에 연결
		
		int[] arr1 = new int[5]; //만든 5개 배열값은 0으로 초기화
		int[] arr2 = new int[] {1,2,3,4,5,7,8};
		int[] arr3 = {10,20,30,40,50};
		
		//배열명[번지]
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		//System.out.println(arr2[5]); ArrayIndexOutOfBoundsException
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();
		System.out.println("arr2.length: " + arr2.length);
		
		//--------------
		//변수명 = 값    arr[0] = 100
		arr[0]=100;
		arr[1]=104;
		arr[2]=140;
		arr[3]=200;
		arr[4]=250;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+100;
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	//------------------------------
		// arr4 [10] 칸을 가지는 int배열을 생성
		// 1~10까지 반복적으로 저장 => 출력
		System.out.println("---------------");
		
		int[] arr4 = new int[10];
		
		for(int i=0; i<arr4.length; i++) {
			arr4[i] = i+1;
			System.out.println(arr4[i]+" ");
		} 
		
		System.out.println("----------");
		
		
		//Arrays.toString(배열)
		System.out.println(Arrays.toString(arr4));
		
		
		
		
	}

}
