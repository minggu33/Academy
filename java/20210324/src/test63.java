
// 클래스, 객체 생성, 생성자 만들기 연습

// MyDate라는 이름의 클래스 정의

class MyDate{
	//변수 정의
	// 정수 값을 저장할 year, month, day 변수 정의
	int year, month, day;
	
	//기본 생성자 정의
//		year 2014 저장
//		month 1 저장
//		day 1저장
	MyDate(){
		year = 2014;
		month= 1;
		day =1;
	}
	
	// 년도 값을 n_year매개변수로 전달 받아
		//year n_year 저장
		// month 1 저장
		// day 1 저장
	MyDate(int n_year){
		year = n_year;
		month = 1;
		day = 1;
	}
	
	// 년도, 월 값을
	MyDate(int n_year,int n_month){
		year = n_year;
		month = n_month;
		day = 1;
	}
	
	MyDate(int n_year, int n_month, int n_day){
		year = n_year;
		month = n_month;
		day = n_day;
	}
	
	// 매개변수 n_year로 전달 받은 값을 year변수에 저잘시킬 메소드 정의
	void set_year(int n_year) {
		year = n_year;
	}
	
	// 매개변수 n_month로 전달 받은 값을 month변수에 저잘시킬 메소드 정의
	
	void set_month(int n_month) {
		month = n_month;
	}
	
	
	void set_day(int n_day) {
		day = n_day;
	}
	
	
	int getYear() {
		return year;
	}
	
	int getMonth() {
		return month;
	}
	
	int getDay() {
		return day;
	}
	
	void prn() {
		System.out.println(year+"-"+month+"-"+day);
	}
	
	
	
}


public class test63 {

	public static void main(String[] args) {
		
		// MyDate클래스를 이용해 객체 생성시 기본생성자 호출!
		// 참조변수 이름 m
		MyDate m = new MyDate();
		System.out.println(m.getYear());
		System.out.println(m.getMonth());
		System.out.println(m.getDay());
		//출력
		//2014
		//1
		//1
		
		
		//set으로 시작하는 메소드들 호출해서 값 저장
		//2014
		//8
		//6
		m.set_year(2014);
		m.set_month(8);
		m.set_day(6);
		
		
		//get으로 시작하는 메소드들 호출해서 값 저장
		
		System.out.println(m.getYear());
		System.out.println(m.getMonth());
		System.out.println(m.getDay());
		
		m.prn();
		
		MyDate m2 = new MyDate(2015);
		
		m2.prn();
		
		MyDate m3 = new MyDate(2016,5);
		
		m3.prn();
		
		MyDate m4 = new MyDate(2017,7,7);
		
		m4.prn();
		

	}

}
