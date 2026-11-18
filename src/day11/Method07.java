package day11;

public class Method07 {

	public int sum(int ...num) {
		//...num => num을 배열로 인식
		int result =0;
		for(int tmp : num) {
			result += tmp;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 가변인자 메서드
		// - 매개변수의 개수가 고정되어 있지 않을 경우  => ...
		//

		
		Method07 m = new Method07();
		System.out.println(m.sum(1,2,3,4,5,6,7,8,9,6,4,6,7,8));
		System.out.println(m.sum(1,2,3,4,5,6,7,8,9,6,4,6,7,8,6,7,8,6));
	}

}
