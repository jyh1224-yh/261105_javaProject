package day11;

public class Method08 {
	
	//fact : 숫자를 입력받아 1~자신까지 곱한 값을 리턴하는 메서드
	//매개변수 : 숫자 1개 => int num
	//리턴타입 : 곱한 결과 => int 
	public int fact(int num) {
		int result = 1;
		if(num<0) {
			return 0;
		}
		if(num==0 || num ==1) {
			return 1;
		}
		for(int i=1; i<=num;i++) {
			result *=i;
		}
		return result;
	}
	//재귀메서드로 변경'
	public static int factorial(int num) {
		if(num<0) {
			return 0;
		}
		if(num==0 || num ==1) {
			return 1;
		}
		return num * factorial(num-1); //첫번째 턴 5 * 4 * 3* 2 * 1
	}

	public static void main(String[] args) {
		// 재귀메서드 : 메서드 안에 자신의 메서드를 호출하는 메서드
		// ! : 팩토리얼
		// 1~ 자신의 수까지 곱한 값을 리턴
		// 0! => 결과는 1 (곱하기의 기본값은 1, 더하기는 0)
		// 1! => 1
		// 2! => 1*2
		// 3! = 1*2*3
		// 4! => 1*2*3*4
		
		Method08 m = new Method08();
		System.out.println(m.fact(6));
		
		System.out.println(m.factorial(6));
		
	}

}
