

// 지난 test55.java 파일에 작성한 과일장수 이야기 업그레이드 시키기

//(2단계) 클래스 설계도 만들기

//과일장수(과일판매자) FruitSeller클래스 만들기
class FruitSeller{

//변수
	//사과 1개당 가격
	/*final*/ int APPLE_PRICE;/*=1000*/
	
	//보유하고 있는 사과 개수
	int numOfApple;
	
	//판매수익
	int myMoney;
	
	// 개발자가 생성자 만들어 놓지 않으면 JVM은 기본생성자를 자동으로 만들어 놓는다.
	public FruitSeller() {
		
	}
	
//메소드	
	//사과판매 행동의 메소드
	int saleApple(int money) {//사과 구매자로부터 받은 돈을 매개변수로 얻는다.
		
		//판 사과 개수 구하기 = 사과 구매자로부터 받은 금액/사과 한개당 가격
		int num = money/APPLE_PRICE;
		
		//사과 판매후 사과 판매자가 보유하고 있는 사과개수 차감
		numOfApple -= num;
		
		myMoney += money;
		
		//실제 판매(구매)가 발생한 사과 개수를 반환(리턴)
		return num;		
	}
	//사과 판매후 남은 사과개수, 판매수익(과일판매자의 잔고)을 출력하는 기능의 메소드
	
	void showSaleResult() {
		System.out.println("남은 사과개수 : "+numOfApple);
		System.out.println("판매 수익 : "+myMoney);
	}
	
	// 추가할 메소드의 기능 : 과일 판매자의 처음 상태 값을 저장시킬 기능의 메소드
	
	void initMembers(int money, int appleNum, int price) {
		myMoney = money; // 처음 가지고 있는 돈
		numOfApple = appleNum; // 처음 가지고 있는 사과 개수
		APPLE_PRICE = price;// 사과 개당 가격을 처음에 초기화할 목적
	}
	
	
	
	
	
}
	//과일구매자 FruitBuyer클래스 만들기
class FruitBuyer{
	//현재 소유금액
	int myMoney = 10000;
	//현재 소유하고 있는 사과 개수
	int numOfApple;
	
	//과일 구매기능의 메소드
	//매개변수 : 과일을 구매하기위한 판매자 대상 객체를 전달받은 변수
	//			과일 구매시 지불할 금액을 전달받을 변수
	public void buyApple(FruitSeller seller,int money) {
		
		//과일 판매자 객체(seller참조변수활용)에게 과일을 구매하기 위해
		//과일 판매자 객체의 saleApple(int money)메소드 호출시.. 돈을 매개변수로 전달 함.
		//그리고 과일 판매자가 판매한(과일 구매자가 구매한) 사과 개수를 반환 받아옴.
		//과일 구매자객체 관점에서 구매한 사과 개수를 자신의 현재 소유하고 있는 사과개수에 누적
		numOfApple += seller.saleApple(money);
		
		myMoney -= money;
				
	}
	
	//과일 구매 후 과일 구매자의 현재 남은 돈과 현재 가지고 있는 사과 개수 출력
	public void showBuyResult() {
		System.out.println("현재 잔액 : "+myMoney);
		System.out.println("현재 가지고 있는 사과 개수 : "+numOfApple);
	}
		
}	
	
public class test59 {

	public static void main(String[] args) {
		
		//과일 판매자(과일장수)1 객체 생성
		FruitSeller seller1  = new FruitSeller();
		
		//과일 판매자1 잔고 : 0, 보유하고 있는 사과개수 : 30, 개당 가격 : 1500
		
		seller1.initMembers(0, 30, 1500);
		
		
		//과일 판매자(과일장수)2 객체 생성
		FruitSeller seller2  = new FruitSeller();
		
		//과일 판매자2 잔고 : 0, 보유하고 있는 사과개수 : 20, 개당 가격 : 1000
		
		seller2.initMembers(0, 20, 1000);
		
		//과일 구매자 객체 생성
		FruitBuyer buyer = new FruitBuyer();
				
		//과일 구매자 객체는 과일판매자1객체에게 4500원어치 사과구매하기 위해
		//과일 구매자 객체의 buyApple(FruitSeller seller,int money)메소드 호출시
		//과일 판매자 객체(new FruitSeller())를 seller매개변수로 전달하고,
		//과일 구매금액을 int money매개변수로 전달한다.
				
		buyer.buyApple(seller1, 4500);
		
		buyer.showBuyResult();
		seller1.showSaleResult();
		
		//과일 구매자 객체는 과일판매자2객체에게 2000원어치 사과구매하기 위해
				//과일 구매자 객체의 buyApple(FruitSeller seller,int money)메소드 호출시
				//과일 판매자 객체(new FruitSeller())를 seller매개변수로 전달하고,
				//과일 구매금액을 int money매개변수로 전달한다.
		
		buyer.buyApple(seller2, 2000);
				
		buyer.showBuyResult();
		seller1.showSaleResult();
		
		
		/*
			이 프로그램의 문제점 2가지
			1. 과일장수 1,2 객체를 생성하고 난 다음에 상태값 초기화를 해야한다.
			 	즉! 두줄에 걸쳐서 문장을 구성해야 하나의 객체생성을 완료할 수 있다.
			
			2. FruitSeller (과일장수)클래스의
			   변수 APPLE_PRICE의 final 선언이 사라짐.
			   
			   [final이 빠진것이 왜 문제가 되는걸까?]
			   클래스 정의시 과일장수가 판매하는 사과의 개당 가격은 변경되지 않는다는 가정을 두고
			   인스턴스변수 APPLE_PRICE를 final로 선언.
			   그러나 메소드 내에서 APPLE_PRICE 가격을 초기화 하려다보니
			   어쩔 수 없이 final 선언을 강제로 삭제 시킴.
			   메소드는 여러번 호출 할 수 있으므로
			   initMember()메소드를 여러번 호출 한다면
			   객체가 다시 초기화 되는 실수를 범할 수도 있기 때문에
			   한 번만 호출되는 메소드를 사용해서 객체의 상태값을 단 한번만 초기화해서 생성해야함.
			   
			 이 프로그램의 문제점 해결방법 : 딱 한번만 호출되는 메소드의 종류인 생성자 이용!
			 
			 
			   
			 
		
		
		
		*/
	}

}
