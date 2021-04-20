

/*
	Object클래스 내부에 만들어져 있는 
	boolean equals(Object obj) 메소드
	-> 매개변수 obj로 전달받는 객체와 현재 객체에 저장된 데이터(내용)을 비교 같으면 true리턴

*/

public class test117 {

	public static void main(String[] args) {
		
		// String클래스를 이용해 객체 생성
		String a = new String("안녕");
		String b = a;
		
		if(a == b) { // 참조변수 a가 참조할 수 있는 객체메모리의 주소와
					 // 참조변수 b가 참조할 수 있는 객체메모리의 주소를 비교
			System.out.println("a,b 두 참조변수는 하나의 String 객체메모리를 참조한다.");
			
		}else {
			System.out.println("a,b 두 참조변수는 서로 다른 String 객체메모리를 참조한다.");
			
		}
		
		System.out.println("---------------------------------------------------");
		
		// 두개의 String 객체를 생성하여 String객체 내부에 저장되는 문자열 데이터를 비교
		String c = new String("hello");
		String d = new String("hello1");
		
		if(c.equals(d)) { // c참조변수가 참조할 수 있는 String객체 내부의 "hello"문자열 데이터와
						  // d참조변수가 참조할 수 있는 String객체 내부에 저장된 "hello" 문자열 데이터 비교시
						  // equals(Object obj)메소드를 사용
			System.out.println("두 참조변수 a,b가 참조하고 있는 "
								+ "각각의 String객체 내부에 저장된 문자열은 같다.");
		}else {
			System.out.println("두 참조변수 a,b가 참조하고 있는 "
								+ "각각의 String객체 내부에 저장된 문자열은 다르다.");
		}
		
		// 참고 :
		// String 클래스 내부에는 Object 클래스의 equals 메소드가
		// 두 String 객체에 저장된 문자열 데이터를 비교할 수 있게끔
		// 메소드 오버라이딩(재정의) 되어 있기 때문에... 
		// 두 String객체 내부의 문자열 데이터를 비교할 수 있다.
		
		
		
		

	}

}
