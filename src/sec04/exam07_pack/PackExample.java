package sec04.exam07_pack;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PackExample extends JFrame {
	
	private JButton btnOk;
	private JButton btnCancel;
	
	// 메인 윈도우 설정
	public PackExample () {
		this.setTitle("PackExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// FlowLayout 으로 변경하고 버튼 추가
		// 프레임의 콘텐츠 패널에 버튼 2개 추가
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnOk());
		this.getContentPane().add(getBtnCancel());
		
		//pack() 메서드 호출
		this.pack();		// 안에 들어가는 컴포넌트 크기에 따라 밖에 컨테이너의 크기가 지정
	}
	// Ok 버튼 생성
	private JButton getBtnOk() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("확인");
		} return btnOk;
	}
	
	// Cancel 버튼 생성
		private JButton getBtnCancel() {
			if(btnCancel == null) {
				btnCancel = new JButton();
				btnCancel.setText("취소");
			} return btnCancel;
		}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run () {
				PackExample jFrame = new PackExample();
				jFrame.setVisible(true);
			}
		});		
	}
}
