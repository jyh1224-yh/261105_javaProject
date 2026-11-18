package day10;

public class Product {
	//제품 클래스 = 키오스크
	//판매제품명, 가격 (생성자만)
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//------------------------------
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	//------------------------------
	// 제품 하나 출력
	public void printProduct(int no) {
		System.out.println(no + ". " + name + "\t" + price + "원");
	}

	// 1. 전체 메뉴 출력
	public static void printMenu(Product[] menu) {
		System.out.println("====== 메뉴 ======");
		for (int i = 0; i < menu.length; i++) {
			menu[i].printProduct(i + 1);
		}
		System.out.println();
	}

	// 메뉴에서 제품명으로 찾기 (없으면 null)
	public static Product findProduct(Product[] menu, String name) {
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].getName().equals(name)) {
				return menu[i];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "[" + name + ":" + price + "]";
	}
	
}
