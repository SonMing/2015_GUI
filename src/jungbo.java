import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class OraPanel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("오렌지 PC방 입니다.", 155, 50);	//PC방의 정보를 보여준다
		g.drawString("  개업 : 2015.12.3", 155, 80);
		g.drawString("   사업자 : 손민석", 155, 115);
		g.setColor(Color.ORANGE);						//Orange 그림을 그림
		g.fillOval(22, 20, 130, 130);					//Orange 그림의 크기 설정
		g.setColor(Color.GRAY);							//Orange 그림의 꼭지
		g.fillOval(70, 40, 20, 10);						//Orange 그림의 꼭지 크키 설정
		
	}
}

class jungbo extends JFrame{
	public jungbo() {
		setBounds(300,200,300,200);						//jungbo의 폼크기와 생성 위치 설정
		setTitle("오렌지 PC방 정보");					//jungbo의 상단바 이름
		OraPanel r = new OraPanel();
		setVisible(true);								//true 값을 주어 jungbo 창이 발생
		add(r);
		  
	}
	
}


