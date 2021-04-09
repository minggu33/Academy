

// 메소드 오버라이딩 연습

// 도형을 나타내는 DObjcet클래스 생성

	// DObject클래스 타입의 참조변수 next 선언

	// 기본생성자
		// 역할 : next변수의 값을 null이라는 값으로 초기화

	// 그리는 기능을 출력하는 draw()메소드 생성
		// 출력
		//"Dobject draw"

//-----------------------------------------------------------------

// DObject클래스를 상속받는 선을 그리기 위한 Line자식클래스 만들기

	// DObject클래스 내부에 만들어져 있는 draw메소드 오버라이딩 시키기
		// 재구현할 내용
		// "Line" 출력

// ----------------------------------------------------------------

// DObject클래스를 상속받는 원을 그리기 위한 Circle자식클래스 만들기
	// DObject클래스 내부에 만들어져 있는 draw메소드 오버라이딩 시키기
		// 재구현할 내용
		// "Circle" 출력

// ----------------------------------------------------------------




class DObject{
	
	DObject next;
	
	DObject(){
		next = null;
		
	}
	
	
	public void draw(){
		System.out.println("Dobject draw");	
	}	
}

class Line extends DObject{

	@Override
	public void draw() {
		System.out.println("Line");
	}
	// 위 오버라이딩된 draw()메소드에 대한 설명
	// -> 부모클래스에 있는 draw()메소드를 오버라이딩 하면
	// Line 클래스를 이용해 생성된 객체는 부모클래스의 draw메소드가 은닉되어
	// 상속받지 못하게 된다.
}

class Circle extends DObject{
	// alt + shift + s  v 또는 source메뉴클릭 후 Override/im.. 선택
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
	
	
}


public class test98 {

	public static void main(String[] args) {
		
		// 주제 : 오버라이딩된 메소드들 호출 해보기
		
		// Line객체 생성 ! 참조변수 이름 a
		
		Line a = new Line();
		
		a.draw();
		// a 참조변수를 이용해 오버라이딩된 draw() 메소드 호출! 
		// (참고. 곧바로 Line객체 내부에 있는 오버라이딩된 draw()메소드가 호출됨)
		
		// 업캐스팅!
		// 부모클래스DObject 타입의 참조변수p 선언 후 자식객체 new Line();를 생성하여 객체주소저장
		
		DObject p = new Line();
		
		// 업캐스팅 이후~ 부모클래스DObject 타입의 참조변수p로 draw()메소드 호출!
		// (참고. p참조변수에는 실제로 저장된 객체는 자식객체인 new Line()객체가 저장되어 있으므로
		// Line객체의 draw()메소드의 실행결과가 출력된다.)
		p.draw(); // <-- Line객체의 draw()메소드의 실행결과가 출력된다.
		// 부모클래스 DObject 타입의 참조변수 p로 draw()메소드 호출시
		// 참조변수 p는 DObject클래스 타입이므로
		// 1. 먼저 은닉된 부모의 draw()메소드를 찾고..
		// 2. 부모객체의 draw()와 같은 이름의 메소드가 자식클래스에 있는지 찾아서
		//	  동적으로 바인딩되어 오버라이딩된 자식객체의 draw()메소드가 호출되어 실행되게 된다.
		

	}

}
