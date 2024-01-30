package sec07.exam02_jtextfield_jpasswordfield;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;	 // 리스너 -> 구현 : 모든것 (하나만 있는거)
import java.awt.event.KeyAdapter; 		 // 아답터 -> 상속 : 하나만 (여러 개 중에서 하나 선택)
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class JTextFieldJPasswordFieldExample extends JFrame {
	
	private JTextField txtId;
	private JPasswordField txtPassword;
	
	public String checkid = "winter";
	public String checkpw = "12345";
	
	// 메인 윈도우 설정
	public JTextFieldJPasswordFieldExample() {
		this.setTitle("JTextField & JPasswordField");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.getContentPane().setLayout(new GridLayout(2, 2));
		this.getContentPane().add(new JLabel ("아이디" , JLabel.CENTER)); 
		// Label 은 값이 잘 변경안되기때문에 다이렉트로 입력
		this.getContentPane().add(getTxtId()); 		// 텍스트 필드
		this.getContentPane().add(new JLabel ("패스워드", JLabel.CENTER)); 
		this.getContentPane().add(getTxtPassword());	// 패스워드 필드
		this.setSize(200, 100);	
	}
	
	// JTextField 생성
	public JTextField getTxtId() {
		if (txtId == null) {
			txtId = new JTextField();	
			txtId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					String id = new String (txtId.getText());					
					if (id.equals(checkid)) {
						System.out.println("id가 일치 합니다.");	
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this, id + "가 일치합니다." );
					} else{  
						System.out.println("id가 일치 하지 않습니다.");	
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this, id + "가 일치 하지 않습니다." );
					}
					
				}		
			});			
			/*txtId.addKeyListener (new KeyAdapter() { 
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode()>= KeyEvent.VK_A && e.getKeyCode() <=
							KeyEvent.VK_Z) { 	// 영문 대문자 범위
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this, "알파벳 이군요.");
					} else {
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this, "알파벳 아니군요.");						
					}
				}
			});*/
		} return txtId;
	}
	
	// JPasswordField 생성
	public JPasswordField getTxtPassword() {
		if (txtPassword == null ) {
			txtPassword = new JPasswordField();
			txtPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String password = new String (txtPassword.getPassword());
					String id = new String (txtId.getText());
					
					if (password.equals(checkpw)&&id.equals(checkid)) {
						System.out.println("id가 일치 합니다.");	
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this,"로그인하였습니다." );
					} else{  
						System.out.println("패스워드가 틀렸습니다");	
						JOptionPane.showMessageDialog(
								JTextFieldJPasswordFieldExample.this, "패스워드가 틀렸습니다" );
					}
					
					/*JOptionPane.showMessageDialog(
							JTextFieldJPasswordFieldExample.this, "입력한 패스워드 : " + password);*/
				}
			});
			
		} return txtPassword;
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				JTextFieldJPasswordFieldExample jFrame = new JTextFieldJPasswordFieldExample();
				jFrame.setVisible(true);
			}
		});
	}
}
