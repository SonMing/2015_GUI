import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


	
	public class Gimal extends JFrame implements ActionListener{
		JButton[] b = new JButton[30];		//메인 화면에서 사용될 버튼들 배열 선언
		 
		 public Gimal() {
		  setSize(970,600);					//Gimal 메인 화면의크기
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//창을 닫으면 모두 닫힘
		  setTitle("오렌지 PC방");			//Gimal 상단바 이름
		 
		  
		  JPanel panel = new JPanel();				
		  panel.setLayout(null);			//패널의 배치관리자를 제거
		  
		  //pc방 자리 1줄
		  b[0] = new JButton("PC0");			//배열에 JButton을 선언
		  panel.add(b[0]);
		  b[0].addActionListener(this);			//이벤트 발생 선언
		  b[0].setBackground(Color.lightGray);	//panel의 색상을 지정
		  
		  b[1] = new JButton("PC1");
		  panel.add(b[1]);
		  b[1].addActionListener(this);
		  b[1].setBackground(Color.lightGray);
		  
		  b[2] = new JButton("PC2");
		  panel.add(b[2]);
		  b[2].addActionListener(this);
		  b[2].setBackground(Color.lightGray);
		  
		  b[3] = new JButton("PC3");
		  panel.add(b[3]);
		  b[3].addActionListener(this);
		  b[3].setBackground(Color.lightGray);
		  
		  b[4] = new JButton("PC4");
		  panel.add(b[4]);
		  b[4].addActionListener(this);
		  b[4].setBackground(Color.lightGray);
		  
		  b[5] = new JButton("PC5");
		  panel.add(b[5]);
		  b[5].addActionListener(this);
		  b[5].setBackground(Color.lightGray);
		  
		  b[0].setBounds(20, 10, 95, 90);			//배열에 선언한 버튼들을 절대위치로 배치
		  b[1].setBounds(120, 10, 95, 90);
		  b[2].setBounds(220, 10, 95, 90);
		  b[3].setBounds(320, 10, 95, 90);
		  b[4].setBounds(420, 10, 95, 90);
		  b[5].setBounds(520, 10, 95, 90);
		  
		  //pc방 자리 2줄
		   
		  b[6] = new JButton("PC6");
		  panel.add(b[6]);
		  b[6].addActionListener(this);
		  b[6].setBackground(Color.lightGray);
		  
		  b[7] = new JButton("PC7");
		  panel.add(b[7]);
		  b[7].addActionListener(this);
		  b[7].setBackground(Color.lightGray);
		  
		  b[8] = new JButton("PC8");
		  panel.add(b[8]);
		  b[8].addActionListener(this);
		  b[8].setBackground(Color.lightGray);
		  
		  b[9] = new JButton("PC9");
		  panel.add(b[9]);
		  b[9].addActionListener(this);
		  b[9].setBackground(Color.lightGray);
		  
		  b[10] = new JButton("PC10");
		  panel.add(b[10]);
		  b[10].addActionListener(this);
		  b[10].setBackground(Color.lightGray);
		  
		  b[11] = new JButton("PC11");
		  panel.add(b[11]);
		  b[11].addActionListener(this);
		  b[11].setBackground(Color.lightGray);
		  
		  b[6].setBounds(20, 110, 95, 90);
		  b[7].setBounds(120, 110, 95, 90);
		  b[8].setBounds(220, 110, 95, 90);
		  b[9].setBounds(320, 110, 95, 90);
		  b[10].setBounds(420, 110, 95, 90);
		  b[11].setBounds(520, 110, 95, 90);
		  
		  //pc방 자리 3줄
		  
		  b[12] = new JButton("PC12");
		  panel.add(b[12]);
		  b[12].addActionListener(this);
		  b[12].setBackground(Color.lightGray);
		  
		  b[13] = new JButton("PC13");
		  panel.add(b[13]);
		  b[13].addActionListener(this);
		  b[13].setBackground(Color.lightGray);
		  
		  b[14] = new JButton("PC14");
		  panel.add(b[14]);
		  b[14].addActionListener(this);
		  b[14].setBackground(Color.lightGray);
		  
		  b[15] = new JButton("PC15");
		  panel.add(b[15]);
		  b[15].addActionListener(this);
		  b[15].setBackground(Color.lightGray);
		  
		  b[16] = new JButton("PC16");
		  panel.add(b[16]);
		  b[16].addActionListener(this);
		  b[16].setBackground(Color.lightGray);
		  
		  b[17] = new JButton("PC17");
		  panel.add(b[17]);
		  b[17].addActionListener(this);
		  b[17].setBackground(Color.lightGray);
		  
		  b[12].setBounds(20, 210, 95, 90);
		  b[13].setBounds(120, 210, 95, 90);
		  b[14].setBounds(220, 210, 95, 90);
		  b[15].setBounds(320, 210, 95, 90);
		  b[16].setBounds(420, 210, 95, 90);
		  b[17].setBounds(520, 210, 95, 90); 
		  
		 
		  //pc방 로고 이미지
		  b[18] = new JButton("");		
		  panel.add(b[18]);			
		  b[18].setBounds(630, 10, 295, 290);			//절대위치로 배치
		  ImageIcon icon = new ImageIcon("img/orange.png");	//orange 이미지를 불러온다
		  b[18].setIcon(icon);							//배열b[18]의 버튼에 orange 이미지를 넣는다
		  b[18].addActionListener(this);				//이벤트 발생선언
		  
		  //매점 버튼
		  b[19] = new JButton("매점주문");
		  panel.add(b[19]);	
		  b[19].setBounds(30, 375,360, 150 );			//절대위치로 배치
		  Font j = new Font("Dialog", Font.PLAIN,60);	//매점버튼의 글씨 크기 및 글씨체 설정
		  b[19].setFont(j);
		  panel.add(b[19]);
		  b[19].addActionListener(this);				//이벤트 발생선언
		 
		  //중간 나누는 부분
		  JLabel nam = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		  nam.setBounds(30,275,900,100);//절대위치로 배치
		  panel.add(nam);
		  
		  //메인 이름
		  JLabel maname = new JLabel("오렌지 PC방");	//메인화면에 오렌지 PC방 간판
		  Font h = new Font("Dialog", Font.BOLD,85);	//글씨체 및 글자크기
		  maname.setBounds(420,230,560,470);			//절대위치로 배치
		  maname.setFont(h);
		  panel.add(maname);
		  
		  Color color = new Color(0xFFBB00);			//글씨의 색 설정
		  maname.setForeground(color);
		  
		  
		  
		  
		  add(panel);
		  setVisible(true);
		  

		  
		 }
	 
		 
		 // 클릭시 발생하는 이벤트
		 public void actionPerformed(ActionEvent event) {
	         if(event.getSource() == b[18]){
	    
	        	 jungbo b = new jungbo();		//b[18]을 클릭했을때 jungbo.java를 이벤트 실행
	        	 
		        }
	         if(event.getSource() == b[19]){
	        	 
	        	 store m = new store();			//b[19]을 클릭했을때 store.java를 이벤트 실행
	        	 
	         	}
	         if(event.getSource() == b[0]){
	        	 
	        	 book0 z1 = new book0(0);       //b[0]을 클릭했을때 book class의 이벤트 실행 	       	
	        	 
	         	}
	         if(event.getSource() == b[1]){
	        	 
	        	 book1 z1 = new book1(0);
	        	 
	         	}
	         if(event.getSource() == b[2]){
	        	 
	        	 book2 z1 = new book2(0);
	        	 
	         	}
	         if(event.getSource() == b[3]){
	        	 
	        	 book3 z1 = new book3(0);
	        	 
	         	}
	         if(event.getSource() == b[4]){
	        	 
	        	 book4 z1 = new book4(0);
	        	 
	         	}
	         if(event.getSource() == b[5]){
	        	 
	        	 book5 z1 = new book5(0);
	        	 
	         	}
	         if(event.getSource() == b[6]){
	        	 
	        	 book6 z1 = new book6(0);
	        	 
	         	}
	         if(event.getSource() == b[7]){
	        	 
	        	 book7 z1 = new book7(0);
	        	 
	         	}
	         if(event.getSource() == b[8]){
	        	 
	        	 book8 z1 = new book8(0);
	        	 
	         	}
	         if(event.getSource() == b[9]){
	        	 
	        	 book9 z1 = new book9(0);
	        	 
	         	}
	         if(event.getSource() == b[10]){
	        	 
	        	 book10 z1 = new book10(0);
	        	 
	         	}
	         if(event.getSource() == b[11]){
	        	 
	        	 book11 z1 = new book11(0);
	        	 
	         	}
	         if(event.getSource() == b[12]){
	        	 
	        	 book12 z1 = new book12(0);
	        	 
	         	}
	         if(event.getSource() == b[13]){
	        	 
	        	 book13 z1 = new book13(0);
	        	 
	         	}
	         if(event.getSource() == b[14]){
	        	 
	        	 book14 z1 = new book14(0);
	        	 
	         	}
	         if(event.getSource() == b[15]){
	        	 
	        	 book15 z1 = new book15(0);
	        	 
	         	}
	         if(event.getSource() == b[16]){
	        	 
	        	 book16 z1 = new book16(0);
	        	 
	         	}
	         if(event.getSource() == b[17]){
	        	 
	        	 book17 z1 = new book17(0);
	        	 
	         	}
	         
	         
			}
		 
		 class book0 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book0(int z1) {
					setSize(300, 200);				//자리예약 프레임의 크기
					setBounds(300, 200, 300, 200);	//자리예약 프레임의 실행 위치
					setTitle("자리예약");			//자리예약 프레임의 상단바 이름

					JPanel p = new JPanel();
					p.setLayout(null);				//배치 관리자를 제거

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);		//

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);	
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a) {
					JButton jb = (JButton) a.getSource();

					
					if(jb == B1)	//jb == B1
					{				
						if (a.getSource() == B1) {		//B1사용을 눌렀을때		
	
						b[0].setBackground(Color.ORANGE);	//ORANGE 색으로 변경
						setVisible(false);
						}	
					}				
						else if (a.getSource() == B2) {	//B2종료를 눌렀을때

						b[0].setBackground(Color.lightGray);//lightGray 색으로 변경
						setVisible(false);
					}
				
			}
		}
		 class book1 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book1(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a1) {
					JButton jb = (JButton) a1.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a1.getSource() == B1) {				
	
						b[1].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a1.getSource() == B2) {

						b[1].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}

		 class book2 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book2(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a2) {
					JButton jb = (JButton) a2.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a2.getSource() == B1) {				
	
						b[2].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a2.getSource() == B2) {

						b[2].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}
		 class book3 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book3(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a3) {
					JButton jb = (JButton) a3.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a3.getSource() == B1) {				
	
						b[3].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a3.getSource() == B2) {

						b[3].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}
		 class book4 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book4(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a4) {
					JButton jb = (JButton) a4.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a4.getSource() == B1) {				
	
						b[4].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a4.getSource() == B2) {

						b[4].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
		 
		 class book5 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book5(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a5) {
					JButton jb = (JButton) a5.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a5.getSource() == B1) {				
	
						b[5].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a5.getSource() == B2) {

						b[5].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
		 
		 class book6 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book6(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a6) {
					JButton jb = (JButton) a6.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a6.getSource() == B1) {				
	
						b[6].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a6.getSource() == B2) {

						b[6].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
		 class book7 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book7(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a7) {
					JButton jb = (JButton) a7.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a7.getSource() == B1) {				
	
						b[7].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a7.getSource() == B2) {

						b[7].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
		 class book8 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book8(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a8) {
					JButton jb = (JButton) a8.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a8.getSource() == B1) {				
	
						b[8].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a8.getSource() == B2) {

						b[8].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}
		 		 
		 class book9 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book9(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a9) {
					JButton jb = (JButton) a9.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a9.getSource() == B1) {				
	
						b[9].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a9.getSource() == B2) {

						b[9].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 

		 class book10 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book10(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a10) {
					JButton jb = (JButton) a10.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a10.getSource() == B1) {				
	
						b[10].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a10.getSource() == B2) {

						b[10].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 

		 class book11 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book11(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a11) {
					JButton jb = (JButton) a11.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a11.getSource() == B1) {				
	
						b[11].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a11.getSource() == B2) {

						b[11].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 

		 class book12 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book12(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a12) {
					JButton jb = (JButton) a12.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a12.getSource() == B1) {				
	
						b[12].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a12.getSource() == B2) {

						b[12].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
	
		 class book13 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book13(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a13) {
					JButton jb = (JButton) a13.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a13.getSource() == B1) {				
	
						b[13].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a13.getSource() == B2) {

						b[13].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
	
		 class book14 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book14(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a14) {
					JButton jb = (JButton) a14.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a14.getSource() == B1) {				
	
						b[14].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a14.getSource() == B2) {

						b[14].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
	
		 class book15 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book15(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a15) {
					JButton jb = (JButton) a15.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a15.getSource() == B1) {				
	
						b[15].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a15.getSource() == B2) {

						b[15].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
	
		 class book16 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book16(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a16) {
					JButton jb = (JButton) a16.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a16.getSource() == B1) {				
	
						b[16].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a16.getSource() == B2) {

						b[16].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
	
		 class book17 extends JFrame implements ActionListener {
				private JButton B1, B2;
				private JTextField t1;
				public int z1;

				public book17(int z1) {
					setSize(300, 200);
					setBounds(300, 200, 300, 200);
					setTitle("자리예약");

					JPanel p = new JPanel();
					p.setLayout(null);

					B1 = new JButton("사용");
					p.add(B1);
					B1.addActionListener(this);
					B2 = new JButton("종료");
					B2.addActionListener(this);
					p.add(B2);

					JLabel la1 = new JLabel("500원 = 1시간");
					JLabel la2 = new JLabel("3000원 = 8시간");
					JLabel la3 = new JLabel("충전금액");
					t1 = new JTextField(20);

					p.add(la1);
					p.add(la2);
					p.add(la3);
					p.add(t1);

					B1.setBounds(55, 120, 80, 30);
					B2.setBounds(155, 120, 80, 30);
					la1.setBounds(50, 25, 105, 40);
					la2.setBounds(150, 25, 105, 40);
					la3.setBounds(55, 58, 105, 40);
					t1.setBounds(120, 60, 105, 30);

					setVisible(true);
					add(p);
				}

				public void actionPerformed(ActionEvent a17) {
					JButton jb = (JButton) a17.getSource();
					String in = t1.getText();
					
					if(jb == B1)
					{				
						if (a17.getSource() == B1) {				
	
						b[17].setBackground(Color.ORANGE);
						setVisible(false);
						}	
					}				
						else if (a17.getSource() == B2) {

						b[17].setBackground(Color.lightGray);
						setVisible(false);
					}
				
			}
		}		 
			 
	 public static void main(String[] args){
		 
	   new Gimal();
	 	}
	
	}
