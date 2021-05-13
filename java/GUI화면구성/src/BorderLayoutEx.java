import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
	배치관리자 종류 -> BorderLayout
	
	- 컨테이너 공간을 5구역으로 분할해서 배치
	  (East, West, South, North, Center)
	  
	- add 메소드를 이용한 배치 방법
	  add(Component comp, int index)
	  뜻 : comp매개변수로 전달하는 컴포넌트를 index의 공간에 배치
	  
	- 컨테이너의 크기가 변하면 재배치
	


*/
public class BorderLayoutEx extends JFrame{ // 프레임창 역할을 하는 클래스

	public BorderLayoutEx(){
		// 프레임창 창제목 설정
		setTitle("BorderLayout Sample");
		
		// 프레임창 내부에 부착되어 있는 ContentPane 도화지에 BorderLayout 배치관리자 설정
		setLayout(new BorderLayout());
		
		// add 메소드를 이용하여 ContentPane 도화지의 북쪽에 "add"버튼 컴포넌트 생성 후 부착
		add(new JButton("add"), BorderLayout.NORTH);
		
		// add 메소드를 이용하여 도화지의 남쪽에 "sub"버튼 컴포넌트 생성후 부착
		add(new JButton("sub"), BorderLayout.SOUTH);
		
		// add 메소드를 이용하여 도화지의 동쪽에 "mul"버튼 컴포넌트 생성후 부착
		this.add(new JButton("mul"), BorderLayout.EAST);
		
		// dvi버튼을 도화지의 서쪽에 부착
		this.add(new JButton("div"),BorderLayout.WEST);
		
		// Calculate버튼을 중앙에 부착
		this.add(new JButton("Calculate"), BorderLayout.CENTER);
		
		// 프레임창 너비 높이 설정
		this.setSize(800,900);
		
		//
		this.setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new BorderLayoutEx(); // 프레임창 객체 생성
		
		

	}

}
