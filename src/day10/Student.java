package day10;

import java.util.Arrays;

public class Student {
	/*학생 정보를 관리하기 위한 클래스 생성
	 * 학생의 기본정보 : 이름, 전화번호, 주소 , 생년월일
	 * 학원정보 : 학원명(final) = "더조은", 지점 
	 * 수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
	 *        수상과목은 여러과목을 들을 수 있다.수강과목[5]/ 기간[5]
	 *        같은 번지는 같은 값으로 인지
	 *        
	 *        
	 *        
	 * ex) 홍길동, 010-1111-2222,인천, 010513
	 *      더조은, 인천지첨
	 *       AI풀스택 (26.11.02 ~ 27.05.17)
	 *       JAVA, 26.10.01~ 26.11.01 <- 추가되는 ㄴ정보
	 *       
	 * 과목을 추가하는 메서드
	 * - 수강과목이 5개를 넘어가면 배열을 늘려서 처리(중복가능) tv참고
	 * 
	 * 각 정보를 출력하는 메서드
	 * - 수강정보를 출력할 때 수강정보가 없다면 => 수강정보가 없습니다.( 출력) tv 선호채널 참고
	 * 
	 * getter/setter, toString, 생성자
	 */
	
	// 학생 정보

	private String name;
	private String ph;
	private String ad;
	private String bh;

	//학원정보
	//final 회사명 브랜드 로고 모두 대문자
	private final String COMPANY ="더조은";
	private String branch;
	
	//수강정보
	private String[] course = new String[5];
	private String[] period = new String[5];
	
	//멤버변수에 배열이 존재한다면 index 변수를 함꼐 쓰는 것이 편리
	private int index;
	
	//생성자
	public Student() {}
	public Student(String name, String ph) {
		this.name = name;
		this.ph = ph;
	}
	
	public Student(String name, String ph, String ad, String bh, String branch) {
		super(); //조상의 생성자 호출
		this.name = name;
		this.ph = ph;
		this.ad = ad;
		this.bh = bh;
		this.branch = branch;
	}
	
	public Student(String name, String ph, String ad) {
		this(name, ph);
		this.ad = ad;
	}

//출력 메서드
	public void printInfo() {
		System.out.println("---학생정보---");
		 System.out.println(name+"("+bh+")"+ph);
	}
	public void printCompany() {
		System.out.println("---학원정보---");
		System.out.println(COMPANY+"["+branch+"]");
	}
	
	public void printCourse() {
		if(index == 0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		//출력은 index까지만
		for(int i=0; i<index; i++) {
			System.out.println(course[i]+" / "+ period[i]);
		}
	}

	//수강과목 추가 메서드
	//1번 호출될 때마다 수강과목/ 기간 추가
	public void insertCousre(String course,String period) {
		if(index == this.course.length) {
			//배열복사 늘리기
			String[] courseTemp = new String[this.course.length+3];
			String[] periodTemp = new String[this.period.length+3];
			
			System.arraycopy(this.course,0 , courseTemp, 0, this.course.length);
			System.arraycopy(this.period,0 , periodTemp, 0, this.period.length);
			
			this.course = courseTemp;
			this.period = periodTemp;
		}
		this.course[index] = course;
		this.period[index] = period;
		index++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public String getCOMPANY() {
		return COMPANY;
	}
	
	
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ph=" + ph + ", ad=" + ad + ", bh=" + bh + ", COMPANY=" + COMPANY
				+ ", branch=" + branch + ", course=" + Arrays.toString(course) + ", period=" + Arrays.toString(period)
				+ ", index=" + index + "]";
	}
	
	
	
	
	
}



	




