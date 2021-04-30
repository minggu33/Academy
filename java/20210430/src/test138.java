import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	컬렉션 API에서 제공해주는 HashMap클래스
	
	최상위 인터페이스 Collection - 자식인터페이스 Map - 자식클래스 HashMap
	
	Map인터페이스를 구현한(추상메소드를 오버라이딩 해놓은) HashMap 자식클래스!
	- (키, 객체) 한쌍으로 묶어서 HashMap객체 메모리에 저장
	- HashMap객체 메모리는 한쌍의 데이터들을 순서를 유지하지 않는 객체(데이터)들의 집합
	- 키는 중복 허용 x
	- 객체는 중복허용 o


*/

public class test138 {

	public static void main(String[] args) {
		
		// 부모 Map인터페이스 타입의 참조변수 map에 new HashMap()자식객체를 생성해서 저장
		Map map = new HashMap(); // 업캐스팅
		
		// Map인터페이스 내부에 만들어져 있는 추상메소드
			// Object put(Object key, Object value) 메소드
				// 매개변수 value로 전달받는 객체(데이터)를 매개변수 key로 전달받는 키값에 연결하여
				// Map인터페이스를 구현한 자식객체에 저장시키는 메소드
		
		// 참고 : HashMap 클래스에는 Map인터페이스에 만들어져 있는 put 추상메소드를 오버라이딩하여
		// 		 정의해 놓았음
		
		/* HashMap객체의 put메소드를 이용하여 key와 value(객체)를 한쌍으로 묶어서 한쌍씩 저장*/
		map.put(10, "one");
		map.put(20, "two");
		map.put(30, "three");
		map.put(10, "four");
		map.put(20, "five");
		map.put(30, "six");
		map.put(60, "seven");
		map.put(70, "eight");
		
		
		/* HashMap객체에 저장된 모든 key들만 반환하여 
		   Set 인터페이스를 구현한 keyset자식객체에 저장후 반환하기 때문에
		   Set 부모 인터페이스 타입의 참조변수에 keyset자식객체배열을 저장해야한다.*/
		Set keys = map.keySet();
		
		// keySet배열에 저장된 데이터들(HashMap배열에 저장된 key값들)을 모두 꺼내어서
		// Iterator인터페이스를 구현한 Iter배열에 저장 후 Iter배열 자체를 반환
		Iterator itr = keys.iterator();
		
		while (itr.hasNext()) {
			// key 얻기
			Integer key= (Integer) itr.next();
			
			// 각각의 key를 이용하여 HashMap객체메모리에 저장되어 있는 value(객체)얻기
			// -> get()메소드 호출
			String value = (String)map.get(key);
			
			System.out.println(key + " : "+ value);
		}
		
//			request.setAttribute(key,value);
//			request.getAttribute(key) -> value 리턴 받음
			
//			HashMap.put(key,value);
//			HashMap.get(key); -> value 리턴받음
		
//			request.setAttribute("List", new ArrayList())
//			request.getAttribute("List") 
		
		
				
		
		

	}

}
