package sec05.exam01_windowadpater;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;		// 버튼
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;		// 제목 표시줄
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import sec05.exam01_windowadpater.ClosableExample1.MyActionListener;
import sec05.exam01_windowadpater.ClosableExample1.MyWindowAdapter;

public class ClosableExample2 extends JFrame {
		private JButton btnClose;
	
		// 메인 윈도우 설정
		public ClosableExample2() {
			this.setTitle("CloseExample");
			this.setSize(300 , 100);
			
			this.setLayout(new FlowLayout());
			this.getContentPane().add(getBtnClose());
			
			// 리스너 추가 WindowListener 추가 	익명 개체로 처리
			this.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		}
		
		// 닫기 버튼 생성
		private JButton getBtnClose() {
			if(btnClose == null) {
				btnClose = new JButton();
				btnClose.setText("닫기");
			
				// 익명 ActionListenr 추가  버튼에는 액션리스너 추가
				btnClose.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
			}
			return btnClose;
		}


	public static void main(String[] args) {
		SwingUtilities.invokeLater (new Runnable() { 
			public void run () {
				ClosableExample2 jFrame = new ClosableExample2();
				jFrame.setVisible(true);
			}
		});
	}
}
