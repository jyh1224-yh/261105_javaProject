package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/* product(상품) class: 상품명,가격(판매금액)
		 * order(주문) class : 상품명, 개수, 가격(판매금액), 금액(개수*가격)
		 * 
		 * 
		 * 
		 * 
		 * */
		//Product[] menu = new Product[5]; //=> 상품리스트
		//임의의 상품등록
		//주문=> oder 객체 발생 => Oder[] = new Oder[5];
		
		/* 1. 전체 제품 보여주기(라면 과자 참고)
		 * 2. 주문 > 제품명, 수량 입력받기
		 * 3. oder 객체 생성 => 추가
		 * 4. 반복주문 => 종료키워즈 생성 반복 주문이 가능하도록
		 * 5. oder => 배열이 다 차면 배열 증가(배열 복사)
		 * 6. 주문 완료시 => 영수증 출력(전체 주문내역 / 총 지불금액)
		 * 
		 * 
		 * ex) 
		 * 김밥 2 3000 => 6000
		 * 라면 3 2000 => 6000
		 * 사이다 2 500 => 1000
		 * -------------------
		 * 총 지불금액    13000
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		Product p = new Product("김밥", 3000);
		Product p1 = new Product("라면", 2000);
		Product p2 = new Product("사이다", 500);
		Product p3 = new Product("국수", 2000);
		Product p4 = new Product("콜라", 600);
		
		Order[] order = new Order[5];
		int orderIndex =0;
		
		System.out.println();
		
		
		Product[] menu = new Product[5]; 
		menu[0] = p;
		menu[1] = p1;
		menu[2] = p2;
		menu[3] = p3;
		menu[4] = p4;
		
		for(int i=0; i<menu.length; i++) {
			System.out.println(menu[i]);
		}
	
		//int count[] = new int[menu.length];
		int name =0;
		int sum =0;
		
		do {
			System.out.println("<menu>");
			System.out.println("1."+p + "| 2." +p1 + "| 3."+ p2 + "| 4." +p3 +"| 5." +p4 + "| 0. 종료");
			System.out.println("===주문하기===");
			name = scan.nextInt();
			
			if(name <1 || name >6) {
				System.out.println("다시입력");
				continue;				
			} else if ( name == 6) {
				System.out.println("종료");
				break;
			} else {
				System.err.println("수량입력");
				int count = scan.nextInt();
//				String pro= menu[name-1].getName();
//				int price = menu[name-1].getPrice();
				Order o = new Order(menu[name-1],count);
				System.out.println(o);
				order[orderIndex]=o;
				orderIndex++;
				//count[name - 1]++;
			}
			
		} while (name !=6);
		for (int i = 0; i < orderIndex; i++) {
			//
			System.out.println(order[i]);
			sum+=order[i].getSum();
		}
		System.out.println("-----------------");
		System.out.println("총 금액 : " + sum);
		
		
		
		
	scan.close();
		
		
		
	}

}
