package sec04.exam05_cardlayout;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CardLayoutExample extends JFrame {
	
	private JPanel redCard, greenCard, blueCard;
	
	// 메인 윈도우 설정
	public CardLayoutExample () { 
		this.setTitle("CardLayoutExample");
		this.setSize(250, 400);
		this.setResizable(false);		// 크기 조절하지 못하게  , true면 사이즈 조절할 수 있음
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// CardLayout 으로 변경하고 3개의 카드 추가
		
		//JFrame 에 컨텐츠 패널 부분이 카드 레이아웃 변경
		this.getContentPane().setLayout(new CardLayout());
		// 3개의 카드 추가
		this.getContentPane().add("RedCard", getRedCard());
		this.getContentPane().add("GreenCard", getGreenCard());
		this.getContentPane().add("BlureCard", getBlueCard());
	}
		
		// RedCard 에 해당하는 JPnel 생성
		public JPanel getRedCard() {
			if (redCard == null) {
				redCard = new JPanel();
				redCard.setBackground(Color.RED);
			}
			return redCard;
		}
		
		
		// GreenCard 에 해당하는 JPanel 생성
		public JPanel getGreenCard() {
			if (greenCard == null) {
				greenCard = new JPanel();
				greenCard.setBackground(Color.GREEN);
			}
			return greenCard;
		}
		
		// BlueCard 에 해당하는 JPanel 생성
		public JPanel getBlueCard() {
			if (blueCard == null) {
				blueCard = new JPanel();
				blueCard.setBackground(Color.BLUE);
			}
			return blueCard;
		}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {
			public void run() { 
				final CardLayoutExample jFrame = new CardLayoutExample();
				jFrame.setVisible(true);
				
				// 반복 스레드 생성
				Thread thread = new Thread() {
					@Override
					public void run() {
						for (int i=0; i<10;i++) {
							try {
								// 2초간 일시정지
								Thread.sleep(1000);								
							} catch(InterruptedException e) {
								
							}
							// 이벤트 큐에 Runnable 객체 넣기
							SwingUtilities.invokeLater(new Runnable () {
								@Override
								public void run() {
									// CardLayout을 얻어 다음 카드 보여쥐
									CardLayout cardLayout = 
										(CardLayout) jFrame.getContentPane().getLayout();
									cardLayout.next(jFrame.getContentPane());
								}
							});
						}
					}
				};
				
				// 반복 스레드 시작
				 thread.start();
			}			
		});		
	}
}
