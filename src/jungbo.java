import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class OraPanel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("������ PC�� �Դϴ�.", 155, 50);	//PC���� ������ �����ش�
		g.drawString("  ���� : 2015.12.3", 155, 80);
		g.drawString("   ����� : �չμ�", 155, 115);
		g.setColor(Color.ORANGE);						//Orange �׸��� �׸�
		g.fillOval(22, 20, 130, 130);					//Orange �׸��� ũ�� ����
		g.setColor(Color.GRAY);							//Orange �׸��� ����
		g.fillOval(70, 40, 20, 10);						//Orange �׸��� ���� ũŰ ����
		
	}
}

class jungbo extends JFrame{
	public jungbo() {
		setBounds(300,200,300,200);						//jungbo�� ��ũ��� ���� ��ġ ����
		setTitle("������ PC�� ����");					//jungbo�� ��ܹ� �̸�
		OraPanel r = new OraPanel();
		setVisible(true);								//true ���� �־� jungbo â�� �߻�
		add(r);
		  
	}
	
}


