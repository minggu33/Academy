


/* 	주제 : 인터페이스를 이용한 다중 상속  */

/*

		TV 클래스와 VCR클래스가 있다.
		TV 클래스와 VCR클래스를 다중상속하여
		TVCR클래스를 만들고 싶을때
		자바의 클래스는 다중상속을 허용하지 않는다.

*/

class TV{
	// 변수
	protected boolean power;
	protected int channel;
	protected int volume;
	
	// 메소드
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void volumUp() {
		volume++;
	}
	public void volumDown() {
		volume--;
	}
		
}

class VCR{
	
	protected int counter;
	
	public void play() {
		System.out.println("Tape를 재생한다.");
	}
	public void stop() {
		System.out.println("재생을 멈춘다.");
	}
	public void reset() {
		counter = 0;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int x) {
		counter = x;
	}
		
}

// TVCR 새로운 클래스를 만들 때 TV클래스와 VCR클래스 모두를 상속받지 못한다.
// 두개의 클래스 중에 하나만 상속 가능하다.(단일 상속만 허용!)
//class TVCR extends TV,VCR{}

// 다중상속 해결방법
// 두 부모클래스 중에서 비중이 높은 쪽을 선택하고
// 어느 한 쪽을 필요한 기능부분을 추출해서 인터페이스로 만든 다음 재구현(오버라이딩) 시키도록 한다.
// 다른 한 쪽은 클래스 내부에 멤버로 포함시키는 방식으로 처리.


// VCR클래스에 정의된 메소드와 일치하는 추상메소드를 갖는 인터페이스를 작성한다,
interface IVCR{
	public void play();
	public void stop();
	public void reset();
	public int getCounter();
	public void setCounter(int c);	
	
}


// TV클래스 한쪽만 부모클래스로 선택하여 상속받고
class TVCR extends TV implements IVCR{

		// 나머지 한쪽(VCR클래스)은 TVCR클래스 내부에 포함시켜서
		// 내부적으로 객체를 생성해서 사용하도록한다.
		
	 	VCR vcr = new VCR();
	 	
	 // IVCR인터페이스 내부의 추상메소드 오버라이딩
	 	
	@Override
	public void play() {
		// 내부적으로 객체를 생성해서 메소드 호출
		// 코드를 작성하는 대신 vCR
		vcr.play();
		
	}

	@Override
	public void stop() {
		vcr.stop();
		
	}

	@Override
	public void reset() {
		vcr.reset();
		
	}

	@Override
	public int getCounter() {
		
		return vcr.getCounter();
	}

	@Override
	public void setCounter(int c) {
		vcr.setCounter(c);
		
	}
	
}

public class test110 {

	public static void main(String[] args) {

		
		TVCR tvcr = new TVCR();
		
		// Tape를 재생한다 < 출력
		tvcr.play();
		
		// setCounter 메소드 호출 시 3전달
		tvcr.setCounter(3);
		
		// getCounter 메소드 호출하여 3을 반환 받아 출력
		System.out.println(tvcr.getCounter());
		
		// reset 메소드 호출
		tvcr.reset();
		
		// getCounter 메소드 호출하여 0을 반환받아 출력
		System.out.println(tvcr.getCounter());
		
		// stop 메소드 호출
		tvcr.stop();
		
		
	}

}
/*
 	 결론
 	 
 	 
 	 IVCR 인터페이스를 작성하기 위해서는 새로 추상메소드를 작성해야 하는 부담이 있지만
 	 이처럼 VCR이라는 클래스의 객체를 생성해서 사용하면 손쉽게 다중상속을 구현 할 수 있다.
 	 
 	 그러나 다형성 특성을 이용할 수 있다는 장점을 지닌 인터페이스를 이용하여
 	 클래스의 다중상속을 해결할 수 있다.
 
 
 
 
 */ 
