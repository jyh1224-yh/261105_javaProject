package day02;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// 정수 2개와 연산자 1개를 입력을 받아라 두 정수의 연산 결과를 출력
		// 2 3 + => 2 + 3 =5
		// 2 3 - => 2 - 3 =-1
		// 입력 가능한 연산자는  + - * / % 
		// 그외의 문자 입력시 빠져나간다 return
		// 연산자 입력은 string(equals) char 가능
		
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*50)+1;
		System.out.println(random);
		
		int ran = (int)(Math.random()*50)+1;
		System.out.println(ran);
		
		char op = scan.next().charAt(0);
		switch (op) {
		case '+' :
			System.out.println(random + "과"+ ran +"더한 값 :"+ (random + ran));
			break;
		case '-' : 
			System.out.println(random + "과 "+ ran +"뺀 값 : " + (random - ran));
			break;
		case '*' :
			System.out.println(random + "과 "+ ran +"곱한 값 : " + (random * ran));
			break;
		case '/' :
			System.out.println(random + "과 "+ ran +"나눈 값 : " + (random / ran));
			break;
		case '%' :
			System.out.println(random + "과 "+ ran +"나눈 값의 나머지 값 : " + (random % ran));
			break;
			default:
			System.out.println("입력 가능하지 않습니다.");
			
		
			
		scan.close();
	
				
		}
		

	}

}
