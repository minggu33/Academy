
/*

	2단계 클래스 설계도 정의
	3단계 객체 생성 후 사용
	
*/

// 2단계 클래스설계도 정의
// 생성할 클래스 명 : Student
	// 클래스 내부의 변수들
	// 1. 학번을 4바이트 크기의 정수로 저장할 hakbun변수 선언

	// 2. 학생 이름을 문자열로 저장할 name변수 선언

	// 3. 학생의 국어 점수를 4바이트 크기의 정수로 저장할 kor변수 선언

	// 4. 학생의 영어 점수를 4바이트 크기의 정수로 저장할 eng변수 선언

	// 5. 학생의 수학 점수를 4바이트 크기의 정수로 저장할 math변수 선언

	// 클래스 내부의 메소드들
	// 1. 학생의 국어,영어,수학 점수의 총합을 구하는 기능의 sum메소드 선언
	//    (리턴값 : 학생의 총점수합을 int값으로 리턴, 매개변수 X)

	// 2. 학생의 총점수의 평균을 구해 8바이트 크기의 실수값으로 리턴하는 avg메소드 선언
	// 	  (매개변수 x, 리턴값 : 총점수의 평균값)

class Student{
	
	int hakbun;
	String name;
	int kor, eng, math;
	//int eng;
	//int math;
	
	int sum() {
		  
		return math+kor+eng;
	}
	
	double avg() {
		return sum()/3.0;
		//return (math+kor+eng)/3.0;
	}
	
}





public class test56 {

	public static void main(String[] args) {
		
	//	3단계 위 2단계에서 정의한 클래스 설계도를 이용해 객체생성 후 사용
		
	// Student클래스를 이용해 객체 메모리 생성! 
	// 생성 후 Student클래스타입의 s변수에 저장
	
	// 위 s변수에 저장된 Student객체의 객체변수(인스턴스변수)hakbun에 1 저장
		
	// 위 s변수에 저장된 Student객체의 객체변수(인스턴스변수)name에 "홍길동" 저장	
	
	// 위 s변수에 저장된 Student객체의 객체변수(인스턴스변수)kor에 100 저장	
	
	// 위 s변수에 저장된 Student객체의 객체변수(인스턴스변수)eng에 85 저장	
	
	// 위 s변수에 저장된 Student객체의 객체변수(인스턴스변수)math에 90 저장	
		
	Student s = new Student();
	
		s.hakbun = 1;
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 85;
		s.math = 90;
		
		System.out.println(s.name+" 총점 : "+ s.sum());
		System.out.println(s.name+" 평균 : "+ s.avg());
		//-----------------------------------------------
		
		// Student클래스를 이용해 객체 메모리 생성! 
		// 생성 후 Student클래스타입의 s1변수에 저장
		
	Student s1 = new Student();
		
		s1.hakbun = 2;
		s1.name = "이몽룡";
		s1.kor = 95;
		s1.eng = 80;
		s1.math = 95;
		
		System.out.println(s1.name+" 총점 :"+ s1.sum());
		System.out.println(s1.name+" 평균 : "+ s1.avg());
		
		
		
		

	}

}
