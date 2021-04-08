
public class Test3 {

	public static void main(String[] args) {
		// 데이터의 형태 변환 (데이터 형변환)
		// 데이터의 형태를 변환 하는 것을 말함

		// 자바에서 데이터의 형변환 방법 2가지
		// 1. 자동 형변환(묵시적 형변환)
		// 2. 강제 형변환(염시적 형변환)
		
		
		// 1. 자동 형변환
		
		long i = 100; // int(4바이트크기)의 100을 long(8바이트크기)의 i변수에 저장 할때..
					  // 100은 자동으로 long타입의 데이터로 자동으로 형태가 변환되어
					  // long 타입의 i변수에 저장되게 된다.
		
		double d = 12.34f; // float(4바이트크기)의 12.34F값을
						 	// double(8바이트크기)의 d변수에 저장할때..
							// float(4바이트크기)dml 12.34F값은 자동으로 double크기의 데이터로
							// 자동 형변환되어서 12.34d로 만들어 지고 double d변수에 저장된다
		
		double c = 100;	// int(4바이트크기)의 100정수값을
						// double(8바이트크기)의 c변수에 저장하려고 할때
						// int 값인 100이 double값인 100.0d로 자동 형변환 되어
						// c변수에 저장된다.
		
		// int(4바이트크기)의 변수에 저장된 123같이 연산하게 되므로
		// 123정수값이 123.0f로 자동형변환 되어서 연산하게 되므로
		// 123.0f + 12.3f를 이용해 135.3f가 되어 float y변수에 저장되게 된다.
		int x = 123;
		
		float y = x + 12.3f;	// 123.0 + 12.3
								// 135.3
		System.out.println(y);

		
		// 2. 강제 형변환(염시적 형변환)
		// 문법) 데이터타입1 변수명 = (데이터타입1)다른데이터값;
		// 문법 설명) 어떤 특정 데이터타입1의 변수에 다른데이터값을 저장할때...
		//			( )안에 데이터타입1을 적어서 다른데이터값 앞에 붙이면 된다.
		
		float f = (float)12.34; // 12.34는 자바에서 double(8바이트크기)의 데이터로 인식하므로..
								// 이때 12.34를 float(4바이트크기)의 변수f에 담으려고 할때
								// 강제로 12.34를 12.34f로 형변환(캐스팅)시켜 주어야 한다.
		
		int numInt = 123;
		short numShort = (short)numInt;
		
		// int a변수 메모리 크기는 4바이트 (32비트)~~
		// 1.1 실수값은 double(8바이트)크기의 데이터 이므로 int a변수에 4바이트 메모리에 저장할수 없다.
		// 그러므로 1.1을 강제로 개발자가 정수 1로 데이터형태를 변환해 주어야 한다.
		int a = (int)1.1; 
		System.out.println(a);
		
		
	}

}
