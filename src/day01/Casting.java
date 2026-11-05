package day01;

public class Casting {

	public static void main(String[] args) {
		// casting : 자료의 형태를 변환하는 것
		// a = b; 두 변수의 자료형이 맞지 않다면 오류 
		// 자동 자료형 변환 : auto casting 
		// byte < short < (char) < int < long
		// float < double 
		// 명시적 자료형 변환 : 변수 앞에 (타입)변수
		
		byte b = 11;
		int a = b; // auto casting
		
		int aa = 111;
		byte c = (byte)aa; // 명시적 캐스팅
		System.out.println(c);
		
		long l = a;
		
		double d = 3.14159;
		int pi = (int)d;
		
		System.out.println(d); 
		System.out.println(pi); 
		
		int number = 100;
		double num = number;
		System.out.println(num); //.0소수점 생김
		
		//--------
		
		//문자를 숫자로 : string -> int
		//"123" -> 123
		
		
		String str = "123";
		System.out.println(str + 10); 
		//str을 문자로 인식해서 12310이 됨

		// 기본 8가지 자료형 클래스 타입의 타입이 존재
		// 추가기능 제공 (래퍼 클래스 : wrapper class)
		// int -> Integer / char : Character
		// float -> Float / double : Double / boolean -> Boolean
		// byte : Byte / short : Short / long : Long
		
		int strnumber = Integer.parseInt(str);
		System.out.println(strnumber + 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
