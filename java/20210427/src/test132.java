
/*
	자바에서 예외처리 방법 2가지
	
	1. try-catch-finally 문 이용
	2. throws 키워드 이용하는 방법
	
	
	throw 와 throws 키워드
	
	1. throw키워드
		-> 예외를 강제로 발생시킬때 사용하는 키워드
			(문법) throw new 예외클래스의생성자호출();
	
	2. throws키워드
		-> 발생된 예외처리를 자신이 직접 처리하는 것이 아니라
		   자신을 호출한 객체로 떠넘기는 역할을 하는 키워드
		   (문법) throws Exception { ..... }

*/

class Test{
	// throws Exception
	// a메소드를 호출한 곳으로 가서 예외처리 하라는 뜻
	void a(int num) throws Exception{
		System.out.println("num = "+ num);
		
		if(num < 100) {
			// 예외를 인위적으로 발생시키기 : 의도적으로 예외발생시킴
			throw new Exception("num값이 100보다 작다");
			
		}
		
	}
	
	
}


public class test132 {
	public static void main(String[] args) /* throws Exception */ { // JVM 가상머신이 main메소드를 호출하니
																	// JVM에게 예외처리를 떠넘김
		System.out.println("프로그램 시작");
		Test test = new Test();
		
		// a메소드내부에서 예외가 발생하면 예외처리를 여기서 하자
		try {
			// 메소드를 호출한 곳
			test.a(50);
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		System.out.println("프로그램 종료");
		

	}

}
