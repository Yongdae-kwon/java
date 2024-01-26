package sec01.exam02_swing;

import java.awt.BorderLayout;		//  창의 레이아웃
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;			// 버튼
import javax.swing.JFrame;			// 프레임

// Frame 상속
public class App extends JFrame {
	
	public App() {
		// 제목 설정
		setTitle ("Swing App");
	
		// 윈도우 크기 설정
		setSize (300,100);		// 가로 세로 픽셀
	
		// JButton 추가
		getContentPane().add(new JButton("Ok"),
				BorderLayout.SOUTH);
	
		// 윈도우 종료 버튼을 클릭하면 프로세스 종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); 	// 프로세스 종료
		}
	});
}

	public static void main(String[] args) {
		// 윈도우 생성
		App app = new App();
	
		// 윈도우를 보여줌
		app.setVisible(true); // 창 활성화 (true-보여지기, false- 안보이게하기)
	}
}

