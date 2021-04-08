
// 주제 : 여러개의 객체메모리를 만든 후 그 객체메모리들을 배열에 저장 시킬 수 있다.

// 사람클래스 만들기
class Person{
	//변수
		//이름을 저장할 변수 만들기
		String name;
		//나이를 저장할 변수 만들기
		int age;
	
	//메소드
		//이름을 알려주는 기능의 메소드 만들기
		String getname() {
			return name;
		}		
}




public class test57 {

	public static void main(String[] args) {
		
		// 객체 배열이란?
		// 생성된 객체 메모리에 주소번지를 원소로 갖는 배열
		
		// new Person()객체 메모리들이 저장되어 있는 배열의 주소를 담을 pa변수 선언
		Person[]  pa; 
				
		// new Person()객체 메모리들을 저장할 배열메모리 생성 후 배열메모리의 주소를 pa변수에 저장		
		pa = new Person[10];
		
		// pa 변수에 저장된 new Person[10]배열의 크기 만큼 반복해서
		// new Person()객체를 10번 생성 후 배열의 각인덱스 위치에 저장
		for(int i = 0; i < pa.length; i++) {
			
			// 배열에 각 인덱스 위치에 새로운 new Person()객체 생성후 저장
			pa[i] = new Person();
			
			// 배열의 i변수에 저장된 인덱스 위치 번째에 존재하는
			// new Person()객체 내부의 age객체 변수에 접근하여
			// 30 ~ 39 저장
			pa[i].age = 30 + i;
		}
		
		// 배열에 각 인덱스 위치에 저장된 new Person()객체 내부의 age변수 값을 얻어서 출력
		for(int i = 0;i < pa.length; i++) {
			System.out.println("배열에 "+i+"번째 인덱스 위치에 저장된 Person객체"+(i+1)+" 객체변수age = "+pa[i].age);
		}
		
		
		
		

	}

}
