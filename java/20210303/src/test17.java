
/*
	연산자 문제 4)
	
	아래의 코드의 문제점을 수정해서 [실행결과]와 같은 결과를 얻으시오.
	
	[실행결과]
	c = 30
	ch = C
	f = 1.5
	l = 27000000000
	result = true


*/

public class test17 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
	//	byte b = 30; <--- 수정 후 이유 주석쓰기
		byte c = (byte) (a + b); // 이유 : a변수 값과 b변수 값은 byte타입이므로 이항 연산인 덧셈연산을 하기전에 int타입으로 
	//									 자동 형변환된다. int 10과 int 20을 덧셈 연산하므로 연산결과는 int값이 된다.
	//									  int타입의 값(4 byte)을 byte타입(1byte) 변수에 담아야 하므로 형변환(byte)을 해주어야 한다.
		
		char ch = 'A';
	//	ch = ch + 2; <--- 수정 후 이유 주석쓰기
		ch = (char)(ch + 2); // 이유 : char타입이 덧셈연산의 과정을 거치면서 int타입으로 변환되므로
	//								  char타입의 변수 ch에 저장하기 위해서는 (char)타입으로 형변환 해주어야 한다.	
		
		
	//  float f = 3 / 2'; <--- 수정 후 이유 주석쓰기
		float f = 3 / 2f; // 이유 : 3과 2는 int값, int와 int의 연산결과는 int이기 때문에 3 / 2의 결과는 1이 된다.
		//						  연산결과를 실수값으로 얻고 싶으면, 적어도 두 피연산자 중 한쪽이 실수타입(float와 double중의 하나)이어야 한다.
		
		
		
	//	long l = (3000 * 3000 * 3000);	<--- 수정 후 이유 주석쓰기
		long l = 3000L * 3000 * 3000; // 이유 : int * int * int 의 결과는 int타입의 최대값인 약 2*10의 9제곱을 넘는 결과는
		//									  오버플로우가 발생하여 예상한 결과값과 다른 값을 얻는다.
		//									  그래서 피연산자 중 적어도 한 값은 long타입이여야 최종결과를 long타입의 값으로 얻기때문에
		//									  long타입의 접미사 L을 붙여서 long타입의 리터럴로 만들어줘야 한다.
		
		
		
		float f2 = 0.1f;
		double d = 0.1;
	//	boolean result = d == f2; <--- 수정 후 이유 주석쓰기
		boolean result = (float)d == f2; // 이유 : 비교연산자도 이항연산자이므로 연산시에 두 피연산자의 타입을 맞추기 위해서
		//										  형변환이 발생한다. 그래서 double과 float의 연산은 double과 double의 연산으로 자동형변환
		//										  되는데, 실수는 정수와 달리 근사값으로 표현을 하기 때문에 float를 double로 형변환 했을 때,
		//										  오차가 발생할 수 있다.
		//										  그래서 float값을 double로 형변환하기보다는 double값을 유효자리수가 적은 float로 형변환해서
		//										  비교하는 것이 정확한 결과를 얻는다.
		
		
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);

		

	}

}
