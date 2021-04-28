import java.util.ArrayList;
import java.util.Iterator;

/*
	자바에서 제공해주는 컬렉션 API
	- 객체(요소, 데이터)를 담는 가변적 공간을 나타내는 클래스들의 묶음
	
	컬렉션 API
	- 최상위 Collection 인터페이스 제공
	- Set 인터페이스 제공
	- List 인터페이스 제공
	- Map 인터페이스 제공
	
	Set 인터페이스를 구현한 자식클래스들  : 데이터를 순서없이 저장, 데이터 중복 저장 불가능
	List 인터페이스를 구현한 자식클래스들 : 추가한 순서대로 데이터가 저장, 데이터 중복 저장 가능
	Map 인터페이스를 구현한 자식클래스들 : 데이터 저장시 Key/Value를 한쌍으로 묶어서 저장, 
									이후에는 Key를 이용해 Value를 얻을 수 있다.
									Key <- 중복 저장 불가능
									Value <- 중복 저장 가능
	
	
	
	주제 : Collection 최상위 인터페이스 - List 인터페이스 - ArrayList클래스
	
	 								


*/

public class test133 {

	public static void main(String[] args) {
		
		// 기본데이터들을 저장할 고정 배열
		int[] arr1 = {10,20,30};
		
		// 컬렉션 API에서 제공해주는 ArrayList 가변길이배열 ?
		// -> 새로운 객체 데이터를 ArrayList 배열에 추가할 때마다 배열메모리 공간이 가변으로 늘어나는 가변길이배열.
		
		ArrayList a1 = new ArrayList();
		// 참고 : 최상위 Collection인터페이스의 추상메소드를 구현한 ArrayList클래스는
		// 데이터를 추가, 삭제, 데이터갯수 등을 알아내는 Collection인터페이스의
		// add(), remove(), size() 메소드들을 사용할 수 있다.
		
		a1.add(10); // ArrayList 배열의 0번째 인덱스 위치에 숫자10을 오토박싱하여 저장
		a1.add(20); // ArrayList 배열의 1번째 인덱스 위치에 숫자20을 오토박싱하여 저장
		a1.add(new Integer(30)); // ArrayList 배열의 2번째 인덱스 위치에 숫자30을 수동박싱하여 저장
		 
		
		// ArrayList 가변길이 배열의 크기 : size() 메소드 호출
		// ArrayList 가변길이 배열의 각 인덱스 위치에 저장된 객체 얻기 : get(index) 메소드 호출		
		
		// ArrayList 가변길이 배열에 저장된 데이터의 갯수만큼 반복하여
		// ArrayList 가변길이 배열에 저장된 데이터 얻기
		for (int i = 0; i < a1.size(); i++) {
			
			System.out.println( a1.get(i)); // 0인덱스 위치의 : 10
											// 1인덱스 위치의 : 20
											// 2인덱스 위치의 : 30
			
		}
		
		// ArrayList 가변길이 배열의 특정 인덱스 위치에 저장된 객체(데이터) 제거 : remove(index) 메소드 호출
		a1.remove(1); // 1인덱스 위치의 20 삭제 
		
		for (int i = 0; i < a1.size(); i++) {
			
			System.out.println( a1.get(i)); // 0인덱스 위치의 : 10
											// 1인덱스 위치의 : 30
														
		}
		
		
		// ArrayList 가변길이 배열의 특정 인덱스 위치에 객체(데이터) 삽입 : set(index, value) 메소드 호출
		a1.set(1, 200);
		
		for (int i = 0; i < a1.size(); i++) {
			
			System.out.printf( "%d\n",a1.get(i)); // 0인덱스 위치의 : 10
												  // 1인덱스 위치의 : 200
														
		}
		
		System.out.println("----------------------------------------------------");
		
		
		// Iterator 인터페이스?
		// -> 모든 컬렉션 배열객체에 저장되어 있는
		// 		각 객체(데이터)들을 반복해서 얻어올때 사용되는 메소드를 제공해주는 인터페이스
		
		// Iterator 인터페이스의 추상메소드들
		// -> hasNext() : Iterator 인터페이스를 구현한 자식객체에 
		//				  컬렉션 배열에서 데이터들을 저장하고 있느냐? 라고 물어보는 메소드이다.
		//				  저장되어 있으면 true 반환, 저장되어 있지 않으면 false를 반환
		// -> next() : Iterator인터페이스를 구현한 자식객체에
		//			   컬렉션 배열에서 꺼내온 데이터들을 순서대로 꺼내올때(얻을때, 리턴받을때) 사용하는 메소드
		// 
		
		ArrayList arraylist = new ArrayList();
					arraylist.add("안녕하세요");
					arraylist.add(10);
					arraylist.add(3.14);
					
					
									// Arraylist객체의 iterator() 메소드를 호출하면
									// Arraylist배열에 저장된 모든 객체(데이터)들을 꺼내서
									// Iterator 부모 인터페이스를 구현한 자식 객체(ArrayList$Itr)에 저장 후
									// 자식 객체(ArrayList$Itr배열)을 반환한다.
				Iterator iterator= arraylist.iterator();
				
			//ArrayList$Itr 배열에 ArrayList배열에서 꺼내온 값이 저장되어 있는 동안만 반복
		while(iterator.hasNext()) {
			// ArrayList$Itr배열에 저장된 데이터를 순서대로 꺼내온다
			System.out.println(iterator.next());
			
		}
	
		// 참고 : Iterator인터페이스는 Collection인터페이스의 iterator()메소드를 상속받음.
		//		 Collection최상위 인터페이스의 추상메소드를 오버라이딩 해놓은 자식컬렉션 클래스들에서
		//		 Itrator메소드 사용 가능

		for (Iterator it = arraylist.iterator(); it.hasNext();) {
			// ArrayList$Itr 배열에 저장된 데이터를 순서대로 꺼내온다.
			System.out.println(it.next());
		}
				
				
				
				
				
				
	}

}
