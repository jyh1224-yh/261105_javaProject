package day11;

public class CardMain {

	public static void main(String[] args) {
		// Card c = new Card() => ♥A
		//모양 : ♥, ♣, ◆, ♠
		Card c = new Card();
		CardPack pack = new CardPack();
		
		System.out.println(c);
		c.print();
		c.setShape("♣");
		c.setNum(12);
		c.print();
		System.out.println();
		System.out.println("=============");
		String shape[]	= {"♥", "♣", "◆", "♠"};
		
//		for(int i=0; i<shape.length; i++) {
//			for(int j=0; j<=13;j++) {
//				Card c1 = new Card();
//				c1.setShape(shape[i]);
//				c1.setNum(j);
//				
//				c1.print();
//				
//			}
//			System.out.println();
//		}
		//카드 pack 객체생성
	System.out.println("딜러가 카드를 섞고 있습니다.");
	
	System.out.println("딜러가 카드를 나누고 있습니다");
	
	//player 4명
	System.out.println("player1 카드 pick");
	//메서드 호출
	System.out.println("player2 카드 pick");
	System.out.println("player3 카드 pick");
	System.out.println("player4 카드 pick");
	
	System.out.println("player1 카드 Open");
	//카드 출력
	System.out.println("player2 카드 Open");
	System.out.println("player3 카드 Open");
	System.out.println("player4 카드 Open");
		
	}

}
