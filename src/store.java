import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

// 매점 메뉴 클래스 정의
public class store extends JFrame {
	
	//사용되는 패널 5가지를 정의
	private static int purchase = 0;
	WelcomePanel wPanel = new WelcomePanel();
	RamenPanel raPanel = new RamenPanel();
	SidePanel siPanel = new SidePanel();
	DrinkPanel drPanel = new DrinkPanel();
	Button button = new Button();
	
	// 메뉴 생성자 정의
	public store() {
		setBounds(300,200,300,200);
		setSize(300, 200);
		setTitle("매점 주문");
		
		//BourderLayout을 설정하여 상,하,좌,우,중앙 위치로 배치
		add(wPanel, BorderLayout.NORTH);
		add(raPanel, BorderLayout.WEST);
		add(siPanel, BorderLayout.CENTER);
		add(drPanel, BorderLayout.EAST);
		add(button, BorderLayout.SOUTH);
		//버튼튼 눌렀을시 발생하는 이벤트
		myActionListener m = new myActionListener();
		button.ok.addActionListener(m);
		button.cancel.addActionListener(m);

		setVisible(true);
	} 
	// WelcomPanel 클래스 정의
	class WelcomePanel extends JPanel {
		private JLabel message; //매점의 이름 라벨부분
		public WelcomePanel() {
			message = new JLabel("오렌지 PC방 매점입니다.");
			add(message);	//매점의 이름이 출력
		}
	} 
	// RamenPanel 클래스 정의
	class RamenPanel extends JPanel {
		private JCheckBox sin, jjapa, buldack; //라면 선택 체크박스를 선언
		public RamenPanel() {
			setLayout(new GridLayout(3, 1));	//라면 선택 체크박스를 배치
			sin = new JCheckBox("신라면");
			jjapa = new JCheckBox("짜파게티");
			buldack = new JCheckBox("불닭볶음");
			
			setBorder(BorderFactory.createTitledBorder("라면")); //라면 코너인것을 보여줌
			add(sin);
			add(jjapa);
			add(buldack);
		}
	} // SidePanel 정의
	class SidePanel extends JPanel {
		private JCheckBox shortdari, bulbuck, Honeybutter, mandu; //사이드 메뉴 체크박스를 선언
		public SidePanel() {
			setLayout(new GridLayout(4, 1));	//사이드 메뉴 체크박스를 배치
			shortdari = new JCheckBox("숏다리");
			bulbuck = new JCheckBox("불벅");
			Honeybutter = new JCheckBox("허니버터칩");
			mandu = new JCheckBox("냉동만두");
			
			setBorder(BorderFactory.createTitledBorder("사이드 메뉴"));	//사이드 메뉴 코너인것을 보여줌
			add(shortdari);
			add(bulbuck);
			add(Honeybutter);
			add(mandu);
		}
	} // DrinkPanel 정의
	class DrinkPanel extends JPanel {
		private JCheckBox coke, saida, fanta;	//음료수 메뉴 체크박스를 선언
		public DrinkPanel() {
			setLayout(new GridLayout(3, 1));	//음요수 메뉴 체크박스를 배치
			coke = new JCheckBox("콜라");
			saida = new JCheckBox("사이다");
			fanta = new JCheckBox("환타");

			setBorder(BorderFactory.createTitledBorder("음료수")); //음료수 코너인것을 보여줌
			add(coke);
			add(saida);
			add(fanta);
		}
	} // Button 클래스 정의
	class Button extends JPanel {
		private JButton ok, cancel;	//주문에 사용되는 ok, cancel 버튼을 선언
		private JLabel message;
		public Button() {
			setLayout(new FlowLayout(FlowLayout.CENTER));	// 하나의 줄에 두개의 버튼을 가운데에 배열
			ok = new JButton("주문");		//주문버튼 선언
			cancel = new JButton("취소");	//취소버튼 선언
			message = new JLabel(Integer.toString(purchase) + "원");	//주문한 메뉴의 금액을 출력
			
			
			add(ok);
			add(cancel);
			add(message);
		}
	} // 이벤트 메소드 정의
	public class myActionListener implements ActionListener {	
		public myActionListener() {
		}
		//주문버튼을 클릭했을때 발생하는 이벤트를 선언
		public void actionPerformed(ActionEvent e) {
			
			
			if(e.getSource() == button.ok) {			//주문 버튼을 눌렀을때 실행
				if(raPanel.sin.isSelected()) {			//라면 주문 내용들
					purchase += 3000;
					setResult();
				}
				if(raPanel.jjapa.isSelected()) {
					purchase += 3000;
					setResult();
				}
				if(raPanel.buldack.isSelected()) {
					purchase += 3000;
					setResult();
				}
				if(siPanel.shortdari.isSelected()) {	//사이드 메뉴 주문 내용들
					purchase += 1300;
					setResult();
				}
				if(siPanel.bulbuck.isSelected()) {
					purchase += 2000;
					setResult();
				}
				if(siPanel.Honeybutter.isSelected()) {
					purchase += 2500;
					setResult();
				}
				if(siPanel.mandu.isSelected()) {
					purchase += 3000;
					setResult();
				}
				if(drPanel.coke.isSelected()) {			//음료수 주문 내용들
					purchase += 1500;
					setResult();
				}
				if(drPanel.saida.isSelected()) {
					purchase += 1500;
					setResult();
				}
				if(drPanel.fanta.isSelected()) {
					purchase += 1500;
					setResult();
				}
			} else if(e.getSource() == button.cancel) {	//취소버튼을 눌렀을때 창이 닫히게 설정
				purchase = 0;
				setResult();
				setVisible(false);
				}
			
		}
	} // 주문 금액 출력 TextField 설정자
	public void setResult() {
		button.message.setText(Integer.toString(purchase) + "원");	//주문한 메뉴의 금액을 출력
	} 
	
}