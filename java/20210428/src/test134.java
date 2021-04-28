import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ArrayList 배열을 이용한 객체(데이터) 저장하기 연습1


public class test134 {

	public static void main(String[] args) {

		// ArrayList 가변길이 객체배열 생성, 
		// 참조변수 부모 List인터페이스 타입으로 선언 -> 참조변수 이름 list
		List list = new ArrayList();
		
		
		// 위 ArrayList 가변길이 배열 공간에 "홍길동" 문자열객체 추가
		list.add("홍길동");
		
				
		// 위 ArrayList 가변길이 배열 공간에 123을 수동박싱해서 추가
		list.add(new Integer(123));
		
		
		// 위 ArrayList 가변길이 배열 공간에 3.14F를 수동박싱해서 추가
		list.add(new Float(3.14));
		
		// 위 ArrayList 가변길이 배열 공간에 234를 오토박싱해서 추가
		list.add(234);
		
		
		/* 위와 같은 데이터들을 중복해서 저장하기*/
		// 위 ArrayList 가변길이 배열 공간에 "홍길동 문자열객체 추가
		list.add("홍길동");
		
		// 위 ArrayList 가변길이 배열 공간에 123을 수동박싱해서 추가
		list.add(new Integer(123));
		
		// 위 ArrayList 가변길이 배열 공간에 3.14F를 수동박싱해서 추가
		list.add(new Float(3.14));
		
		// 위 ArrayList 가변길이 배열 공간에 234를 오토박싱해서 추가
		list.add(234);
		
		// for문을 이용해서 ArrayList배열에 저장된 모든 객체(데이터)들을 반복해서 얻어 출력
		// 출력결과 : 홍길동	123		3.14	 234 	홍길동	123		3.14	 234
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
		
		System.out.println();
		
		// ArrayList 배열에 저장된 모든 객체(데이터)들을 꺼내서 iterator인터페이스를 구현한 자식배열객체에 저장
		Iterator iterator = list.iterator();
		
		
		// iterator배열에 객체(데이터)가 저장되어 있는 동안 반복해서 객체(데이터)를 꺼내와 사용함
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.print(obj+"\t");
		}
		
		
		
		

	}

}
