package day01;

public class Exam01 {

	public static void main(String[] args) {
		// %는 나머지를 나타내는 연산자(삼항연산자)
		// number 의 수가 짝수인지 홀수인지 출력 
		//넘버를 나누어서 나머지가 없으면 짝수 있으면 홀수
		
		int number = 20;
		System.out.println(number % 2);
		System.out.println(number % 2 == 0 ? "짝수" : "홀수");
		
		
		
	}

}
