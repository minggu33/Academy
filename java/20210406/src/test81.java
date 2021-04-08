
// 주제 : 상속관계에서의 private멤버 알아보기


class A{
	
	public int p;
	
	// private(캡슐화,은닉,보호)접근 제어자를 이용해 n변수 선언
	private int n;
	
	// 위 은닉, 보호된 private으로 선언된 n변수에 새로운 데이터를 저장하기 위해
	// public으로 setN메소드 만들기
	public void setN(int n) {
		this.n = n;
	}
	
	// 위 은닉, 보호된 private으로 선언된 n변수에 저장된 값을 외부클래스에 제공해주기 위해
	// public으로 선언한 getN메소드 만들기
	public int getN() {
		return n;
	}	
}// class A


// A클래스를 상속받아 새로 정의하는 B클래스 만들기
class B extends A{
	
	private int m;

	// get, set 메소드 만들기 단축키
	// alt + shift +s  r
	public int getM() { // -> private로 선언된 m변수의 값을 외부 클래스 영역에 제공
		return m;
	}

	public void setM(int m) {// -> private로 선언된 m변수의 값을 새로운 값으로 초기화
		this.m = m;
	}
	
	// n 인스턴스변수에 저장된 문자열 + m 인스턴스변수에 저장된 문자열을 하나의 문자열로 만들어 반환
	public String toString() {
		return "n"+ getN() + "  m" + getM();
		
	}
	
}


public class test81 {

	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		
		// 생성된 두 객체 A, B 내부의 멤버(변수, 메소드)에 접근하기
		a.p = 5;
	  //a.n = 5; // A객체의 n변수는 private로 선언되어 있음
				 // 다른 클래스(test81)에서 접근 불가능
				 // n변수는 캡슐화 되어 있음
		b.p = 5;
	//	b.n = 5; // B객체의 상속받은 n변수는 private로 선언되어 있음
				 // 다른 클래스 (test81)에서 접근 불가능
				 // n변수는 캡슐화 되어 있음
		
		b.setN(10); // public접근제어자로 만들어 놓은 setN메소드 접근 가능
		
		// b.m = 20; // m변수는 private멤버이기때문에 다른 클래스(test81)에서 접근 불가능
		b.setM(20); // public 접근제어자로 만들어 놓은 setM메소드 접근 가능
		
		
		

	}

}
