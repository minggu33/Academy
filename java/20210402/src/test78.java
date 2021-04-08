
/*
	상속 개념
	 - 상속이란 기존의 클래스에 기능을 추가하거나 재정의하여 
	   새로운 클래스를 정의하는 것을 의미한다.
	 - 상속을 이용하면 기존에 정의되어 있는 클래스의 모든 변수와 메소드를 물려받아
	   새로운 클래스를 생성할 수 있다.
	 - 이 때 기존에 정의되어 있던 클래스를 부모클래스, 상위클래스, 기초클래스 라고 한다.
	   그리고 상속을 통해서 새롭게 작성되는 클래스를 자식클래스, 하위클래스, 파생클래스 라고 한다.
	   
	자식 클래스(child class)
	 - 자식클래스란 부모클래스의 모든 특성을 물려받아 새롭게 작성된 클래스를 의미한다.
	
	자바에서 자식클래스를 설계하는 문법
		class 자식클래스 이름 extends 부모클래스이름{
				...
		}
		
*/

// 기존에 존재하는 부모클래스 -> 아버지 Parent클래스
class Parent{
	public void parentPrn() {
		System.out.println("Parent 클래스 메소드는 상속된다.");
	}
	
}

// 상속을 통해 새롭게 설계하는 자식 클래스 -> Child클래스
class Child extends Parent{
	
	public void childPrn() {
		System.out.println("Child 클래스 메소드이다.");
	}
	
	
}


public class test78 {

	public static void main(String[] args) {
		
		
		// 자식클래스( Child 클래스)를 이용해 객체 생성
		Child c1 = new Child();
		
		// 부모클래스( Parent클래스)로부터 상속받은 parentPrn()메소드 호출 가능
		c1.parentPrn();
		
		// 자식클래스( Child클래스) 자기 자신의 childPrn()메소드 호출 가능
		c1.childPrn();
		
		System.out.println("-------------------------------------------");
		
		
		// 부모클래스(Parent 클래스)를 이용해 객체 생성
		Parent p1 = new Parent();
		
		// 부모클래스(Parent 클래스)자기 자신의 parentPrn()메소드 호출 가능
		p1.parentPrn();
		
		
		// 부모클래스(Parent 클래스)는 childPrn()메소드 호출 불가능
		//p1.childPrn();
		
		
		// 결론 : 
		// 상속이란 부모나 가진 재산이나 권력을 자식에게 물려주는 것.
		// 자식클래스가 부모클래스의 멤버를 상속받아 사용할 뿐,
		// 부모클래스를 이용해서 생성된 객체가 자식클래스의 메소드를 가져다가 사용할 수 없다.
		
	}

}
