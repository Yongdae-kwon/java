package sec03.exam04_jtabbedpane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class JTabbedPaneExample extends JFrame{
	
	private JTabbedPane jTabbedPane;
	private JPanel tab1Panel;
	private JPanel tab2Panel;
	
	// 메인 윈도우 설정
	public JTabbedPaneExample() {
		this.setTitle("JTabbedPaneExample");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getJTabbedPane(), BorderLayout.CENTER);
	}
	
	// JTabbedPane 생성 및 Tab추가
	private JTabbedPane getJTabbedPane() {	
		if (jTabbedPane == null) {			  // jTabbedPane 생성이 안되었을때
			jTabbedPane = new JTabbedPane (); // jTabbedPane 객체 생성
			jTabbedPane.setTabPlacement(JTabbedPane.RIGHT); // 탭이 왼쪽에 표시
			jTabbedPane.addTab("탭1", getTab1Panel());	// 탭추가 : 이름 탭1, 사용할 패널 getTab1Pane1
			jTabbedPane.addTab("탭2", getTab2Panel());  // 탭추가 : 이름 탭2, 사용할 패널 getTab2Pane1
		}
		
		return jTabbedPane;
	}
	
	// Tab1 에 추가된 JPanel 생성
	private JPanel getTab1Panel() {
		if(tab1Panel == null) {				// 탭1 패널이 없으면
			tab1Panel = new JPanel();		// 탭1 패널 객체를 생성
			JLabel jLabel = new JLabel();	// 패널에 사용할 Label 추가
			jLabel.setIcon(new ImageIcon(getClass().getResource("duke1.gif")));
			tab1Panel.add(jLabel);
		}
		return tab1Panel;
	}
	
	// Tab2 에 추가된 JPanel 생성
		private JPanel getTab2Panel() {
			if(tab2Panel == null) {				// 탭2 패널이 없으면
				tab2Panel = new JPanel();		// 탭2 패널 객체를 생성
				JLabel jLabel = new JLabel();	// 패널에 사용할 Labe2 추가
				jLabel.setIcon(new ImageIcon(getClass().getResource("duke2.gif")));
				tab2Panel.add(jLabel);
			}
			return tab2Panel;
		}
		

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTabbedPaneExample jFrame = new JTabbedPaneExample();
				jFrame.setVisible(true);
			}
		}); 
	}
}
