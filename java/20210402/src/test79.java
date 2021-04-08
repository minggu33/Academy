
/*
	주제 : 코드를 재활용하는 상속의 장점
	- 기존의 클래스에 새로운 내용을 추가하거나 변경할 때에
	  기존 클래스에 변경된 내용만 추가하여
	  새로운 클래스를 만들어 기존클래스의 변수나 메소드를 그대로 사용할 수 있다.
	  
*/

// 2차원 평면의 좌표값 한점을 나타내는 x,y를 저장하는 Point2D클래스 만들기

class Point2D{
	
	
	private int x,y;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		
		return x;
	}
	public int getY() {
		
		return y;
	}	
}

// 3차원 공간상의 좌표값 한점을 나타내는 x,y,z 를 저장하여 제공하는 Point3D클래스 만들기
// 방법 : Point2D부모클래스의 멤버들을 물려받아(상속받아) 새롭게 Point3D클래스 만들기

class Point3D extends Point2D{
	
	private int z;
	// 변수 하나당 setter역할을 하는 메소드 getter역할을 하는 메소드 만들기 단축키
	// alt + shift + s   &  r
	
	
	// get으로 시작하는 메소드가 하는 역할
	// -> private으로 선언된 변수의 값을 외부클래스에 제공(반환, 리턴)해 줄 목적
	
	// set으로 시작하는 메소드가 하는 역할
	// -> 외부 클래스에서 현재 클래스의 private으로 선언된 변수에 접근하여 새로운 값을 설정할 목적
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	
}


public class test79 {

	public static void main(String[] args) {
		
		new Point2D().setX(10);
		
		Point3D p3= new Point3D();
		
		//Point2D클래스로부터 상속받아 사용하는 setX()메소드 호출
		p3.setX(10);
		System.out.println(p3.getX());
		
		

	}

}
