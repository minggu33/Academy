



public class test30 {

	public static void main(String[] args) {
		
		//예제 : 숫자10부터 1씩 감소시켜가면서 숫자값을 반복 출력하는 예제
		
		int i = 10;
		while(i>0) {// i 변수에 저장된 값이 0이상일때까지 명령문 반복 실행
			System.out.println(i--);
				
		}
		// 위 명령문의 i--의 --는 후위형 감소연산자이기때문에 i변수의 값이 출력된 후에 1감소한다.
		
		System.out.println("--------------------");
		
		//예제 : while 반복문을 사용해서 구구단을 반복해서 출력하는 예제
		i = 2;
		
		
		while(i<10) { //바깥쪽 while반복문
			
			int j = 1;
			
			while(j<10) { //안쪽 while반복문
				System.out.println(i +" * "+ j+" = "+(i*j));
				j++;
			}
			i++; //2단, 3단, 4단,... 9단을 표현하기 위해서 i변수값을 1씩 증가
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
