package day05;

public class Exam02 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 성벌, 나이를 출력
		//String regNum = "020101-3234567"; // 2000년 => 3(남), 4(여)
		
		//출력결과
		/*생년월일 : 990101
		 * 성별 : 남
		 * 나이 : 28
		 */
		String regNum = "990101-1234567"; // 1999년 => 1(남), 2(여)
	
		
		int today = 2026;
		
		int year = Integer.parseInt(regNum.substring(0,2)); //String 으로 시작해서 (regNum.substring(0,2)); 붙이고 숫자가 되었기
		//때문에 String => int 로 바꿈
		
		
		System.out.println("생년월일: "+ regNum.substring(0, regNum.indexOf("-")));
		String gen = regNum.substring(regNum.indexOf("-")+1,8);
		System.out.println(gen.equals("1")); // equal 써여함 char는 == 가능
		
		System.out.println("-----");
		
		int num2 = Integer.parseInt(gen);
		if(num2 <= 2 ) {
			year = year+1900;
		
		} else  {
			year = year+2000;
			
		}
		
		int age = today-year;
		System.out.println("나이: "+age);
		System.out.println("성별: "+ ((gen.equals("1")|| gen.equals("3")) ? "남" : "여"));
		
		
		
		
		//System.out.println(regNum.substring(regNum.indexOf("-")+1,8));
		///if(regNum == "1" || regNum =="3") { //String은 스트링과 비교해야 되서 "" 필요
		//} else if(regNum == "2" || regNum == "4")
			 //System.out.println("여자");
		
		
		
		
	}

}
