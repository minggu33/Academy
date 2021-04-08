

/* 복습 연습문제1 */

public class test35 {

	public static void main(String[] args) {
		/* 복습 연습문제1 */
		
		// 문제 : 1부터 20까지의 정수 중에서.. 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		// 1. 총합을 저장할 sum변수 선언
		int sum = 0;
		
		// 2. for 반복문을 이용하여 1부터 20까지 반복
		//	  i가 2또는 3의 배수가 아닐때만 sum변수에 i변수에 저장된 값 누적
		
		// 3. sum 변수에 저장된 값 출력
		// 출력결과
		// 73
		for(int i = 1; i<=20; i++) {
			
			if(i%2 != 0 && i%3 != 0) {
				
					sum += i;
				
			}
			
		}
		System.out.println(sum);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		/* 복습 연습문제2 */
		
		// 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성
		
		for(int i= 1; i<=6;i++) {
			for(int j = 1; j <= 6; j++) {
				if(i+j==6) {
					System.out.println("( "+i+", "+j+" )" );
				}
			}
		}
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		/* 복습 연습문제3 */
		
		// 방정식 2x + 4y = 10의 모든 해를 구하시오. 단 x,y는 0 ~ 10 사이의 정수
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if((2*x)+(4*y)==10) {
					System.out.println("x = "+x+", y = "+y);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
