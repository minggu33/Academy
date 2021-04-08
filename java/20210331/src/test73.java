

// 클래스변수 인스턴스 변수 클래스메소드 인스턴스메소드 만들기 연습


// 상품클래스 Product만들기
class Product{
	//상품명을 문자열로 저장할 클래스변수 modelName만들기
	static String modelName;
	// 상품의 단가를 정수로 저장할 클래스변수 unitPrice만들기
	static int unitPrice;
	
	// 상품명과 단가를 하나의 문자열로 만들어서 출력할 기능의
	// 클래스 메소드 print() 만들기
	public static void print() {
		System.out.println("모델명 : "+modelName+", 상품 단가 : "+unitPrice);
		
	}
	
}

// 고객클래스 Customer 만들기
class Customer{
	// 고객명을 문자열로 저장시킬 인스턴스변수 name 만들기
	String name;
	// 고객의 나이를 정수로 저장시킬 인스턴스변수 age만들기
	int age;
	// 기본생성자 만들기 (아무런일도 하지않음, 비워두자)
	Customer(){
		
	}
	
	// 새로운 고객명만 매개변수로 전달받아 위 인스턴스 변수에 초기화할 생성자 만들기
	Customer(String name ){
		this.name = name;
		
	}
	
	Customer(int age){
		this.age =age;
	}
	
	// 새로운 고객 나이만 매개변수로 전달받아 위 인스턴스 변수에 초기화할 생성자 만들기
	
	// 인스턴스변수 name과 인스턴스 변수 age에 저장된
	// 고객의 이름과 고객의 나이를 하나의 문자열로 만들어서 반환할 인스턴스메소드 print만들기
	public void print() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
	}
	
	
	
}


public class test73 {

	public static void main(String[] args) {
		
		// 출력결과
		/*
		 	쉽게 배우는 자바,33000
		 	--------------------
		 	재벌1세,31
		 	재벌2세,33
		 
		*/
		
		
		Product.modelName = "쉽게 배우는 자바";
		Product.unitPrice = 33000;
		
		Product.print();
		System.out.println("----------------------");
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		c1.name = "재벌1세";
		c1.age = 31;
		c2.name = "재벌2세";
		c2.age = 33;
		c2.print();
		//modelName,unitPrice클래스변수 값들을
		// 각각 "쉽게배우는자바", 33000로 저장
		
		// print()클래스 메소드 호출
		// 쉽게 배우는 자바, 33000 <--- 출력되게 하기
		// ------------------- <--- 출력되게 하기
		
		// Customer클래스로부터 new 객체 생성! 참조변수 이름 c1
		// 재벌 1세, 31을 각각 인스턴스변수에 저장
		
		// print()인스턴스메소드 호출해서 재벌1세, 31 <---- 출력
		
		// Customer클래스로부터 new 객체 생성! 참조변수 이름 c2
		// 재벌 2세, 33을 각각 인스턴스변수에 저장
		
		// print()인스턴스메소드 호출해서 재벌2세, 33 <---- 출력
		
		
	}

}
