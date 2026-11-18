package day08;


import day07.Exam01;

public class Method05 {

	// 배열을 받아 출력하는 메서드( 다른 메서드 호출 가능)
	/*매개변수 : 배열 => int[]	
	 * 리턴타입 void
	 * */
	
	public void arraySort(int[] arr) {
		if(arr == null) {
			return;
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	// 배열을 받아  최대값을 리턴하는 메서드
	/* 매개변수 : 배열 => int[] arr
	 * 리턴타입 : 최대값 => int
	 * */
	public int arrayMax(int[] arr) {
		if(arr == null) {
			return -999999;
		}
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// 배열을 받아  최소값을 리턴하는 메서드
	/* 매개변수 : 배열 int[] arr
	 * 리턴타입 : 최소값 => int
	 * */
	public int arrayMin(int[] arr) {
		if(arr == null) {
			return -999999;
		}
		int min = arr[0];
		for(int tmp : arr ) {
			if(min > tmp ) {
				min = tmp;
			}
		}
		return min;
	}
	

	public static void main(String[] args) {
		/* 메서드 생성 
		 * 1. 배열을 받아 출력하는 메서드
		 * 2. 배열을 받아 오름차순 정렬하는 메서드
		 * 3. 배열을 받아 합계, 평균, 최대, 최소 출력 메서드
		 *    - 합계와 평균은 다른 메서드를 호출 Exam01
		 *    - 최대, 최소
		 * */
		
		int[] arr = {78,89,85,84,96,56,59,81,52,62,87,46,39,65};
		
		Method04 m4 = new Method04();
		m4.print(arr);
		
		Exam01 e01 = new Exam01();
		int sum = e01.sum(arr);
		System.out.println(sum);
		double avg = e01.avg(arr);
		System.out.println(avg);
		
		Method05 m5 = new Method05();
		m5.arraySort(arr);
		m4.print(arr);
		int max = m5.arrayMax(arr);
		int min = m5.arrayMin(arr);
		if(max == -999999) {
			System.out.println("배열 오류!!");
		}
		if(min == -999999) {
			System.out.println("배열 오류!!");
		}
		System.out.println(max);
		System.out.println(min);

	}

}
