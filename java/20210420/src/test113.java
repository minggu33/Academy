

// tank, dropship, scv <- 기계 유닛이기 때문에
// 기계유닛을 묶어주기 위해 Repairable 인터페이스 만들기
interface Repairable{	
}


// dropship을 제외한 나머지 유닛들은 Boardable 인터페이스 구현한다.
interface Boardable{
	
}

// marine과 medic은 사람이기 때문에 Healable 인터페이스 구현한다.
interface Healable{
	
}




// 최고 조상 유닛 추상클래스 만들기
abstract class Unit{
	// 유닛의 현재체력을 저장할 변수
	int hitPoint;
	// 유닛의 최대체력을 한번만 초기화해서 저장할 상수
	final int Max_HP;
	// Unit객체 생성시 유닛의 최대체력을 초기화할 생성자
	 Unit(int hp) {
		 Max_HP= hp;
	}
	 
 // 추상메소드
	 // 각각의 유닛은 무브사운드와 어택사운드를 가지고 있지만
	 // 유닛마다 다른 고유의 사운드를 가지고 있기 때문에
	 // 미완성 메소드인 추상메소드를 작성해 놓는다.
	 
	 // 무브사운드 기능의 추상메소드
	 public abstract void move_Sound();
	 // 어택사운드 기능의 추상메소드
	 public abstract void attack_Sound();
	 
 // 일반메소드
	 // 모두 같은 ok사운드는 일반메소드에 구현해준다.
	 public void ok_Sound() {
		 System.out.println("ok");
	 }
	 	 
} // Unit 추상클래스 끝

// 마린클래스 만들기 ( Unit추상클래스 상속받고, 
//					사람이기때문에 Healable인터페이스 구현받고,
//				 	dropship을 제외한 나머지 유닛이기 때문에 Boardable 인터페이스 구현받는다.)
class Marine extends Unit implements Healable,Boardable{
	
	// 마린의 최대 체력을 40으로 저장
	public Marine() {
		super(40);
	}

	
	// 메소드 오버라이딩
	@Override
	public void move_Sound() {
		System.out.println("go!go!go!");
		
	}

	@Override
	public void attack_Sound() {
		System.out.println("fire");
		
	}
		
}


// 메딕 클래스 만들기( Unit 추상클래스 상속 받고,
//				   사람 유닛이기때문에 Healable인터페이스 구현받고,
//				   dropship유닛을 제외한 나머지 유닛에 해당하므로 Boardable 인터페이스 구현받는다.)
class Medic extends Unit implements Healable,Boardable{
	
	// 메딕의 처음 최대체력 40으로 초기화 할 생성자
	public Medic() {
		super(40);
	}

	// Unit추상클래스의 추상메소드(무브사운드기능의 메소드)를 메딕에 맞게 오버라이딩
	@Override
	public void move_Sound() {
		System.out.println("메딕간다.");
		
	}

	@Override
	public void attack_Sound() {
		System.out.println("메딕 공격한다.");
		
	}
	
	// 유닛을 치료하는 기능의 일반메소드
	// Healable부모인터페이스를 구현한 자식객체들(Marin, Medic)을 매개변수로 전달받아 치료
	public void heal(Healable r) {
		
		Unit u = (Unit)r;
		
		while(u.hitPoint != u.Max_HP) {
			u.hitPoint++;// 유닛의 현재 체력을 1씩 증가시켜 치료
			System.out.println("치료중...>"+u.hitPoint);
			
		}
		System.out.println("치료완료");
	}// heal 메소드 끝
	
	
}//Medic클래스 끝


// SCV클래스 만들기(Unit추상클래스 상속,
//				 dropShip을 제외한 나머지 유닛에 속하므로 Boardable인터페이스 구현,
//				 기계유닛이므로 Repairble인터페이스 구현)

class SCV extends Unit implements Boardable,Repairable{
	
	// SCV의 처음 최대 체력 60으로 초기화할 생성자
	public SCV() {
		super(60);
	}
	
	// 메소드 오버라이딩
	@Override
	public void move_Sound() {
		System.out.println("wing");
		
	}

	@Override
	public void attack_Sound() {
		System.out.println("zizic");
		
	}
	
	// 유닛을 치료하는 기능의 메소드
	public void repair(Repairable r) {
		Unit u = (Unit) r;
		while(u.hitPoint != u.Max_HP) {
			//치료
			u.hitPoint++;
			System.out.println("수리중...>"+u.hitPoint);
		}
		System.out.println("수리 완료!");
	}//repair 메소드 끝
	
	
}// SCV클래스 끝


//Tank클래스 만들기(Unit 추상클래스 상속,
//				 dropShip을 제외한 나머지 유닛에 속하므로 Boardable인터페이스 구현받고,
//				 기계 유닛이기때문에 Repairable인터페이스 구현받는다.)
class Tank extends Unit implements Boardable,Repairable{
	
	// Tank의 최대 체력 150
	Tank() {
		super(150);
	}
	
	
	@Override
	public void move_Sound() {
		System.out.println("yes sir");
		
	}

	@Override
	public void attack_Sound() {
		System.out.println("kwang");
		
	}
	
	// 시저모드 기능의 소리를 나타내는 일반메소드
	public void mode_sound() {
		System.out.println("wung");
	}
	
		
}// Tank클래스 끝


// DropShip클래스 만들기( Unit추상클래스 상속,
//					   기계유닛에 속하므로 Repairable 인터페이스 구현)

class DropShip extends Unit implements Repairable{
	
	DropShip(){
		
		super(100);
	}

	@Override
	public void move_Sound() {
		System.out.println("슝~");
		
	}

	@Override
	public void attack_Sound() {
		System.out.println("덜컹!");
		
	}
	
	// 일반메소드
	public void mode_sound() {
		System.out.println("철커덕~");
	}
	
	// 유닛을 태우는 기능을 하는 일반메소드 만들기
	public void tab(Boardable b) {
		System.out.println("태웠습니다.");
	}
		
} // DropShip 클래스 끝







public class test113 {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Tank t = new Tank();
		SCV s = new SCV();
		Medic md = new Medic();
		DropShip ds = new DropShip();
		
		System.out.println("마린: 10데미지 손상! ");
		m.hitPoint = 30; // 마린의 현재체력 30
		
		System.out.println("메딕으로 마린을 치료해 준다.");
		md.heal(m);	// 메딕으로 마린을 치료해 준다.
		m.ok_Sound(); // ok
		m.move_Sound(); // gogogo
		
		System.out.println("탱크 피해 10데미지 손상!");
		t.hitPoint = 140;
		System.out.println("SCV로 탱크 치료중...");
		s.repair(t);
		t.ok_Sound();
		t.move_Sound();
		t.mode_sound();
		
		System.out.println("SCV 현재 체력은 0이다 SCV객체로 치료!");
		
		
		
		

	}

}
