package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// 메서드 (method) = 함수(function)
		// 실행을 담당 (콘솔 실행)
		// 주석 : 슬래시 두개가 실행과 상관없는 영역
		/* 여러줄 주석
		 * 주석 : ctrl + / => 한번 더 누르면 풀림
		 * java => package => class => method
		 * 
		 * main : 실행을 담당
		 * println() : 괄호 안의 있는 값을 콘솔 출력 (엔터 줄바꿈 포함)
		 * print() : 괄호 안의 값을 콘솔 출력 (줄바꿈 포함 x)
		 * java 에서는 마지막 끝처리가 ;
		 * 
		 * 문자 : String (첫 대문자) 클래스 사용 
		 */ 

		//prinln()
		System.out.println(12345);
		
		/* 숫자 : +, - (부호), 사직연산
		 * 문자열: "문자는 모두 큰따음표로 묶기"
		 * 한글자의 문자 : 'a' => char
		 */
		System.out.println("HelloWorld");
		System.out.println('a');
		// = 은 대입의 의미: 오른쪽의 리터럴 값을 왼쪽의 변수에 넣는다. 
		int number = 10;
		System.out.println(number);
		
		number = 20;
		System.out.println(number);
		
		String str = "abc";
		System.out.println(str);
		
		//---------------------
		byte b = 20;
		short s = 100;
		long l = 100; // 접미사 l/L 1과 비슷해서 대문자 L을 붙임
		float f = 1.1f; //접미사 f/F
		double d = 1.1;
		char ch = 'a';
		
		
		
		
		
	}

}
