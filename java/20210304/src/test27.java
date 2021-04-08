
//switch 조건문 연습문제2
public class test27 {
	public static void main(String[] args) {
		
		//Math클래스 내부에 있는 random함수를 호출하여
		//1 ~ 10 사이의 랜덤한 값 하나를 정수로 얻어 int score변수에 저장
		int score = (int)(Math.random() * 10) + 1;
		
		//문자열 저장할 String타입의 msg변수를 선언하고 ""<--저장
		
		String msg = "";
		//score = score * 100; <-- 다른 표기법으로 작성
		
		score *= 100;
		
		
		msg = "당신의 점수는 " + score + "이고, 상품은";
		
		switch (score) {
		case 1000:
			System.out.println(msg += "자전거, ");
			break;
		case 900:
			System.out.println(msg += "TV, ");
			break;
		case 800:
			System.out.println(msg += "노트북 컴퓨터, ");
			break;
		case 700:
			System.out.println(msg += "자전거, ");
			break;
		
		default:
			System.out.println(msg += "볼펜, ");
			break;
		}
		
		
	
		/*
			switch 문을 이용하여
			1000점일 경우 msg변수에 "자전거, " <-- 누적
			900점일 경우 msg변수에 "TV, " <-- 누적
			800점일 경우 msg변수에 "노트북 컴퓨터, " <-- 누적
			700점일 경우 msg변수에 "자전거, " <-- 누적
			위의 모든 점수에 만족하지 않을때...msg변수에 "볼펜, " <-- 누적
			
		
	*/
	}
}
