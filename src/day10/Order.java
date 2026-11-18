package day10;

public class Order {
	//주문 클래스
	//상품명, 개수, 가격(판매금액), 금액(개수*가격)
	
	//주문추가할 수 있음(코스 추가처럼)
	//배열로 만들 필요는 없음
	
	private String name;
	private int price;
	private int qty;
	private int sum;
	
	
	public Order(Product p, int qty) {
		this.price = p.getPrice();
		this.qty = qty;
		sum();
	}

	// 금액 계산
	public void sum() {
		this.sum = price*qty;
	}

	// 같은 제품을 다시 주문하면 수량 추가 (코스 추가처럼)
	public void addQty(int qty) {
		this.qty+=qty;
		sum();
	}

	//------------------------------
	public String getName() {
		return name;
	}

	public int getSum() {
		return sum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
//------------------------------
	public void printOrder() {
		System.out.println(name +"\t"+qty +"\t"+ price + "\t : " + sum);
	}

	//  배열이 다 차면 2배 크기로 복사해서 돌려줌
	public static Order[] grow(Order[] orders) {
		Order[] tmp = new Order[orders.length * 3];
		for (int i = 0;i < orders.length;i++) {
			tmp[i] = orders[i];
		}
		System.out.println(tmp.length);
		return tmp;
	}

	// 6. 영수증 출력
	public static void printReceipt(Order[] orders, int cnt) {
		System.out.println("\n========= 영수증 =========");
		System.out.println("상품\t수량\t가격\t금액");
		int total = 0;
		for (int i = 0;i <cnt;i++) {
			orders[i].printOrder();
			total += orders[i].getSum();
		}
		System.out.println("--------------------------");
		System.out.println("총 지불금액\t\t" + total);
	}

	@Override
	public String toString() {
		return "[" + name + ", 1개 가격=" + price + ", 수량=" + qty + ", 총 금액=" + sum + "]";
	}

	
	
	
	
}
