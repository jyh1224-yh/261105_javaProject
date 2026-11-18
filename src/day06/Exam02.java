package day06;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => 확장자가.jpg .png
		// 없으면 그림 파일이 없습니다.

		Scanner scan = new Scanner(System.in);

		String[] filName = { "이것이 자바다.java", "java의정석.java", "arrat.txt", "array.java", "String.txt",
				"StringMethod.jpg", "ArrayMethod.jpg", "method.png", "javaMethod.png" };

//		System.out.println("검색어를 입력하세요");
//		String search = scan.next();
//		System.out.println("--"+search+"포함 fileList");

		// System.out.println(filName.indexOf("."));

		int cnt = 0;
		for (int i = 0; i < filName.length; i++) {
			if (filName[i].substring(filName[i].indexOf(".")).equals(".jpg") || filName[i].substring(filName[i].indexOf(".")).equals(".png") ) {
				System.out.println(filName[i]);
				cnt++;
			}
		}
		if (cnt > 0) {
			System.out.println(cnt+"개 검색");
		} else {
			System.out.println("일치하는 항목이 없습니다");
		}

		scan.close();
	}

}
