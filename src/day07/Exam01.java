package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	//합계를 매서드로 분리
	// 숫자 배열을 입력 받아서 배열의 합계를 리턴
	/* 매개변수 : 숫자배열 => int[] arr
	 * 매서드명 : sum
	 * 리턴타입 : 리턴 => int
	 * 
	 */
	
	public int sum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum=+i;
		}
		return sum;
	}

	//평균
	//숫자배열을 입력 받아서 배열의 평균을 리턴
	/* 매개변수 : 숫자배열 => int[] arr
	 * 매서드명
	 *리턴타입/// double
	 */
	public double avg(int[] arr) {
		if( arr == null) {
			System.out.println("처리할 수 없습니다" );
			return -9999999;
		}
		if( arr.length <=10) {
			System.out.println("0으로 나눌 수 없습니다.");
			return -9999999;
		}
		return sum(arr) / (double)arr.length;
	}
	
	//문자 배열을 입력받아서, 숫자배열로 리턴하는 메서드
	/* 매개변수 : String[] arr
	 * 매서드명 : changeArr
	 * 리턴타입 : 숫자배열 : int[]
	 */
	
	public int[]	changeArr(String[] arr) {
		int num[] = new int[arr.length];
		if(arr == null || arr[0] == null) {
			System.out.println("배열을 처리할 수 없습니다.");
			return num;
		}
		for(int i =0; i<arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		return num;
	}
	
	
	//문자 배열, 숫자 배열을 입력 받아서 문자 배열의 값을 숫자 배열로 채우는 매서드
	/* 매개변수 : 문자배열, 숫자배열 String[] arr, int[] arr2
	 * 매서드명 : changeArr2
	 * 리턴타입 : void
	 */
	public void changeArr2(String[] arr, int[] arr2) {
		if(arr == null || arr[0] == null || arr.length <= 0) {
			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
// 문자 배열보다 숫자배열의 길이가 작을 때
		if (arr.length != arr2.length) {
			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
		for(int i =0; i<arr2.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		/*
		 * 숫자를 입력 받아 입력받은 숫자의 합계와 평균을 출력 12345 = 1+2+3+4+5 => 합계  
		 * 평균 String 으로 입력 받아
		 * 한자리 수로 분해(배열 이용) 반복 0 또는 음수를 입력하면 종료
		 * 
		 * 
		 * ex) 숫자를 입력하세요(0 또는 음수는 종료)
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			String number = scan.next();
			String[] arr = number.split(""); // 한글자씩 분류하여 배열로 리턴
			
			if(Integer.parseInt(arr[0])<=0) { //넘버를 숫자로 변환
				System.out.println("종료");
				break;
			}
			
			int sum =0;
			for(int i=0; i<arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
			} 
			
			Exam01 e = new Exam01();
			int[] num = e.changeArr(arr);
			
			
			
			System.out.println(Arrays.toString(arr));
			int avg = sum/arr.length;
			System.out.println("합게 : " + sum + " / 평균 : " + avg);
			
			
			//split : 나누기 / join : 배열 => join
			//String.join(" 구분자" , 배열);
			//String p = String.join(" + ",str);
		}
		
		scan.close();
	}

}
