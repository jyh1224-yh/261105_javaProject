package day06;


import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력(포함 스트링1번 컨테인즈)
		// 검색어를 포함하는 파일이 없다면 => "일치하는 항목이 없습니다" 출력
		//String을 입력 받을 때는 String Search = scan.next(); //한 단어 입력
		
		int cnt =0; //검색어 객수로 확인
		//boolean check =false; // 키워드
		
		Scanner scan = new Scanner(System.in);
		
		String[] filName = {
				"이것이 자바다.java", "java의정석.java","arrat.txt",
				"array.java", "String.txt", "StringMethod.jpg",
				"ArrayMethod.jpg", "method.png", "javaMethod.png"
		};
	
		//대소문자 구분없이 검색
		
		//System.out.println(Arrays.toString(filName));
		System.out.println("검색어를 입력하세요");
		String search = scan.next().toLowerCase();
		
		//검색어다 filName 포함되어 있는지 확인 (contains)
		
		System.out.println("--"+search+"포함 fileList");
		
		for(int i =0; i<filName.length; i++) {
			if(filName[i].toLowerCase().contains(search)) {
				System.out.println(filName[i]);
				cnt++;
			}
		}
		
		if(cnt > 0) {
			System.out.println(cnt + "개 검색" );
		} else {
			System.out.println("일치하는 항목이 없습니다");
		}
		
		
		
		
		
		
		
		scan.close();
	}

}
