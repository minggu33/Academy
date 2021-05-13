
import javax.swing.JFrame;
import javax.swing.JLabel;

// 배치관리자를 지정하지 않고 내가원하는 대로 컨테이너에 배치할 수 있다.

public class NullContainerEx extends JFrame{
	
	// 기본생성자
	public NullContainerEx(){
		// 프레임창의 제목 설정
		this.setTitle("NullContainer Sample");
		// 프레임창 내부에 부착된 ContentPane도화지에 배치관리자를 지정하지 않으면
		// 기본적으로 특정 배치관리자로 설정되어 있다.
		// 그러므로 우리는 특정 배치관리자를 ContentPane도화지에서 제거해야 한다.
		
		this.setLayout(null);
		
		// JLabel 컴포넌트 생성하고 직접 위치와 크기를 지정한다.
		JLabel la = new JLabel("Hello, Press Buttons!");
		
		// 위 생성한 JLabel 객체의 텍스트 내용을 ContentPane 도화지의 130,50 위치로 지정해서 배치하기위해 설정
		la.setLocation(130,50);
		
		// 위 생성한 JLable 객체영역의 크기를 200너비 X 20 높이로 설정
		la.setSize(200,20);
		
		// ContentPane 도화지에 JLabel 컴포넌트 부착
		this.add(la);
		
		
		for(int i=1; i<10;i++) {
			// 버튼 컴포넌트 생성
			for(int j=1;j<10;j++) {
				
			}
		}
		
		
		// 프레임창 사이즈 및 보이게 설정
		setSize(300,200);
		setVisible(true);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new NullContainerEx();
		
		
		
		
		

	}

}
