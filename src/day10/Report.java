package day10;

import java.text.DecimalFormat;

public class Report {
	//한사람 성적 클래스
	// 멤버 변수 : 이름, 국어, 영어, 수학, 합계, 평균, 등수
	// 생성자 : 이름, 국어, 영어, 수학 => 매개변수로 등록
	// 기본 생성자도 같이 오버로딩 해서 생성
	// 합계, 평균계산
	
	// # : 선택 해당 자리수가 있으면 출력 없으면 안함.
	// 0 :필수 해당 자리수가 없으면 0으로 맞춰서 출력
	// 출력하는 메서드 생성 => 소수점 2자리 DecimalFormat("##.00")
	// DecimalFormat("##.00") => 객체명.format(avg)
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
	
	public Report() {}
	
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum();
		avg();
	}
	
	public void sum() {
		this.sum = kor+eng+math;
	}
	public void avg() {
		this.avg = (double)(kor+eng+math) / 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		DecimalFormat d = new DecimalFormat("##.00");
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t"
				+ d.format(avg) + "\t" + rank;
	
	
}
}
