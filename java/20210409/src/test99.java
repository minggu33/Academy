

// 주제 : 자식 클래스 내부에서 부모클래스의 메소드를 재구현(오버라이딩) 했을때
//		 상속되지 않고 은닉된 부모클래스의 메소드를 호출하는 방법

class P1{
	
	public void p1() {		
		System.out.println("부모 P1클래스의 p1메소드");		
	}
		
}

class C1 extends P1{
	
	// 메소드 오버라이딩
	@Override
	public void p1() {
		
		super.p1(); // super로 상속받지 못하고 보호된(은닉된) p1()메소드 호출가능함!
		
		// 메소드의 구현부 재정의
		System.out.println("자식 C1클래스에서 재정의 된 p1메소드");
	}
	
	public void c1() {
		System.out.println("자식 C1클래스의 c1메소드");
	}
	
	
}


public class test99 {

	public static void main(String[] args) {
		C1 c = new C1();
		c.p1(); // 오버라이딩 된 p1() 메소드 호출!
		
/*
 	출력결과 
		부모 P1클래스의 p1메소드				<- super.은닉된 부모객체의 p1()메소드 호출함
		자식 C1클래스에서 재정의 된 p1메소드	<- 오버라이딩 된 메소드 내부에서 재정의된 코드 출력문
*/
	}

}
