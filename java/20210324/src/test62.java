
	// Animal 클래스 만들기

class Animal{
	//변수
	//동물의 이름을 문자열로 저장시킬 name변수 선언
	String name;
	
	// 동물의 나이를 정수로 저장시킬 age변수 선언
	int age;
	
	// 기본 생성자
	// name 변수에 "개"저장
	// age 변수에 3저장
	Animal(){
		name="개";
		age = 3;
	}
	
	//동물의 이름을 매개변수로 전달받아 name변수에 저장할 생성자
		//name 변수에 n_name매개변수로 전달받은 이름을 저장
		// age변수에 1저장
	Animal(String n_name){
		name = n_name;
		age = 1;
	}
	
	// 동물의 나이를 n_age매개변수로 전달받아 age변수에 저장할 생성자
	// name변수에 "동물" 저장
	// age변수에 n_age 저장
	Animal(int n_age){
		name = "동물";
		age = n_age;		
	}
	
	// 동물의 이름과 나이를 매개변수로 전달받아 name변수와 age변수에 각각 저장할 생성자
	//name 변수에 n_name매개변수로 전달받은 이름을 저장
	// age변수에 n_age 저장
	Animal(String n_name, int n_age){
		name = n_name;
		age = n_age;	
	}
	
	
	// 메소드
	// name변수에 새로운 값을 저장할 용도의 메소드
	void setName(String n_name) {
		name = n_name;		
	}
	
	// age 변수에 새로운 값을 저장할 용도의 메소드
	void setAge(int n_age) {
		age=n_age;		
	}
	
	
	// name 변수에 저장되어 있는 값을 제공(반환) 해주는 용도의 메소드	
	String getName() {
		return name;
	}
	
	// age 변수에 저장되어 있는 값을 제공(반환) 해주는 용도의 메소드
	int getAge() {
		return age;
	}
	
	
	// name 변수에 저장된 동물이 뛴다 <--출력하는 메소드
	
	void run() {
		System.out.println(name+ " 뛴다.");
	}
		
}//클래스 끝



public class test62 {

	public static void main(String[] args) {
		
	// 출력할 내용
		/*
			개 뛴다
		
		*/
		
		
	Animal a = new Animal();
	a.run();
	
	Animal cat = new Animal("고양이");
	cat.run();
	
	a.setName("사자");
	a.setAge(10);
	
	System.out.println(a.getName());
	System.out.println(a.getAge());
	
	System.out.println("=========================");
	
	Animal rabbit  = new Animal("토끼",2);
	rabbit.run();
	System.out.println(rabbit.getAge());
	
	Animal gi  = new Animal("기린",4);
	gi.run();
	System.out.println(gi.getAge());
	
	
	}

}
