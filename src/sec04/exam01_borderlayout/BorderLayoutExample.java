package sec04.exam01_borderlayout;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea; 		// JTextArea 는 여러 줄 입출력할 때
import javax.swing.JTextField;		// JTextField 는 한 줄 입출력할 때
import javax.swing.SwingUtilities;

public class BorderLayoutExample extends JFrame {
	
	private JTextField txtNorth; 	// 북쪽
	private JTextArea txtCenter;	// 가운데
	private JButton btnSouth;		// 남쪽
	
	// 메인 윈도우 설정
	public BorderLayoutExample () {
		this.setTitle("BorderLayoutExample");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 북쪽 , 중앙 , 남쪽에 컴포넌트 배치
		this.getContentPane().add(getTxtNorth() , BorderLayout.EAST);
		this.getContentPane().add(getTxtCenter() , BorderLayout.CENTER);
		this.getContentPane().add(getBtnSouth() , BorderLayout.NORTH);		
	}
	
	// JTextField 생성
	private JTextField getTxtNorth () {
		if (txtNorth == null) {
			txtNorth = new JTextField ();
			txtNorth.setText("북쪽 컴포넌트");
			txtNorth.setBackground(Color.YELLOW);
		}
		return txtNorth;
	}
	
	private JTextArea getTxtCenter() {
		if (txtCenter == null) {
			txtCenter = new JTextArea();
			txtCenter.append("중앙 컴포넌트\n");
			txtCenter.append("동쪽 컴포넌트가 없으니 동쪽으로 확장\n");
			txtCenter.append("서쪽 컴포넌트가 없으니 서쪽으로 확장\n");  // 남쪽과 북쪽은 뭐가 있으니
		}
		return txtCenter;
	}
	
	// JButton 생성
	private JButton getBtnSouth() {
		if (btnSouth == null) {
			btnSouth = new JButton();
			btnSouth.setText("남쪽 컴포넌트");
		}
		return btnSouth;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				BorderLayoutExample jFrame = new BorderLayoutExample();
				jFrame.setVisible(true);
			}
		});	

	}
}
