
public class test34 {

	public static void main(String[] args) {
		
	// 문제 : 0과 10사이의 짝수들의 합 구하기
		
	// 4바이트 크기의 정수값을 저장할 sum1변수 선언 후 0저장
	
	// for 반복문을 이용 
		
	// 출력결과
	/*
	 
	 		0 : 0
	 		2 : 2
	 		4 : 6
	 		6 : 12
	 		8 : 20
	 		10 : 30
	 */
		
	int sum1 = 0;
	
	for(int j = 0; j <= 10; j+=2) {
		sum1 += j;
		System.out.println(j + " : "+ sum1);
	}
	
	System.out.println("-------------------------------------------------");
		
	// 문제 : for 문을 이용하여 "Hello World"문자열을 10번 반복해서 출력
	
	for(int i = 0; i < 10; i++) {
		System.out.println("Hello World");
	}
	
	System.out.println("for반복문을 빠져나옴");
	System.out.println("-------------------------------------------------");
	
	// 문제 : for문을 이용하여 1부터 10까지 숫자중 홀수들의 합을 최종적으로 구해 한번만 출력
	// 출력결과
	// 총 합계는 25
	
	int sum2 = 0;
	for(int k = 1; k <= 10; k+=2) {
		sum2 += k;		
		}
	System.out.println("총 합계는 "+ sum2);
	System.out.println("-------------------------------------------------");
	
	// 문제 : 1부터 100까지의 짝수합(2550) 출력
	int sum = 0;
	
	for(int i = 1; i <= 100; i++) {
		
		if(i%2==0) {
			sum += i;
					
		}		
	}
	
	System.out.println("총 합은 : "+ sum);
	System.out.println("-------------------------------------------------");
	
	/*
	 	break문
		break문은 현재 위치에서 가장가까운 반복문을 벗어날때 사용하는 키워드
		주로 if문과 함께 사용되어 특정 조건식을 만족하면 반복문을 벗어나는데 사용하는 키워드
		
*/
	// 10번 반복하여 i변수값을 출력하되 i변수에 저장된 값이 5가 될때 for반복문을 완전히 빠져나가게 하기
	for(int i = 0; i < 10; i++) {
		if(i == 5) {
			break;
		}
		System.out.println(i);
	}
	System.out.println("--------------------------------------------------");
	
	// 문제 : for반복문을 이용하여 구구단 출력
	
	// 단 제목 붙이기 표시
	
	
	for(int i = 2; i < 10; i++) {
		//%6d는 정수형으로 6자리까지 나타냄
		System.out.printf("%7d",i);
//							%d <- 정수
//							%s <- 문자열
		}
	System.out.println();
	
		for(int i = 1; i < 10; i++) {// 바깥쪽 for 행(세로) 반복
			
			for(int j = 2; j < 10; j++) {//안쪽 for 열(가로) 반복
				
				//System.out.print(j+"X"+ i + "="+ (j*i)+"    ");
				System.out.printf("%dX%d=%2d  ", j,i,(j*i));
				
			}// 안쪽 for
			
			//하나의 행이 완성될때마다 줄바꿈 출력
			System.out.println();
			
		}// 바깥쪽 for
	
		System.out.println("--------------------------------------------------");
		/*
		
		문제 : 다중 for문 사용하여 아래와 같이 * 출력
		*
		**
		***
		****
		*****
	
		*/
	
		for(int i = 1; i < 6; i++) {
			
			for(int j = 0; i > j; j++) {
				
					System.out.print("*");
					
				}
				System.out.println();
			}
			
		
		
		
	}

}
