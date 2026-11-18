package day08;

import java.util.Arrays;

public class Exam01 {
	// 1. 랜덤수를 리턴하는 메서드 (1~45)
	/*
	 *  매개변수 : 없음
	 *  메서드명 : 1~45
	 *  리턴타입 :랜덤수 = > 정수 => int 
	 */
	public int makeRandom() {
		return (int) (Math.random() * 45)+1;
	}
	
	// 범위를 입력받아 해당 범위의 랜덤수를 리턴하는 메서드
	// 1~45 / 1~6 / 1~52
	public int makeRandom(int count, int start) {
		return(int)(Math.random()*count)+start;
	}
	
	//범위로 랜덤수 생성
	public int makeRandom2(int begin, int end) {
		// 1~45 => 45개 / 10~45 =>36 end - begin +1
		return(int)(Math.random()*end-begin +1 )+begin;
	}
	
    //===================================================
	// 2. 중복환인 매서드 : 배열에 정수가 있는지 확인
	// - 매개변수 ( 배열, 정수)
	/* 매개변수 : 배열 int[] arr / 정수 int num 
	 * 메서드명 : joobk 
	 * 리턴타입 : boolean
	 */

	public boolean joobk(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
			
		}
		return false;
	}

    //===================================================
	// 3. 배열을 매개변수로 받아 랜덤수(1번 호출)를 중복x(2번 호출)채워주는 매서드
	/*
	 * 매개변수 : 배열 => int[] arr
	 * 메서드명 : 
	 * 리턴타입 : void
	 */
	public void randomArray(int[] arr) {
		int i = 0;
		while( i<arr.length) {
			
			int random = makeRandom2(1, 45);
			if(!joobk(arr, random)) { //조건이 false라면 !
				arr[i] = random;
				i++;
			}
		}
	}
//	기존에  만들었던 포문
	// for (int i = 0; i < arr.length; i++) {
//			int r = makeRandom();
//			if(!joobk(arr, r)) {
//				arr[i] = r;
//			}else {
//				i--;
//			}
//				
//		}
//
//	}
	
	//===================================================	
	// 4. 배열을 출력하는 메서드( 한 매서드에서 length 에서 각 각)
	// - 사용자 번호는 그냥 출력으로 1 2 3 4 5 6 
	// - 당첨번호 1 2 3 4 5 6 [7]
	//매개변수 int [] arr
	//메서드 print
	//리턴 void
	public void print(int[] arr) {
		if(arr == null || arr.length <=0) {
			System.out.println("출력할 자료가 없습니다.");
			return;
		}
		for(int i =0; i<6; i++) {
			System.out.print(arr[i]+ " ");
		}
		if(arr.length == 7) { 
			System.out.print("["+ arr[arr.length-1]+"]");
		}
		System.out.println();
	}
	
	//===================================================
	// 5. 당첨을 확인하는 메서드 (리턴을 하거나 바로 출력)
	// - 사용자 번호, 당첨번호 받아서 등수를 리턴하는 메서드
	// 6개 일치 : 1등 (순서는 상관 x, 보너스 제외)
	/* 5개 일치 + 보너스 번호 = 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지는 꽝
	 * */
	public int ranking(int[] user, int[]lotto) {
		if(user == null || lotto == null || user.length <=0 || lotto.length<=0) {
			//System.out.println("배열오류");
			return -999999;
		}
		//유저랑 로또에 대한 배열 위치가 바뀌어서 들어올 때 
		if(user.length >= lotto.length) {
			return -999999;
		}
		int count=0; //일치 개수 카운트 (보너스는 제외)
		for(int i=0; i<user.length; i++) {
			if(joobk(user,  lotto[i])) {
				count++;
			}
		}
		switch(count) {
		case 6: return 1;
		case 5: return joobk(user, lotto[lotto.length-1]) ? 2:3;
//			if(joobk(user, lotto[lotto.length-1])) {
//				return 2;
//			}else {
//				return 3;
//			}
		case 4: return 4;
		case 3: return 5;
		default : return 0;
		}
	}
	
	//===================================================
	public static void main(String[] args) {
		// 로또 만들기
		/* 로또 만들기
		 * - 사용자 번호 (6자리) 3번에서 채우기
		 * - 당첨 번호(7자리) 3번에서 채우기
		 * */
		
		int user[]	= new int[6];
		int lotto[]	= new int[7];
		
		Exam01 e = new Exam01();
		System.out.println(	e.makeRandom(6, 1));
		System.out.println(e.makeRandom2(1, 10));
		
		
		e.randomArray(user);
		//System.out.println(Arrays.toString(user));
		e.randomArray(lotto);
		//System.out.println(Arrays.toString(lotto));
		System.out.println("===유저번호===");
		e.print(user);
		System.out.println("===당첨번호===");
		e.print(lotto);
		
		
		int ranking = e.ranking(user, lotto);
		if(ranking == -999999) {
			System.out.println("배열오류");
		} else if(ranking==0) {
			
			System.out.println("꽝");
		} else {
			System.out.println(ranking +"등 당첨!");
		}
		

	}

}
