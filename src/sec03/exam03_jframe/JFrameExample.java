package sec03.exam03_jframe;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


public class JFrameExample extends JFrame {
	
	public JFrameExample() {
		
		// JWindow의 크기  : 프레임의 크기 : 전체 크기
		this.setSize(600,500);
		
		// 제목 표시줄 항목 지정 : 아이콘 , 제목 변경
		this.setIconImage(new ImageIcon(getClass().getResource("icon.png"))
				.getImage());
		this.setTitle("메인창");

		// 종료 버튼의 기본 기능 : 프로세스 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		// JWindow를 화면 중앙으로 띄우기
		// 사용 해상도 환경을 가져오기
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		// 화면 중앙 지점 값 가져오기
		Point centerPoint = ge.getCenterPoint();
		// 창을 화면 중앙 표시 하기 위한 시작점 계산
		int leftTopX = centerPoint.x - this.getWidth()/2 ;
		int leftTopY = centerPoint.y - this.getHeight()/2 ;
		this.setLocation(leftTopX, leftTopY);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () { 
			public void run() {
				JFrameExample jFrame = new JFrameExample();
				jFrame.setVisible(true);
			}
		});
	}
}
