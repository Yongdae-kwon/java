package sec08.exam01_jlist;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListExample extends JFrame {
	
	private JPanel pWest;
	private JList listString;
	private JList listImage;
	private JLabel jLabel;
	
	// 메인 윈도우설정
	public JListExample () {
		this.setTitle("JListExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250, 200);
		this.getContentPane().setBackground(Color.WHITE);
		this.getContentPane().add(getPWest(), BorderLayout.WEST);
		this.getContentPane().add(getJLabel(), BorderLayout.CENTER);		
	}
	
	// 좌측 목록 JPanel 생성
	public JPanel getPWest () {
		if (pWest == null) {
			pWest = new JPanel();
			pWest.setLayout(new GridLayout(2, 1));
			pWest.add(new JScrollPane(getListString()));	// 문자 리스트 추가
			pWest.add(new JScrollPane(getListImage()));		// 이미지 리스트 추가
		} return pWest;
	}
	
	// 텍스트 목록을 갖는 JList 생성
	public JList getListString () {
		if (listString == null) {
			String[] items = {
					"Cantaloupe" , "Grapefuit" , "Grapes" , "Kiwi" , "Peach",
					"pineaplle" , "strawberry" , "tomato" , "watermelon"
			};
			listString = new JList(items);
			listString.addListSelectionListener(new ListSelectionListener () {
				public void valueChanged(ListSelectionEvent e) {
					if (!e.getValueIsAdjusting()) {		// Adjusting = false일때 동작 
						// 선택한 항목의 인덱스 가져오기
						int selectedIndex = listString.getSelectedIndex();	
						// 인덱스 값에 1을 더해서 선택한 항목의 이미지 선택 (fruit + 인덱스 + jpg)
						ImageIcon image = new ImageIcon(
								getClass().getResource("fruit" + (selectedIndex + 1) + ".jpg"));
						// JLabel 에 이미지 출력
						getJLabel().setIcon(image);
					}
				}
			});
		} return listString;
	}
	
	// 이미지 목록을 갖는 JList 생성
	public JList getListImage() {
		if (listImage == null) {
			Vector items = new Vector();
			for (int i =1 ; i < 10 ; i++) {
				ImageIcon image = new ImageIcon (
						getClass().getResource("fruit" + i + ".jpg"));
				items.addElement(image);
			}
			listImage = new JList (items);
			listImage.addListSelectionListener (new ListSelectionListener() {
				public void valueChanged (ListSelectionEvent e) {
					if (!e.getValueIsAdjusting ()) {
						ImageIcon image = (ImageIcon) listImage.getSelectedValue();
						getJLabel().setIcon(image);
					}
				}
			});
		} return listImage;
	}
	
	// 이미지를 보여주는 JLabel ,  선택된 항목의 이미지를 보여주는
	public JLabel getJLabel () {
		if (jLabel == null) {
			jLabel = new JLabel();
			jLabel.setHorizontalAlignment(JLabel.CENTER);
		} return jLabel;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater (new Runnable () {
			public void run() {
				JListExample jFrame = new JListExample();
				jFrame.setVisible(true);
			}
		});		
	}
}
