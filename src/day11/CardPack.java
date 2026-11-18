package day11;

import java.util.Arrays;

public class CardPack {
	// 총 52장의 Card 객체를 배열로 저장 pack
	/*
	 * ♥A~♥K / ◆A~◆K / ♣A~♣K / ♠A~♠K
	 * 
	 * 멤버변수 : 52장의 Card 객체를 담을 수 있는 배열 + 번지 - 생성자 : pack 의 초기값을 52장의 카드로 초기화 - 메서드
	 * 1. 카드를 섞는 기능 2. 플레이어에게 한장씩 나눠주는 기능 3. 카드를 초기화 기능(나눠준 카드 회수)
	 */
	private Card[] pack = new Card[52]; // 초기값 null
	String shape[] = { "♥", "♣", "◆", "♠" };
	private int index;
	
	
	
	
	public void arraySort(int[] arr) {
		if(arr==null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			// 번지는 랜덤으로 선택(0~4)
			int index = (int) (Math.random() * arr.length);
			int t = arr[i];
			arr[i] = arr[index];
			arr[index] = t;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public CardPack() {
		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j <= 13; j++) {
				Card c1 = new Card();
				c1.setShape(shape[i]);
				c1.setNum(j);
				pack[index]=c1;
				index++;
			}
			System.out.println();
		}
	}



	public Card[] getPack() {
		return pack;
	}



	public void setPack(Card[] pack) {
		this.pack = pack;
	}



	public String[] getShape() {
		return shape;
	}



	public void setShape(String[] shape) {
		this.shape = shape;
	}



	public int getIndex() {
		return index;
	}



	public void setIndex(int index) {
		this.index = index;
	}


	@Override
	public String toString() {
		return "CardPack [pack=" + Arrays.toString(pack) + ", shape=" + Arrays.toString(shape) + ", index=" + index
				+ "]";
	}
	
	
	
}
