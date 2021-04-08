
/*
	객체 지향 프로그래밍의 3단계
	
	푸들객체
		
	1단계 현실에 존재하는 객체 모델링 ( 데이터, 동작 추출)
		데이터 : 황색털, 털길이 10cm, 다리길이 100cm, 수컷, 종 푸들
		동작 : 걷거나 뛴다, 짖는다, 주인을 알아보는행동, 번식한다
		
	2단계 현실에 존재하는 객체의 데이터와 동작을 이용하여 클래스(설계도)만들기
		

*/

class Puppy{//강아지 클래스 설계도
	
	//변수 -> 데이터 : 황색털, 털길이 10cm, 다리길이 100cm, 수컷, 종 푸들
	String 종;			// 푸들, 시츄, 진돗개...
	String 털색깔;		// 파란색, 황색...
	int 털길이;			// 100,10...
	int 다리길이;			//20,30,...
	String 성별;			// 암컷, 수컷
	
	//메소드 ->동작 : 걷거나 뛴다, 짖는다, 주인을 알아보는행동, 번식한다
	void move(){
		System.out.println(종 +" 걷거나 뛴다.");
	}
	void bark() {
		System.out.println(종 +" 짖는다.");
	}
	void recognize() {
		System.out.println(종 +" 알아본다.");
	}	
}// Puppy 클래스설계도 닫는 기호


public class test54 {

	public static void main(String[] args) {
		//3단계 : 클래스 설계도를 참고하여 현실세계에 존재하는 객체들을 코드로 생성
		//푸들객체 생성
		//푸들 참조변수에 생성된 객체메모리의 주소값이 들어 있으므로
		//푸들 참조변수명으로 생성된 객체메모리에 접근이 가능하다.
		Puppy poodle = new Puppy();
		
		//3. 생성된 객체의 데이터를 객체 내부의 변수에 저장
		//형식) 참조변수명.객체변수명 = 저장할데이터;
		
		poodle.종 = "푸들";
		poodle.털색깔 = "황색";
		poodle.다리길이 = 100;
		poodle.성별 = "수컷";
		poodle.털길이 = 10;
		//4. 푸들 객체에 정의된 객체메소드를 호출하여 동작시키기
		//형식) 참조변수명.객체메소드명();
		
		poodle.move();
		poodle.bark();
		poodle.recognize();
		
		System.out.println("-----------------------------------");
		
		//3단계 객체 생성 연습
		//1. Puppy 클래스 설계도를 바탕으로한 참조변수 pome선언
		//2. new 연산자로 객체생성 후, pome참조변수에 객체 주소값 저장
		//3. 생성한 객체에 각 객체 변수에 데이터를 저장
		Puppy pome = new Puppy();
		pome.종 = "포메라니안";
		pome.털색깔 = "흰색";
		pome.털길이 = 10;
		pome.다리길이 = 2;
		pome.성별 = "수컷";
		
		pome.move();
		pome.bark();
		pome.recognize();
		
		System.out.println("-----------------------------------");
		
		Puppy jindo = new Puppy();
		jindo.종 = "진돗개";
		jindo.털색깔 = "누런색";
		jindo.털길이 = 3;
		jindo.다리길이 = 15;
		jindo.성별 = "중성화";
		
		jindo.move();
		jindo.bark();
		jindo.recognize();
		
		
}

}
