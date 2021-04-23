
/*

	boolean자료형 데이터를 저장하기 위한(객체로 감싸기위한)
	Wrapper역할을 하는 BooleanWrapper클래스 직접 만들어보기 연습!
	
*/


// BooleanWrapper클래스 만들기

	// 변수 선언 -> 데이터 은닉, private, 변수이름 power, 타입 boolean

	// 생성자 선언 -> public, 매개변수 : boolean power, boolean변수에 매개변수값 저장

	// Object클래스의 toString()메소드 오버라이딩
	// -> 구현내용 : power변수의 값을 문자열로 만들어 리턴

class BooleanWrapper extends Object{
	private boolean power; 
	
	public BooleanWrapper(boolean power) {
		this.power = power;
	}
		


@Override
public String toString() {
	
	return "" + power;
}

	
}


public class test123 {
	
	// ShowData 메소드 만들기 
	// -> public, static, void 매개변수 : Object obj
	// -> 매개변수 obj로 전달 받은 객체의 toString()메소드 호출후 반환받아 출력
	
	public static void ShowData(Object obj){
		System.out.println(obj.toString());
	}
	
	
	public static void main(String[] args) {
		
		// ShowData메소드 호출시 true전달하여 "true"가 출력되게 하기
		ShowData(new BooleanWrapper(true) );
		
		// ShowData메소드 호출시 false전달하여 "false"가 출력되게 하기
		ShowData(new BooleanWrapper(false) );
		
		
		
		
		

	}

}
