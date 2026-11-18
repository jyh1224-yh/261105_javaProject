package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method
		
		// toLowerCase() / toUpperCase() : 소문자 변환 / 대문자 변환
		//jpg, JPG, Jpg => jpg
		System.out.println("--toLowerCase() / toUpperCase() --");
		System.out.println("JpG".toLowerCase()); // 소문자로
		System.out.println("jpg".toUpperCase()); // 대문자로
		
		
		//isEmpty() : 같이 비었는지 확인하는 값(공백도 있는 것으로 처리)
		// true / false
		System.out.println("--isEmpty--");
		System.out.println(" ".isEmpty());
		
		
		//isBlank() : 값이 비어있는지 확인 (공백은 (데이터가 없는) 비어있는 것으로 간주)
		System.out.println("--isBlank--");
		System.out.println(" ".isBlank());
		
		
		// trim() : 불필요한 공백을 제거
		System.out.println("--trim--");
		System.out.println("         abc      ".trim());
		
		
		//replace() : 글자를 변환
		System.out.println("--replace--");
		//2026-11-09 => 2026/11/9
		System.out.println("2026-11-09".replace("-", "/"));
		
		
		// split : 특정 값으로 나누기 => 배열로 리턴
		System.out.println("--split--");
		String str = "apple, banana, kiwi, orange";
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str.split("")));
		
		//문자를 숫자로 변경 => Integer.parseInt()
		String num = "123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2);
		
		//숫자를 문자로 변경 String.valueOf()
		String num3 = String.valueOf(num2);
		System.out.println(num3);
		
		//instanceof : 같은 클래스 인지 비교하는 연산자 (클래스 자료형만 가능)
		System.out.println(num3 instanceof String);
		
		
		//
	}

}
