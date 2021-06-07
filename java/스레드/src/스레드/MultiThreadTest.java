package 스레드;
//다음 싱글 스레드에서 처리하는   많은 작업들을  각각의 작업스레드들을 만드는 방식으로 바꾸시오.
//힌트! :  각각 작업스레드 클래스 따로 만들기 
public class MultiThreadTest {
	static long startTime = 0;
	
	//싱글(메인)스레드
	public static void main(String[] args) {

		
		MultiThreadDemo4 mtd = new MultiThreadDemo4();
		
		
		MultiThreadDemo5 mtd1 = new MultiThreadDemo5();
		
		MultiThreadDemo6 mtd2 = new MultiThreadDemo6();
		
		//작업1
		for(int i=0;  i<10;  i++) {
			System.out.print(i);
			
		}
		
		mtd.start();
		
		mtd1.start();
		mtd2.start();

			
	
	}

}

class MultiThreadDemo4 extends Thread{
	
	@Override
	public void run() {
		//작업2
		for(char i='A';  i<='Z'; i++){
		System.out.print(i);
		
	}
	
	}
	
}


class MultiThreadDemo5 extends Thread{
	
	@Override
	public void run() {

		//작업3
		for(char i='a';  i<='z'; i++){
			System.out.print(i);
		
		}
		
	
	}
	
}

class MultiThreadDemo6 extends Thread{
	
	@Override
	public void run() {

		//작업4
		char arr[] = {'ㄱ', 'ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅈ'};
		for(char i : arr){
			System.out.print(i);
			
		}
		
	
	}
	
}



//실행결과 
//0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzㄱㄴㄷㄹㅁㅂㅅㅈ

//과제 내용~~
/*
실행결과를 보면.. 메인(싱글)스레드에서 4가지의 작업을 하고 있다.
각각의 작업스레드 클래스를 만들어서   멀티스레딩  방식으로 바꾸세요~~~  
*/


