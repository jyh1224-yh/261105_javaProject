package day10;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/*학생 정보를 관리하기 위한 클래스 생성
		 * 학생의 기본정보 : 이름, 전화번호, 주소 , 생년월일
		 * 학원정보 : 학원명(final) = "더조은", 지점 
		 * 수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
		 *        수상과목은 여러과목을 들을 수 있다.수강과목[5]/ 기간[5]
		 *        같은 번지는 같은 값으로 인지
		 * ex) 홍길동, 010-1111-2222,인천, 010513
		 *      더조은, 인천지첨
		 *       AI풀스택 (26.11.02 ~ 27.05.17)
		 *       JAVA, 26.10.01~ 26.11.01
		 */
	
		Student s = new Student("홍길동", "010-1111-1111");
		Student s1 = new Student("김영이", "010-1111-2222", "인천", "000505", "부평");
		Student s2 = new Student("철수", "010-1111-3333", "부천", "000505", "부평");
		Student s3 = new Student("영철", "010-1111-4444", "인천", "000505", "부평");
		Student s4 = new Student("순이", "010-1111-5555", "서울", "000505", "신촌");
		Student s5 = new Student("승철", "010-1111-6666", "인천", "000505", "부평");
		
		s.printInfo();
		s.printCompany();
		s.printCourse();
		
		System.out.println();
		s1.printInfo();
		s1.printCompany();
		s1.printCourse();
		s1.insertCousre("AI풀스택", "26.11.02 ~ 27.05.17");
		s1.insertCousre("java", "26.03~26.07");
		s2.insertCousre("AI풀스택", "26.11.02 ~ 27.05.17");
		s3.insertCousre("java", "26.03~26.07");
		s3.insertCousre("AI풀스택", "26.11.02 ~ 27.05.17");
		s2.insertCousre("java", "26.03~26.07");
		
		Student[] student = new Student[6];
		student[0] = s;
		student[1] = s1;
		student[2] = s2;
		student[3] = s3;
		student[4] = s4;
		student[5] = s5;
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		
		for(int i=0; i<student.length; i++) {
		System.out.println(student[i]);
	}
	//인천 사는 학생만 출력
		
		for(int i=0; i<student.length; i++) {
			if(student[i].getAd() !=null && student[i].getAd().equals("인천")) {
				student[i].printCompany(
						);
				student[i].printInfo();
			}
		}
		
		
		
		
	// ai 풀스택 과정을 수강하는 학생만 출력 - 학생정보,수강정보
	int cnt=0;	
	while(cnt<student.length) {
	
			for(int i=0; i<student[cnt].getIndex();i++) {
				if(student[cnt].getCourse()[i].equals("AI풀스택")) {
					student[cnt].printInfo();
					student[cnt].printCourse();
				}
			}
		}
cnt++;
	}

}
