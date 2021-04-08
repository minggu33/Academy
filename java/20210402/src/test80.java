
	// 상속연습
/*
	
	(x,y)의 한점을 표현하는 Point클래스와
	Point클래스를 상속받아 컬러점을 표현하는 ColorPoint클래스를 새롭게 만들어보자
	
	


*/

//(x,y)의 한점을 표현하는 Point클래스( 부모클래스) 선언
class Point{
	
	// 한 점을 구성하는 x, y 인스턴스 변수 선언
	int x,y;

	// 인스턴스 변수 x, y에 데이터를 새롭게 초기화시킬 set메소드 만들기

	public void set(int x,int y) {
		this.x = x;
		this.y = y;
	}


	
	// 한점의 좌표 "(x,y)"형태로 출력하는 showPoint()메소드 만들기
	
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
		
	}
	
	
	
}

// Point부모클래스를 상속받아 새롭게 정의하는 ColorPoint클래스(자식클래스) 선언
class ColorPoint extends Point{
	
	// 점의 색을 문자열로 저장시킬 인스턴스변수 color선언
	String color;
	
	// 점의 색을 매개변수로 전달받아 새롭게 초기화시킬 setColor메소드 만들기
	
	public void setColor(String x) {
		color = x;
		
	}
	
	// color변수에 저장된 컬러점의 좌표를 출력하는 기능의 showColorPoint메소드 만들기
	public void showColorPoint() {
		// 출력기능
		// 1. color변수의 값 출력
		// 2. 한점의 좌표 "(x,y)" 문자열 형태로 출력
		System.out.print(color);
		showPoint();
		
	}

	
	
	
}
public class test80 {

	public static void main(String[] args) {
		
		// 출력결과
		// red(3,4)
		
		// 1. ColorPoint객체 생성, 참조변수 이름 cp
		ColorPoint cp = new ColorPoint();
		
		// 2. 부모클래스인 Point클래스로부터 상속받은 set메소드 호출시 3,4 전달
		cp.set(3, 4);
		
		// 3. ColorPoint객체에 color변수에 "red"문자열 저장하기 위해 메소드 호출
		cp.setColor("red");
		
		// 4. 컬러점의 좌표를 출력하는 showColorPoint 메소드 호출
		cp.showColorPoint();
		

	}

}
