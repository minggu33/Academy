

/* 인터페이스 연습1 */

// MobliePhone 인터페이스 만들기

interface MobliePhone{

	// 전화거는 기능을 정의 해 놓은 sendCall 추상메소드 만들기, 리턴타입 boolean
	public boolean sendCall();
	
	// 전화 받는 기능을 정의 해 놓은 receiveCall 추상메소드 만들기, 리턴타입 boolean
	public boolean receiveCall();

	// 문자 보내는 기능을 정의 해 놓은 sendSMS 추상메소드 만들기, 리턴타입 boolean
	public boolean sendSMS();
	
	// 문자 받는 기능을 정의 해 놓은 receiveSMS 추상메소드 만들기, 리턴타입 boolean
	public boolean receiveSMS();
		
}



// MP3 인터페이스 만들기

interface MP3{

	// 음악 재생기능을 정의 해 놓은 play 추상메소드 만들기, 리턴타입 void
	public void play();
	// 음악 정지기능을 정의 해 놓은 stop 추상메소드 만들기, 리턴타입 void
	public void stop();
	
}

interface MusicPhone extends MobliePhone, MP3{
// MusicPhone 인터페이스 만들기 (MobilePhone,MP3) 인터페이스 상속받아 만들기
	// playMP3RingTone 추상메소드 만들기, 리턴타입 void
	abstract void playMP3RingTone();
	
}

class PDA{
// PDA 클래스 만들기
	// 두개의 정수값을 매개변수로 전달 받아 그 합을 int로 리턴하는 calculate메소드 만들기
	public int calculate(int x,int y) {
		return x+y;
	}		
}

class SmartPhone extends PDA implements MusicPhone{

// SmartPhone 클래스 만들기 (PDA클래스 상속받고, MusicPhone 인터페이스 구현)
	
	// MP3클래스가 상속한 MusicPhone클래스의 모든 추상메소드 재구현(오버라이딩)
	// play메소드에 재구현할 내용 -> "음악재생" 출력
	// stop메소드에 재구현할 내용 -> "재생중지" 출력
	// MobilePhone클래스가 상속한 MusicPhone의 모든 추상메소드를 재구현(오버라이딩)
	// sendCall 메소드에 재구현할 내용 -> "전화걸기" 출력, true리턴
	// receiveCall 메소드에 재구현할 내용 -> "전화받기" 출력, true리턴
	// sendSMS 메소드 재구현할 내용 -> "SMS보내기" 출력, true리턴
	// receiveSMS 메소드 재구현할 내용 -> "SMS받았다" 출력, true리턴
	// MusicPhone의 모든 추상메소드를 재구현(오버라이딩)
	// playMP3RingTone메소드에 재구현할 내용 -> 비워두자
	@Override
	public boolean sendCall() {
		System.out.println("전화 걸었다");
		return true;
	}

	@Override
	public boolean receiveCall() {
		System.out.println("전화 받았다");
		return true;
	}

	@Override
	public boolean sendSMS() {
		System.out.println("메세지 보냈다");
		return true;
	}

	@Override
	public boolean receiveSMS() {
		System.out.println("메시지를 받았다.");
		return true;
	}

	@Override
	public void play() {
		System.out.println("음악재생");
		
	}

	@Override
	public void stop() {
		System.out.println("재생중지");
		
	}

	@Override
	public void playMP3RingTone() {
		
		
	}

}


public class test109 {

	public static void main(String[] args) {
		
		// SmartPhone 객체 생성, 참조변수 이름 p
		
		SmartPhone p = new SmartPhone();
		
		/*
			출력결과
			철수가 SmartPhone을 구입하였다.
			영희에게 전화걸기
			철수는 영희가 지금 부재중...이라는 ...SMS받았다
			화가난 철수는 최신음악을 들으려고! 음악재생
				
		*/
		System.out.println("철수가 SmartPhone을 구입하였다.");
		System.out.print("영희에게 "); p.sendCall();
		System.out.print("철수는 영희가 지금 부재중..이라는..."); p.receiveSMS();
		System.out.print("화가나 철수는 최신음악을 들으려고!"); p.play();
		
		
		
	}

}
