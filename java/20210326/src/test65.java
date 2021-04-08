
/*
	this와 this()
	
	this참조변수
	- this참조변수는 인스턴스(객체)가 바로 자기자신의 멤버를 참조하는데 사용하는 변수
	  이러한 this참조변수는 해당 인스턴스(객체)의 주소를 가지고 있다.
	  
*/

class Car{
	//변수
	// 변수를 선언할 때 변수명 앞에 private단어를 붙이면
	// Car외부의 클래스에서 Car클래스 내부의 modelName변수에 접근 X
	private String modelName;	
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	// 생성자 : new Car()객체 생성시.. Car()생성자를 호출해 변수의 값들을 저장할 역할
	Car(String modelName,int modelYear,String color,int max){
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		maxSpeed = max;
		currentSpeed = 0;
	}
	
	void show(){
		System.out.println("모델 이름 : "+modelName);
		System.out.println("생산 년도 : "+modelYear);
		System.out.println("색깔 : "+color);
		System.out.println("최고 속도 : "+maxSpeed);
		System.out.println("현재 속도 : "+currentSpeed);
	}
	// 위 예제처럼 생성자의 매개변수 이름과 인스턴스변수 이름이 같을 경우에는
	// 인스턴스변수명 앞에 this참조변수(키워드)를 붙여 구분해야만 한다.
	
	// 이렇게 자바에서는 this참조변수를 사용하여 인스턴스변수에 접근할 수 있다.
	// 이러한 this참조변수를 사용할 수있는 영역은 인스턴스 메소드 뿐이며,
	// 클래스 메소드에서는 사용할 수 없다.
	// 모든 인스턴스 메소드에는 this참조변수가 숨겨진 지역변수로 존재하고 있다.
	
}
/*
 	this()메소드
 	
 	 - this()메소드는 생성자 내부에서만 호출되서 사용할 수 있으며,
 	   같은 클래스의 내부에 존재하는 다른 생성자를 호출할때 사용한다.
 	  
 	 - this()메소드에 인수를 전달하면, 생성자 중에서 생성자의 이름과 생성자의 매개변수 갯수가 일치하는 
 	   다른 생성자를 찾아서 호출해 준다. 
 	   
 	    
 
 
 
*/
class Car1{
	//변수
	// 변수를 선언할 때 변수명 앞에 private단어를 붙이면
	// Car외부의 클래스에서 Car클래스 내부의 modelName변수에 접근 X
	private String modelName;	
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	// 기본 생성자
	Car1(){// 두번째 생성자
		// 다른 생성자를 호출하는 this()메소드 작성
		this("소나타", 2015, "파랑", 150);// <-- 첫 번째 줄에서만 다른 생성자 호출 가능
	}
	
	// 첫번째 생성자
	// 생성자 : new Car()객체 생성시.. Car()생성자를 호출해 변수의 값들을 저장할 역할
	Car1(String modelName,int modelYear,String color,int max){
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		maxSpeed = max;
		currentSpeed = 0;
	}
	
	void show(){
		System.out.println("모델 이름 : "+modelName);
		System.out.println("생산 년도 : "+modelYear);
		System.out.println("색깔 : "+color);
		System.out.println("최고 속도 : "+maxSpeed);
		System.out.println("현재 속도 : "+currentSpeed);
	}
	
	public String getModel() { // 자동차(new Car1()객체)에 대한 정보를 하나의 문자열로 만들어 반환
		return this.modelYear+"년식"+this.modelName + " "+ this.color;
		
	}
	
}


public class test65 {

	public static void main(String[] args) {
		
//		Car car = new Car("벤츠",2021,"빨강",250);
//		car.show();
		String Car1Info= new Car1().getModel();
		System.out.println(Car1Info);
	
/*
		위 예제에서 매개변수를 가지는 첫번째 생성자는 this참조변수를 사용하여
		인스턴스변수(객체변수)에 접근하고 있다.
		또한 매개변수를 가지지 않는 두번째 생성자는 내부에서 this()메소드를 이용하여
		첫번째 생성자를 호출한다.
		이렇게 내부적으로 다른 생성자를 호출하여 인스턴스 변수를 초기화할 수 있다.
		단, 한 생성자는 다른 생성자를 호출할 때는 해당생성자의 첫 줄에서만 호출할 수 있다.
		
		
*/
	}

}
