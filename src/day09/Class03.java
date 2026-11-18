package day09;

public class Class03 {

	public static void main(String[] args) {
		// 클래스 생성
		/* 학생이름, 국어점수, 영어점수, 수학점수 를 객체로 하는 클래스 생성
		 * 이름은 스트링 나머지는 int / 
		 * 이름 (국어, 영어, 수학) => 출력메서드
		 * 메서드를 호출하면 국어+ 수학 + 영어 리턴되는 => 합계 메서드
		 * 메서드를 호출하면 합계/3 평균이 리턴되는 => 평균메서드
		 * 각각 멤버변수의 getter/setter 생성
		 * 점수 범위는 setter 하기전에 if로 달아서 setter
		 * */
		
		StudentClass s = new StudentClass();
		//s.print();
		
		s.setName("jyh");
		s.setKor(34);
		s.setEng(46);
		s.setMath(56);
		s.print();
		int sum = s.sum(); // s.s 입력 후 받는게 있어야 하기때문에 int
		System.out.println("합계 :" + sum);
		double avg = s.avg(); // 같은 의미로 받고 평균을 보여야 하기 때문에 avg
		System.out.println("평균 :" + avg);
		StudentClass[] studentArr = new StudentClass[10];
		studentArr[0] = new StudentClass();
		studentArr[0].setName("영이");
		studentArr[0].setKor(42);
		studentArr[0].setEng(43);
		studentArr[0].setMath(76);
		
		
	}

}


class StudentClass {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	//내가 만드는 메서드
	// print
	// sum
	// avg
	
public void print() {
	System.out.println("이름 : " + name + "[" + kor +","+ eng+"," + math + "]");
} //this는 파란색이 아닐 떄 

// 메서드를 호출하면 국어+ 수학 + 영어 리턴되는 => 합계 메서드

public int sum() {
	return kor+eng+math;
}
public int avg()	{
	return (kor+eng+math)/3;
}

public String getName() {
	return this.name;
}
public int getKor() {
	return this.kor;
}
public int getEng()	{
	return this.eng;
}
public int getMath() {
	return this.math;
}
//================
public void setName(String name) {
	this.name = name;
}

public void setKor(int kor) {
	if(kor <0 || kor>100) {
	return;	
	}
	this.kor = kor;
}
public void setEng(int eng) {
	if(eng <0 || eng>100) {
	return;	
	}
	this.eng = eng;
}
public void setMath(int math) {
	if(kor <0 || kor>100) {
	return;	
	}
	this.math = math;
}






}