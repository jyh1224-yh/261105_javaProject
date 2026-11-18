package day09;

public class Class04 {

	public static void main(String[] args) {
		
		Car c = new Car("카니발", 2025);
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		
	
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
		
		c.power();
		
		
		
		
	}

}

class Car{
// 기능 : 시동켜기 , 시동크기. 속도 up, 속도 down
/* power, speed
 * name, year
 * 
 * power : 
 * */
	 private String name;
	 private int year;
	 private boolean power;
	 private boolean powerPrint;
	 private int speed;
	 
	 //생성자 - 멤버변수 아래
	 /* 객체를 생성할 떄 (new) 초기값을 지정해주는 역할
	  * 기본생성자 : 컴파일러가 자동으로 제공( 컴파일시 생성자가 없으면..)
	  * - object = null / 숫자=0 / boolean = false
	  * - 다른 생성자가 존재하면 자동으로 주지 않음
	  * 기본생성자는 사용자가 직접 생성가능
	  * 생성자는 여러개 생성 가능( 생성자 오버로딩)
	  * 생성자 오버로딩 조건 : 매개변수의 개수가 다르거나, 타입이 달라야함
	  * 
	  * 생성자 이름은 클래스 이름과 동일
	  * 생성자는 리턴타입이 없는 메서드와 같은 구조. void가 아니라 자체가 없다
	  *  public 클래스명(매개변수) {
	  *   멤버 변수 값 설정;
	  *  }
	  * */
	 public Car() {} //기본 생성자
	 
	 // 매개변수로 이름과 연식을 받아서 제공
	 public Car(String name, int year) {
		 this.name = name;
				 this.year = year;
	 }

	 
	 
	 //시동켜기(끄기) 한번에
	 public void power() {
		 if(speed ==0) {
			 power = !power;
			 powerPrint();
		 } else {
			 System.out.println("ERROR!!");
		 }
	 }
	//파워 출력 메서드
	 public void powerPrint() {
		 if(power) {
		 System.out.println(name+"("+ year + ")" + "[시동 켜짐]");
	 } else 
		 System.out.println(name + "("+ year + ")" + "[시동 꺼짐]");
		 //System.out.println((power ? "on" : "off") + "/" + speed);
	 }
	 
	 //스피드 0~200
	 public void speedUp() {
		 if(power) {
			 this.speed +=30;
			 if(speed >200) {
				 System.out.println("속도를 줄이세요");
				 speed =200;
				
			 }
			 System.out.println("speed :" + speed);			 
		 }
	 } 
	 
	 public void speedDown() {
		 if(power) {
			 this.speed -= 30;
			 if(speed <0) {
				 System.out.println("속도를 올리세요");
				 speed =0;
			 }
		 }
		 System.out.println("speed :" + speed);
	 }

	 
	

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public int getYear() {
		 return year;
	 }

	 public void setYear(int year) {
		 this.year = year;
	 }

	 public boolean isPower() {
		 return power;
	 }

	 public void setPower(boolean power) {
		 this.power = power;
	 }

	 public boolean isPowerPrint() {
		 return powerPrint;
	 }

	 public void setPowerPrint(boolean powerPrint) {
		 this.powerPrint = powerPrint;
	 }

	 public int getSpeed() {
		 return speed;
	 }

	 public void setSpeed(int speed) {
		 this.speed = speed;
	 }
	 
	 //======
//	 public void carName(String name) {
//		 this.name = name;
//	 }
	 
	 
}