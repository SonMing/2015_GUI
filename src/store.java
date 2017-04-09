import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

// ���� �޴� Ŭ���� ����
public class store extends JFrame {
	
	//���Ǵ� �г� 5������ ����
	private static int purchase = 0;
	WelcomePanel wPanel = new WelcomePanel();
	RamenPanel raPanel = new RamenPanel();
	SidePanel siPanel = new SidePanel();
	DrinkPanel drPanel = new DrinkPanel();
	Button button = new Button();
	
	// �޴� ������ ����
	public store() {
		setBounds(300,200,300,200);
		setSize(300, 200);
		setTitle("���� �ֹ�");
		
		//BourderLayout�� �����Ͽ� ��,��,��,��,�߾� ��ġ�� ��ġ
		add(wPanel, BorderLayout.NORTH);
		add(raPanel, BorderLayout.WEST);
		add(siPanel, BorderLayout.CENTER);
		add(drPanel, BorderLayout.EAST);
		add(button, BorderLayout.SOUTH);
		//��ưư �������� �߻��ϴ� �̺�Ʈ
		myActionListener m = new myActionListener();
		button.ok.addActionListener(m);
		button.cancel.addActionListener(m);

		setVisible(true);
	} 
	// WelcomPanel Ŭ���� ����
	class WelcomePanel extends JPanel {
		private JLabel message; //������ �̸� �󺧺κ�
		public WelcomePanel() {
			message = new JLabel("������ PC�� �����Դϴ�.");
			add(message);	//������ �̸��� ���
		}
	} 
	// RamenPanel Ŭ���� ����
	class RamenPanel extends JPanel {
		private JCheckBox sin, jjapa, buldack; //��� ���� üũ�ڽ��� ����
		public RamenPanel() {
			setLayout(new GridLayout(3, 1));	//��� ���� üũ�ڽ��� ��ġ
			sin = new JCheckBox("�Ŷ��");
			jjapa = new JCheckBox("¥�İ�Ƽ");
			buldack = new JCheckBox("�Ҵߺ���");
			
			setBorder(BorderFactory.createTitledBorder("���")); //��� �ڳ��ΰ��� ������
			add(sin);
			add(jjapa);
			add(buldack);
		}
	} // SidePanel ����
	class SidePanel extends JPanel {
		private JCheckBox shortdari, bulbuck, Honeybutter, mandu; //���̵� �޴� üũ�ڽ��� ����
		public SidePanel() {
			setLayout(new GridLayout(4, 1));	//���̵� �޴� üũ�ڽ��� ��ġ
			shortdari = new JCheckBox("���ٸ�");
			bulbuck = new JCheckBox("�ҹ�");
			Honeybutter = new JCheckBox("��Ϲ���Ĩ");
			mandu = new JCheckBox("�õ�����");
			
			setBorder(BorderFactory.createTitledBorder("���̵� �޴�"));	//���̵� �޴� �ڳ��ΰ��� ������
			add(shortdari);
			add(bulbuck);
			add(Honeybutter);
			add(mandu);
		}
	} // DrinkPanel ����
	class DrinkPanel extends JPanel {
		private JCheckBox coke, saida, fanta;	//����� �޴� üũ�ڽ��� ����
		public DrinkPanel() {
			setLayout(new GridLayout(3, 1));	//����� �޴� üũ�ڽ��� ��ġ
			coke = new JCheckBox("�ݶ�");
			saida = new JCheckBox("���̴�");
			fanta = new JCheckBox("ȯŸ");

			setBorder(BorderFactory.createTitledBorder("�����")); //����� �ڳ��ΰ��� ������
			add(coke);
			add(saida);
			add(fanta);
		}
	} // Button Ŭ���� ����
	class Button extends JPanel {
		private JButton ok, cancel;	//�ֹ��� ���Ǵ� ok, cancel ��ư�� ����
		private JLabel message;
		public Button() {
			setLayout(new FlowLayout(FlowLayout.CENTER));	// �ϳ��� �ٿ� �ΰ��� ��ư�� ����� �迭
			ok = new JButton("�ֹ�");		//�ֹ���ư ����
			cancel = new JButton("���");	//��ҹ�ư ����
			message = new JLabel(Integer.toString(purchase) + "��");	//�ֹ��� �޴��� �ݾ��� ���
			
			
			add(ok);
			add(cancel);
			add(message);
		}
	} // �̺�Ʈ �޼ҵ� ����
	public class myActionListener implements ActionListener {	
		public myActionListener() {
		}
		//�ֹ���ư�� Ŭ�������� �߻��ϴ� �̺�Ʈ�� ����
		public void actionPerformed(ActionEvent e) {
			
			
			if(e.getSource() == button.ok) {			//�ֹ� ��ư�� �������� ����
				if(raPanel.sin.isSelected()) {			//��� �ֹ� �����
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
				if(siPanel.shortdari.isSelected()) {	//���̵� �޴� �ֹ� �����
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
				if(drPanel.coke.isSelected()) {			//����� �ֹ� �����
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
			} else if(e.getSource() == button.cancel) {	//��ҹ�ư�� �������� â�� ������ ����
				purchase = 0;
				setResult();
				setVisible(false);
				}
			
		}
	} // �ֹ� �ݾ� ��� TextField ������
	public void setResult() {
		button.message.setText(Integer.toString(purchase) + "��");	//�ֹ��� �޴��� �ݾ��� ���
	} 
	
}