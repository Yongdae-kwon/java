package sec09.exam04_eventhandling;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;

public class JTableExample1 extends JFrame {
	
	private JTable jTable;
	private JPanel pSouth;
	private JTextField txtName;
	private JTextField txtAge;
	private Object[][] rowData;
	
	// 메인 윈도우 설정
	public JTableExample1 () {
		this.setTitle("JTableExample1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJTable()),
				BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
		this.setSize(200 , 230);
	}
	
	// JTable 생성
	public JTable getJTable() {
		if(jTable == null) {
			String [] columnNames = new String[] { "이름" , "나이" };
			rowData = new Object[][] {
				{"춘삼월" , 25},
				{"하여름" , 23},
				{"추가을" , 22},
				{"동겨울" , 27}
			};
			jTable = new JTable (rowData, columnNames);
			
			// MouseEvent 처리
			jTable.addMouseListener (new MouseAdapter() {	// 테이블에 마우스리스너로 처리
				public void mouseClicked (MouseEvent e) {	// 마우스 클릭 이벤트
					int rowIndex = jTable.getSelectedRow ();	// 클릭한 행이 몇번째인가
					int columnIndex = jTable.getSelectedColumn ();
					if (rowIndex != -1 && columnIndex != -1) {		// 정상적인 선택이 되었다면
						
						// 클릭된 행의 셀값읽기
						TableModel tableModel = jTable.getModel();
						if(columnIndex == 0 ) {
							String name = (String) tableModel.getValueAt(rowIndex, columnIndex);
							getTxtName().setText(name);
						} else {
							Integer age = (Integer) tableModel.getValueAt(rowIndex, columnIndex);
							getTxtName().setText(String.valueOf(age.intValue()));
						}						
						
						
					}
				}
			});		
		} return jTable;
	}
	
	// 하단에 위치할 JPanel 생성
	public JPanel getPSouth() {
		if (pSouth == null) {
			pSouth = new JPanel();
			pSouth.setLayout(new GridLayout(4 , 2));
			pSouth.add (new JLabel("[선택한 행 정보]"));
			pSouth.add (new JLabel(""));
			pSouth.add (new JLabel("결과" , JLabel.CENTER));
			System.out.println();
			pSouth.add (getTxtName()); 	 // 네임 필드	
			
			// 4행은 공백으로 아래쪽과 붙지 않게 패딩		
			
		}
		return pSouth;
	}
	
	public JTextField getTxtName() {
		if (txtName == null) {
			txtName = new JTextField();
		}
		return txtName;
	}
	
	public JTextField getTxtAge() {
		if (txtAge == null) {
			txtAge = new JTextField();
		}
		return txtAge;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater (new Runnable () {
			public void run() {
				JTableExample1 jFrame = new JTableExample1();
				jFrame.setVisible(true);
			}			
		});
	}
}
