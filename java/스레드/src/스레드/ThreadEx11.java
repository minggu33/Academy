package 스레드;


class ThreadT extends Thread{
	
	int result;
	
	public ThreadT(String name) {
		super(name);
		result = 0;
	}
	
	@Override
	public void run() {
		// 현재 실행되고 있는 스레드 이름 + 몇번 일을 했는지에 대한 정보를 100번 반복하여 출력
		for(int i = 0; i<100; i++) {
			result += i; // 누적
			// 현재 실행하고 있는 스레드 이름 + 누적합계 출력
			System.out.println(Thread.currentThread().getName()+" result : "+result);
			Thread.yield();
			// - 같은 우선순위에 존재하는 스레드에게 실행기회를 양보하는 메소드 호출!
			// - 만약 같은 우선순위의 스레드가 하나도 없으면, 현재 실행중인 자기자신의 스레드를 다시 실행시킴
			
		}
	
	}
	
	
	
}



public class ThreadEx11 {

	public static void main(String[] args) {
		
		// 작업스레드 3개 생성 후 스레드작업준비 시키기
		new ThreadT("첫번째 작업스레드").start();;
		new ThreadT("두번째 작업스레드").start();;
		new ThreadT("세번째 작업스레드").start();;
		

	}

}
