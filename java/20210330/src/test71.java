
// 클래스 내부의 멤버변수 만들기 연습1

// Student클래스 만들기
class Student{
	// 인스턴스 변수 선언 : 4바이트 크기의 정수를 저장할 num변수 선언
	int num;
	
	// 클래스 변수 선언 : 4바이트 크기의 정수를 저장할 staticNum변수 선언
	static int staticNum;

	
	
	// 기본 생성자 선언 : 아무일도 하지 않음 (비워두자)
	
	Student(){
		
	}
	
	// 메소드 선언 : 매개변수 add로 하나의 정수를 전달 받아..
	//			  인스턴스 변수와 클래스 변수에 누적하는 기능의 메소드 선언
	
	public void add(int x) {
		num += x;
		staticNum += x;
	}
	
	
	
	
}

public class test71 {

	
	public static void main(String[] args) {
		
		// 출력결과
		// 참조변수 a_student에 저장된 객체
		// 인스턴스변수 num의 값 : 5
		// 클래스 변수 staticNum의 값 : 5
		Student a_student = new Student();
		
		a_student.add(5);
		System.out.println(a_student.num);
		System.out.println(a_student.staticNum);
		
		// 참조변수 b_student에 저장된 객체
		// 인스턴스변수 num의 값 : 5
		// 클래스변수 staticNum의 값 : 10
		
		Student b_student = new Student();
		b_student.add(5);
		System.out.println(b_student.num);
		System.out.println(b_student.staticNum);
		
		// 인스턴스 변수와 클래스변수의 차이점
		// -> 인스턴스변수는 객체를 생성할때마다 객체 내부에 만들어지는 변수
		// -> 클래스변수는 각 객체들이 공유하여 사용하는 공유 변수
		// 	  맨처음에 java 클래스명 <- 명령문을 이용하여 클래스명.class를 실행할때
		// 	  JVM메모리의 Method영역에 먼저 올라가는 변수 메모리이다.
		
		

	}

}
