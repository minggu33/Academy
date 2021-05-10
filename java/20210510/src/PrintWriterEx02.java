import java.io.*;


// 주제 : PrintWriter 클래스의 printf메소드 사용
// 간단한 성적표를 만들어 어떤 특정파일에 printf메소드를 사용하여 원하는 형식의 데이터로 저장


public class PrintWriterEx02 {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("D:\\sungjuk.txt");
		
		// 파일에 저장할 데이터(성적표 꾸미기)
		pw.println("**********************************");
		pw.println("성적표");
		pw.println("**********************************");
		
		// 홍길동의 3과목 점수 출력 및 3과목 평균 출력
		pw.printf("%3s : %5d %5d %5d %5.1f %n", "홍길동", 98, 67, 85, (float)(98+67+85)/3);

		
		/*
		 	printf 인자 설명
		 	
		 	%		내가 원하는 형식으로 출력하겠다는 뜻
		 	
		 	%3s 	문자열을 출력할 3칸을 준비하겠다 -> ex) "홍길동"
		 	
		  	%5d		정수를 출력할 5칸을 준비하겠다 ->	ex) ___98, ___67
		  	
		  	%5.1f	실수를 출력하는데 소수점은 첫번째자리 값까지 출력하겠다.
		  			중요 -> %5.1f에 해당하는 값도 (float)형의 값이어야 하므로 캐스팅함.
		  	
		  	%n		한 줄띄우기 \n이지만 파일에서 한 줄을 띄울때 %n을 사용하는데 같은 뜻이다.
		  
		 */
		
		// PrintWriter 출력스트림 자원해제
		pw.close();
		
		
		
	}

}
