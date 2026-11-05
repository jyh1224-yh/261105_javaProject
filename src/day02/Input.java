package day02;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// input class
		//console input: 콘솔에서 값을 입력받는 것을 의미
		//Scanner 클래스: 입력받는 값의 형식 변환을 편히하게 해주는 클래스
		// 클래스 객테를 생성해야 사용할 수 있다. => new 키워드를 사용
		
		//기본자료형(8개) => 타입 변수명 => 값; int number = 1;
		//나머지는 클래스 자료형 => 클래스명 객체명 = new 클래스명(값); 값은 있어도되고 없어도됨
		
		Scanner scan = new Scanner(System.in);
		
		// 스캐너를 이용해서 입력을 받을 때 sacn.메서드
		//scan.next() : 한 문자만 입력(한단어) 띄어쓰기를 포함하지 않음 => String
		//scan.nextLine() : 여러단어 입력 가능 공백 포함 => String
		//scan.nextInt() : 정수입력 => int
		//scan.next자료형() : 해당 자료형으로 입력 => 자료형
		
		System.out.println("이름을 입력해두세요 >");
		
		String name = scan.next();
		System.out.println("이름: " + name);
		
		//나머지 데이터를 버리는 작업
		scan.nextLine();
		
		System.out.println("점수를 입력해주세요 >");
		int number = scan.nextInt(); //정수는 int를 받기 때문에 int
		System.out.println("점수: " + number);
		
		//숫자를 입력받아 짝수인지 홀수인지 출력
		
		if(number % 2 == 0 ) {
			System.out.println("짝수");	
		}else {
			System.out.println("홀수");
		}
		//System.out.println(number % 2);
		//System.out.println(number % 2 == 0 ? "짝수" : "홀수");
		
		
		//char : 아스키 코드의 한글자 입력 
		//nextChar는 없음
		//scan.next().charAt(글자의 위치) abc  - 입력 받은 첫번째 하나의 단어만 입력 a 아스키 코드로 변환 => char
		//scan.next().charAt(0) 항상 모든 시작위치는 0부터 - > 그래서 abc중에 a를 고르면 첫번째 0
		System.out.println("한글자만 입력 >");
		char ch = scan.next().charAt(0);
		System.out.println("입력받은 글자 >" + ch);
		
		
		scan.close(); //꼭 닫기 해야함
	}

}
