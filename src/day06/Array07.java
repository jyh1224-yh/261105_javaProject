package day06;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {
		// String 배열

		String strArr[] = new String[5];
		
		strArr[0] = "홍길동";
		strArr[1] = "김영이";
		strArr[2] = "고길동";
		strArr[3] = "둘리";
		strArr[4] = "또치";
		System.out.println(Arrays.toString(strArr));
		
		System.out.println("====");
		for(int i=0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		// 배열의 단점 : 배열의 길이는 고정
		
		//배열의 데이터를 늘리는 경우
		// 더 큰 배열을 만들어서 기존데이터를 옮겨줘야 함.
		String strArr2[] = new String[strArr.length+3];
		System.out.println("====");
		//String strArr2[] = new String[10];
		
		System.out.println(Arrays.toString(strArr2));
		
		//앞쪽이 받을 대상 = 뒤가 주는 대상
		for(int i=0; i<strArr.length;i++) {
			strArr2[i] = strArr[i];
		}
		System.out.println(Arrays.toString(strArr2));
		//기존 데이터 이동	
		//배열 복사 arraycopy
		// System.arraycopy(구 배열, 시작번지, 신배열, 기작번지, 개수);
		System.arraycopy(strArr, 0, strArr2, 0, strArr.length); // 위에 for문 대신에 쓸 수 있는 구조

		
		
		
		strArr = strArr2; //원래 배열의 주소를 버리고 새 배열의 주소를 저장
		strArr[5] = "도우너";
		System.out.println(Arrays.toString(strArr));
		
		
		
	}

}
