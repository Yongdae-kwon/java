package sec06.exam03_jradiobutton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class JRadioButtonExample extends JFrame {
	
	private JPanel radioPanel;		 // 라디오 패널
	private JRadioButton rbBird;	// 새 선택 라디오 버튼
	private JRadioButton rbCat;		// 고양이 선택 라디오 버튼
	private JRadioButton rbduke1;		// 
	private JRadioButton rbduke2;		// 
	private JLabel lblPicture;		// 그림 표시 레이블

	// 메인 윈도우 설정
	public JRadioButtonExample () {
		setTitle("JRadioButtonExample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getRadioPanel(), BorderLayout.SOUTH);
		this.getContentPane().add(getLblPicture(), BorderLayout.CENTER);
		pack();
	}
	
	// JRadioButton이 배치된 JPanel 생성
	public JPanel getRadioPanel() {
		if (radioPanel == null) {
			radioPanel = new JPanel();
			radioPanel.setLayout(new GridLayout(1,4));
			radioPanel.add(getRbBird());
			radioPanel.add(getRbCat());
			radioPanel.add(getRbduke1());
			radioPanel.add(getRbduke2());
			
			// 배타적 선택을 위해 ButtonGroup에 두 개의 JRadioButton 추가
			// 라디오 버튼 그룹 묶기
			ButtonGroup group = new ButtonGroup();
			group.add(getRbBird());
			group.add(getRbCat());
			group.add(getRbduke1());
			group.add(getRbduke2());
		} return radioPanel;
	}
	
	// JRadioButton 생성
	public JRadioButton getRbBird () {
		if (rbBird == null) {
			rbBird = new JRadioButton();
			rbBird.setText("Bird");			
			rbBird.setSelected(true); // 초기 기동시에 선택 : 기본 선택   기본적으로 선택되도록 설정			
			rbBird.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().
							getResource("Bird.gif")));
					System.out.println("첫번째 버튼을 선택 했습니다.");
				}				
			});
		} return rbBird;
	}
	
	// JRadioButton 생성
	public JRadioButton getRbCat() {
		if (rbCat == null) {
			rbCat = new JRadioButton();
			rbCat.setText("Cat");
			rbCat.addActionListener(new ActionListener() { 
				public void actionPerformed (ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().
							getResource("Cat.gif")));
					System.out.println("두번째 버튼을 선택 했습니다.");
				}
			});
		} return rbCat;
	}
	// JRadioButton 생성
		public JRadioButton getRbduke1() {
			if (rbduke1 == null) {
				rbduke1 = new JRadioButton();
				rbduke1.setText("Duke1");
				rbduke1.addActionListener(new ActionListener() { 
					public void actionPerformed (ActionEvent e) {
						getLblPicture().setIcon(new ImageIcon(getClass().
								getResource("Duke1.gif")));
						System.out.println("세번째 버튼을 선택 했습니다.");
					}
				});
			} return rbduke1;
		}
		
		// JRadioButton 생성
		public JRadioButton getRbduke2() {
			if (rbduke2 == null) {
				rbduke2 = new JRadioButton();
				rbduke2.setText("Duke2");
				rbduke2.addActionListener(new ActionListener() { 
					public void actionPerformed (ActionEvent e) {
						getLblPicture().setIcon(new ImageIcon(getClass().
								getResource("Duke2.gif")));
						System.out.println("네번째 버튼을 선택 했습니다.");
					}
				});
			} return rbduke2;
		}	
	
	// 이미지를 보여줄  JLabel 생성
	public JLabel getLblPicture() {
		if (lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("Bird.gif")));
		} return lblPicture;
	}	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run () {
				JRadioButtonExample jFrame = new JRadioButtonExample();
				jFrame.setVisible(true);
			}
		});
	}
}
