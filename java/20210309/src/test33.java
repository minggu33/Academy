
/*
	3. for 반복문
		for 반복문은 while 반복문과 달리 자체적으로 초기식, 조건식, 증감식을 모두 포함하고 있는 반복문입니다.
		따라서 while문 보다는 좀더 간결하게 반복문을 표현할 수 있습니다.
		
		문법
			for(초기식; 조건식; 증감식){
			
				조건식의 결과가 참인 동안 반복적으로 실행하고자하는 명령문;
			
			}
			
		해설 : for문의 기본순서 구조 = 초기식 -> 조건식 -> 명령문 -> 증감식 
				-> 조건식을 판단해서 참이면 명령문 수행, 거짓이면 for문을 빠져나감

*/

public class test33 {

	public static void main(String[] args) {
//		//안녕하세요 <---- 10번 반복해서 출력
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("안녕하세요.");
//			
//		}
		
		//합계를 저장하기 위한 변수
		int sum = 0;
		
		//10번 반복하여 i변수의 값을 1씩 증가시켜 sum변수에 누적(10번 반복)
		for(int i = 1; i <= 10; i++) {
			
			sum += i; // sum = sum + i;
			System.out.println(i + "까지의 합 : "+ sum);
		}
		/*
		 
		 	i 가 1부터 10이 될때까지(i가 10보다 같거나 작을 조건이 만족되는 동안)
		 	i를 1씩 증가시켜가면서 블럭{ }내의 문장들을 반복 수행한다.
		 */
		
		
		
		
		

	}

}