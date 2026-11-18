package day11;

public class Card {
	//숫자 : (1~13) 1(A), 11(J), 12(Q), 13(K),
	//모양 : ♥, ♣, ◆, ♠
	
	/* ex) ♥A, ♥5 , ♣11 => ♣J / !2 => ♥2
	 * 범위에 없는 모양이면 => ♥
	 * 범위에 없는 숫자면 => 1 => A
	 * */
	
	/* 멤버변수 : 숫자(num), 모양(shape) 
	 * - getter/ setter / toString
	 * - 출력메서드 (숫자 입력되면 A J Q K 가 입력되면 영어로 변경해서 출력)
	 * */
	
	private int num;
	private String shape;
	
	public Card()	{
		this.num = 1;
		this.shape ="♥";
				
	}
	
	//프린트 메서드
	// (숫자 입력되면 A J Q K 가 입력되면 영어로 변경해서 출력)
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 1: System.out.print("A");
		break;
		case 11: System.out.print("J");
		break;
		case 12: System.out.print("Q");
		break;
		case 13: System.out.print("K");
		break;
		default : 
			System.out.print(num);
		}
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		//범위 설정
		if(num <1 || num>13) {
			num =1;
			return;
		}
		//System.out.println(shape + num);
		this.num = num;
	}
	
	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
		switch (shape)	{
		case "♥": case"◆" : case"♣" : case"♠": 
			this.shape = shape;
			break;
			default : this.shape ="♥";
		}
		
			//System.out.println(shape + num);
			//모양범위 설정
	}

	@Override
	public String toString() {
		return " [" + shape + num + "]";
	}
	
	
	

}
