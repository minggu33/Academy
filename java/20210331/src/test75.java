
// 변수의 초기화에 대해서 알아봅시다.

// 변수의 초기화란? 변수를 선언하고 처음으로 값을 저장하는 것.

class InitTest{
	
	//멤버변수(인스턴스변수) 선언
	//-> 초기화 하지 않아도 자동으로 int 변수에는 기본값인 0으로 초기화가 이루어짐.
	int x;	// 0
	int y = x;	// x변수에 저장된 0을 y변수에 저장(사용) 가능
	
	void method1() {
		// 메소드 지역내부에 선언한 변수?(지역변수)
		// -> 지역변수를 다른 곳에서 불러다가 사용하기 위해 반드시 초기화가 이루어져야 함.
		// -> 지역변수는 메소드 { } 지역내부에서만 사용가능!
		int i;	// <-- int i = 0; 지역변수는 직접 초기화 필요!
//		int j = i; //컴파일 에러 발생 : 지역변수 i의 값을 처음에 초기화(저장)하지 않았기 때문.
		
		
	}
	
}


// 주제 : static 배열 초기화 연습



public class test75 {
	
	// 명시적 초기화를 통해 static 배열 arr을 10칸 생성
	static int[] arr = new int[10];
	
	
	// 클래스 초기화 블럭을 이용해서 배열의 각 요소를 Math클래스의 random()클래스메소드를 호출해
	// 임의의 값을 얻어 각각 arr배열에 저장
	static {
		for(int i = 0; i<arr.length; i++) {
			// 1과 10사이의 랜덤값(int 정수)을 얻어서 arr배열의 각 인덱스 위치에 반복해서 저장
			arr[i] = (int) (Math.random()*10)+1;
		}
		
	}// 클래스 초기화 블럭 끝
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<arr.length;i++) {
			
			System.out.println("arr["+i+"] : "+arr[i]);
		}
	}

}
/*
 	결론
 	[배열에 값을 초기화 할 경우에는]
 	명시적 초기화 만으로는 복잡한 초기화 작업을 할 수 없기 때문에
 	이런 경우에는 추가적으로 클래스 초기화블럭을 사용하여 배열의 값을 초기화 해야한다.
 	
 	[인스턴스 변수의 복잡한 초기화는]
 	생성자 또는 인스턴스 초기화 블럭을 사용
  
  
  
 */
