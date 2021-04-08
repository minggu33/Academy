
//문제 : 상품 하나를 표현하는 클래스 Goods를 작성하라.
/*
	상품은 Goods클래스로 표현되며 String타입의 name, 
	int타입의 price, numOfStock, sold 네개의 변수(필드)를 갖는다.
	Goods클래스 내에 main()메소드를 작성하여 Goods객체를 하나 생성하고,
	이 객체에 대한 참조변수명은 camera로 하라.
	그리고 나서 camera의 상품 이름(name필드)을 "Nikon", 가격(price필드)을 400000,
	재고 개수(numOfStock필드)를 30, 팔린 개수(sold필드)를 50으로 설정하라.
	그리고 설정된 이들 값들을 화면에 출력하라.
	

*/		

public class Goods {
	
	String name;
	int price, numOfStock, sold;

	public static void main(String[] args) {
		
		
			Goods camera = new Goods();
			camera.name = "Nikon";
			camera.numOfStock = 30;
			camera.price = 400000;
			camera.sold = 50;
			
		
		System.out.println("카메라 이름 :"+camera.name+", 재고 개수 : "+camera.numOfStock+
							", 가격 : "+ camera.price+", 팔린 개수 : "+camera.sold);
		
		

	}

}
