package day09;

import java.util.Arrays;

public class Class05 {

	public static void main(String[] args) {
		// 
		TV v = new TV("소니");
		v.power();
		v.chDown();
		
		v.chUP();
		v.volUp();
		v.volDown();
		
		v.chUP();
		v.chUP();
		v.chUP();
		
		v.fav();
		v.favList();
		
		v.chUP();
		v.chUP();
		
		v.fav();
		v.favList();
		v.chUP();
		v.fav();
		v.chUP();
		v.chUP();
		v.fav();
		v.chUP();
		v.chUP();
		v.fav();
		v.chUP();
		v.fav();
		v.chUP();
		v.chUP();
		v.fav();
		v.chUP();
		v.fav();
		
		v.power();
		
	}
	
}



class TV{
	/* brand, power, ch, vol, favor[]
	 * 파워를 켜야 채널 돌릴 수 있음
	 * 채널은 20번까지 가고 0~1로 돌아오는 순환구조
	 * -를 눌러도 같은식으로
	 * 
	 * vol은 10이상은 없 0은 음소거
	 * 
	 * 선호채널 등록
	 * 5개까지만 등록 가능(배열이 필요)
	 * 1. 하나씩 선호채널 등록 메서드 실행시키면 "선호채널 등록완료"
	 *  - 현재 채널 번호를 선호채널 배열에 넣기
	 * 2. 선호채널 리스트 보기 (i<user.length
	 *  - 등록된 선호채널을 리스트로 출력
	 * */
	
	private String name;
	private int ch;
	private int vol;
	private boolean power;
	private boolean powerPrint;
	private int[] fav= new int[5]; //객체를 직접
	private int index;
	private int count;
	
	
	public TV()	{}
	
	public TV(String name) {
		this.name = "SY"; //중간에 바꿀 수 없는 값. == 상수 == final => 전부 대문자
		
	}
	
	//메서드
	//fav()	: 선호채널 등록 = > 메서드를 한번 호출하면 배열 1개 채워짐.
	//번지로 사용할 변수가 필요함/ => 메서드를 호출할 때마다 +1 증가
	public void fav() {
		
		boolean check = false;
		if(power) {
			if(fav.length == index) {
				//더이상 등록될 자리가 없을 때
				//1. 0번지로 이동
				index = 0;
			}
			//채널의 중복방지
			for(int i=0; i<fav.length; i++) {
				if(fav[i] ==ch) {
					check = true;
				}
			}
			if(!check) {
				fav[index] = ch;
				index++; //선호채널 하나 등록
				count++; //선호채널 등혹한 횟수
			}
			System.out.println(ch + "번 선호채널 등록완료");
		}
		
	}
	public void favList() {
		System.out.println("===선호채널 리스트===");
		//index 의 위치에 따라 선호채널 등록 개수 확인
		if(count == 0) {
			System.out.println("등록된 선호채널 없음");
			return;
		}
		int cnt = count >index ? fav.length : index;
		
		for(int i =0; i<cnt; i++) {
			System.out.print(fav[i]+ " ");
		}
		System.out.println();
		//System.out.println(Arrays.toString(fav));
	}
	
	public void power() {
		if(ch == 0) {
		power =! power;
		powerPrint();
		} else {
		System.out.println(name + " 전원 OFF");
		}
	}
	
	public void powerPrint() {
		if(power) {
			System.out.println(name + "전원 ON");
		} else 
			System.out.println(name + "전원 OFF");
	}
	public void chUP() {
		if(power) {
			this.ch++;
			if(ch>20) {
				ch=1;
			}
		} 
		System.out.println("CH: "+ ch);
	}
	public void chDown() {
		if(power) {
			this.ch--;
			if(ch<1) {
				ch=20;
			}
		} 
		System.out.println("CH: " + ch);
	}
	
	public void volUp()	{
		if(power) {
			this.vol+=1;
			if(vol >10) {
				System.out.println("최대볼륨");
				vol=10;
			}
		}
		System.out.println("vol : " + vol);
	}
	
	public void volDown()	{
		if(power) {
			this.vol-=1;
			if(vol<=0) {
				System.out.println("음소거");
				vol=0;
				return;
			} else {
				System.out.println("vol : " +vol);
			}
		}
	}

	// toStting : 멤버변수를 String 으로 리턴
	
	@Override
	public String toString() {
		return "TV [name=" + name + ", ch=" + ch + ", vol=" + vol + ", power=" + power + ", powerPrint=" + powerPrint
				+ ", fav=" + Arrays.toString(fav) + "]";
	}
	//----getter/setter-------------
	public int getCh() {
		return ch;
	}


	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int[] getFav() {
		return fav;
	}

	public void setFav(int[] fav) {
		this.fav = fav;
	}
	
	
}




