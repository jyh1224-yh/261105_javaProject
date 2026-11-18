package day08;

public class Method03 {
	/* 변수의 종류
	 * 지역변수 : 메서드 안에서 사용 (일반변수)
	 *  매개변수 : 메서드에서 전달 받는 변수
	 *  멤버변수 : 클래스의 속성 (클래스 안에서 사용)
	 *  
	 *  모든 변수의 스코프는 { }
	 *  
	 *  ----------------
	 *  변수가 어떤 것을 저장하느냐에 따라 분류
	 *  일반변수 : 값을 저장 => 기본 8 자료형
	 *  참조변수 : 변수 안의 주소를 저장 => 그외
	 *  
	 */
	int a; // 멤버변수
	
	/* 정수 하나를 입력받아 해당 정수의 구구단을 출력
	 * 매개변수 : int
	 * 메서드명 : dan
	 * 리턴타입 : 
	 * */
	public void gg(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan+ "*" + i + "=" + (dan*i) );
		}
		
	}//for 처럼 갈호가 끝나면 끝.
	
	

	public static void main(String[] args) { // 매개변수
		/*
		 * 
		 * */
		//구구단 출력하는 메서드
		//호출을 할려면 객체생성
		int number = 4;
		Method03 a = new Method03();
		a.gg(number);//void를 줄게 없어서 int는 안됨
		a.gg(5);
		
	//구구단 메서드를 활용하여 전체 구구단 출력
		for(int i =2; i<=9; i++) {
			a.gg(i);
		}
		
		

	}

}
