package 이벤트처리;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 이벤트 처리 4단계 중에서
// 4단계 이벤트 처리 방법
// - 내부익명 클래스형식으로 이벤트 리스너 클래스를 만들어서 이벤트를 처리하는 방법


// 주제 : Frame4.java와 동일


// 프레임 창 역할을 하는 클래스
public class Frame5 extends JFrame{

	// 생성자
	Frame5(){
		setTitle("이벤트 4단계 처리"); // 프레임창 제목 설정
		
		setLayout(new FlowLayout()); // 프레임창에 컴포넌트들을 배치할 배치관리자를 FlowLayout으로 설정
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Action 텍스트 버튼 객체 생성후 프레임창에 등록
		
		JButton btn = new JButton("Action");
		
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// 4단계 이벤트 처리 방법
		// ** 특징1
		// 내부익명클래스는 클래스 정의 부분과 객체 생성 부분이 하나로 합쳐져 있다.
		// 그러므로 굳이 클래스 이름을 정의할 필요가 없다.
	
		
		// 위 버튼에 이벤트를 처리할 이벤트 리스너 객체 등록
		// 1. new ActionListener(){actionPerformed(){}} 이름이 없는 내부익명 클래스를 만드는데
		// (방법 : ActionListener인터페이스의 actionPerformed 추상메소드를 오버라이딩해서 만들자.)
		// 2. 위 1.에서 이름이 없는 내부익명클래스(이벤트리스너클래스)를 만들었기 때문에
		// 내부익명클래스에 대한 이름없는 내부 익명객체를 생성해서 버튼에 등록!
		// 종합 : ActionListener인터페이스 내부의 actionPerformed 추상메소드를 오버라이딩 시키는
		//		 이름이 없는 내부 익명클래스를 만들고, 또한 내부 익명객체 생성하여 btn버튼에 등록!
		
		btn.addActionListener(new ActionListener() {
			// 버튼을 클릭하면 호출되는 콜백 메소드 오버라이딩
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭된 버튼 객체 얻기
				JButton b = (JButton) e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("액션");
				}else {
					b.setText("Action");
				}
				 // *** 특징2
				  // 이 이벤트리스너클래스(내부익명클래스)는 자신을 둘러싼 외부클래스(Frame5)의 멤버(변수, 메소드)에
				  // 마음대로 접근 할 수 있다.
				 setTitle(b.getText()); // Frame5 프레임창의 창제목 설정
				 
				
				
			} // actionPerformed 메소드 끝
			 
			
		});
		setSize(800,300); // 프레임창 사이즈 설정
		
		setVisible(true); // 숨겨져있던 프레임창 보이게 설정
		
	}// 생성자 끝
	
	
	
	public static void main(String[] args) {
		new Frame5();

	}

}
