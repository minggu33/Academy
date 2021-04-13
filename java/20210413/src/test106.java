

// 추상클래스 연습

// 문제 : 추상클래스(Animal) 내부에는 추상메소드 speak가 존재한다.
//		 추상클래스(Animal)를 상속하여 Dog클래스와 Cat클래스를 정의한 후
//		 각 동물의 울음소리를 출력시키시오.

// 추상클래스 (Animal) 만들기
	// 동물의 소리내기 기능을 하는 추상메소드 speak선언

abstract class Animal{
	
	abstract String speak();
	
}

// Animal 추상클래스를 상속받는 Dog자식클래스 만들기
	// speak추상메소드를 강제로 오버라이딩하기
		// 오버라이딩할 내용 -> "멍멍 멍멍" 반환
class Dog extends Animal{

	@Override
	String speak() {
		return "멍멍 멍멍";
	}	
}


//Animal 추상클래스를 상속받는 Cat자식클래스 만들기
	// speak추상메소드를 강제로 오버라이딩하기
		// 오버라이딩할 내용 -> "야옹 야옹" 반환
class Cat extends Animal{

	@Override
	String speak() {
		
		return "야옹 야옹";
	}
	
}


public class test106 {

	public static void main(String[] args) {
		
		// 업캐스팅 하지 않은 출력결과
		// 출력결과
		// 냐옹 냐옹
		// 멍멍 멍멍
		
		Dog d = new Dog();
		System.out.println(d.speak());
		
		Cat c = new Cat();
		System.out.println(c.speak());
								
		// 업캐스팅을 한 출력결과
		// 냐옹 냐옹
		// 멍멍 멍멍
		
		Animal a1 = new Dog();
		System.out.println(a1.speak());
		
		a1 = new Cat();
		System.out.println(a1.speak());
		
		
		

	}

}
