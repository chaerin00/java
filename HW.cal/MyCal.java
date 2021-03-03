import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyCal implements ActionListener
{
	JFrame jf;
	JTabbedPane tp;
	JLabel odiya,cart;
	JPanel cartlist,list;
	JButton charge;
	JButton[] buttons;
	
	public MyCal() 
	{
		Color back=new Color(68,114,196);
		ImageIcon logo=new ImageIcon("odiya.png");
		odiya=new JLabel(logo);
		odiya.setBorder(BorderFactory.createEmptyBorder(20,20,10,10));//상단의 로고 넣기

		cartlist=new JPanel();
		cartlist.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
		cartlist.setBackground(new Color(255,0,0,0));//panel 배경을 투명하게
		cartlist.setLayout(new BorderLayout());

		ImageIcon cartimg=new ImageIcon("cart.png");
		cart=new JLabel(cartimg);//카트 이미지

		list=new JPanel(new GridLayout(4,2));
		list.setOpaque(true);
		list.setBackground(Color.white);
		list.setPreferredSize(new Dimension(300,200));//메뉴 선택 list

		ImageIcon chargeimg=new ImageIcon("charge.png");
		charge=new JButton(chargeimg);
		charge.setBorderPainted(false);
		charge.setBackground(back);
		charge.setFocusPainted(false);
		charge.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("charge");
			}

		});//charge버튼

		cartlist.add(cart,"North");
		cartlist.add(list,"Center");
		cartlist.add(charge,"South");//동쪽의 요소들 배치


		jf=new JFrame();
		jf.getContentPane().setBackground(back);
		tp=new JTabbedPane();
		int[] prices={0};
		buttons=new JButton[23];
		JPanel coffee=new JPanel(new GridLayout(3,4));
		for(int i=0;i<11;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(this);
			coffee.add(buttons[i]);
		}
		JPanel ade=new JPanel(new GridLayout(3,4));
		for(int i=11;i<18;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(this);
			ade.add(buttons[i]);
		}

		JPanel desert=new JPanel(new GridLayout(3,4));
		for(int i=18;i<23;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(this);
			desert.add(buttons[i]);
		}

		coffee.setBackground(Color.white);
		ade.setBackground(Color.white);
		desert.setBackground(Color.white);

		tp.addTab("COFFEE",coffee);
		tp.addTab("ADE & JUICE",ade);
		tp.addTab("DESERT",desert);

		jf.getContentPane().add(odiya,BorderLayout.NORTH);
		jf.getContentPane().add(tp,BorderLayout.CENTER);
		jf.getContentPane().add(cartlist,BorderLayout.EAST);

		jf.setSize(1000,800);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);






	}
	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();
		for(int i=0;i<23;i++){
			if(o==buttons[i]){
				JLabel img=new JLabel(new ImageIcon("b"+i+".png"));
				list.add(img);
				cartlist.add(list,"Center");
				jf.getContentPane().add(cartlist,BorderLayout.EAST);

				System.out.println("add");
			}
		}
	}
}
