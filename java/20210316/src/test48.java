


// 사용자 정의 메소드 만들기 연습
public class test48 {

	
	//메소드를 만들어 보자.
	
		//메소드 이름 : JavaSpeak
		//기능 : "쉬운 자바!" 출력하는 기능
	public static void javaSpeak() {
		System.out.println("쉬운 자바!");
	}
		//메소드 이름 : absTest
		//기능 : "절대값을 구하는 메소드" 출력하는 기능
	public static void absTest() {
		
		System.out.println("절대값을 구하는 메소드");
	}
		//메소드 이름 : move
		//기능 : "이동하라!" 출력하는 기능
	public static void move() {
		System.out.println("이동하라!");
	}
	
	
	
	
	public static void main(String[] args) {
		
		//위에 만들어 놓은 javaSpeak메소드 호출하여 그 기능이 실행 되도록 하기
		//클래스명,메소드명으로 호출
		test48.javaSpeak();
		
		//위에 만들어 놓은 absTest,move메소드 호출하여 그 기능이 실행 되도록 하기
		//메소드명으로 호출
		absTest();
		move();
		
		
		

	}

}
