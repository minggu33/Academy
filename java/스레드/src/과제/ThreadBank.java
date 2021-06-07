package 과제;

class inMoney extends Thread {
	private int money = 0;
	private MyAccount myAcct = null;
	
	inMoney(MyAccount acct, int m){
		myAcct = acct;
		money = m;
	}
	
public void run(){
		myAcct.add(money);
		System.out.println("입금[" + money + "] 출금[-----] 잔액[" + myAcct.getCurMoney() + "]");
	}
}


 class MyAccount {
	private int totalMoney = 0;
	
	MyAccount(int money){
		totalMoney = money;
		System.out.println("계좌가 만들어 졌습니다. : " + totalMoney);
	}
	
public synchronized void add(int money){
		this.notify();
		totalMoney += money;
	}
	
public synchronized void sub(int money){
	if(totalMoney < money){
			try {
				System.out.println("잔액이 부족하여 우선 대기중...");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		totalMoney -= money;
	}
	
public int getCurMoney(){
		return totalMoney;
	}
}


class outMoney extends Thread {
	private int money = 0;
	private MyAccount myAcct = null;
	
	outMoney(MyAccount acct, int m){
		myAcct = acct;
		money = m;
	}
	
public void run(){
		myAcct.sub(money);
		System.out.println("입금[-----] 출금[" + money + "] 잔액[" + myAcct.getCurMoney() + "]");
	}
}


public class ThreadBank {

	public static void main(String[] args) {
		MyAccount acct = new MyAccount(1000);
				
				new inMoney(acct, 10).start();
				new outMoney(acct, 100).start();
				new inMoney(acct, 50).start();
				new outMoney(acct, 900).start();
				new inMoney(acct, 10).start();
				new outMoney(acct, 100).start();
				new inMoney(acct, 500).start();
		
	}

}
