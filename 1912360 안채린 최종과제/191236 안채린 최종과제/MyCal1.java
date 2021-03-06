import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyCal1
{
	JFrame jf;
	JTabbedPane tp;
	JLabel odiya,cart;
	JPanel cartlist;
	MyPanel list;
	JScrollPane scroll;
	JButton charge,cancel;
	JButton[] buttons;
	int i,select;
	int x=0;
	int result=0;
	int index=-1;
	int[] selects;
	String before_name;
	String mySelect;
	String[] MenuArray;
	int[] prices;


	
	public MyCal1()
	{
		prices=new int[]{5000,4000,5000,5000,4500,5000,5500,5500,6000,4500,4500,
			5500,5500,5000,6000,7000,5000,5000,3500,6500,7000,1500,8500};
		MenuArray=new String[]{"자바칩프라푸치노","아메리카노","카페모카","시나몬라떼","카페라떼","카라멜마끼아또","쿠앤크",
		"딸기라떼","초코파르페","아이스초코","녹차라떼","오렌지주스","딸기주스","수박주스","트로피칼에이드","다방파르페",
		"버블티","레몬에이드","아이스크림","티라미수","초코케이크","마카롱","와플"};
		mySelect="선택한 메뉴: "+"\n";
		selects=new int[50];
		Color back=new Color(68,114,196);
		ImageIcon logo=new ImageIcon("odiya.png");
		odiya=new JLabel(logo);
		odiya.setBorder(BorderFactory.createEmptyBorder(20,20,10,10));//상단의 로고 넣기

		cartlist=new JPanel();
		cartlist.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
		cartlist.setBackground(new Color(255,0,0,0));//panel 배경을 투명하게
		cartlist.setLayout(new BorderLayout());

	
		list=new MyPanel();
		list.setBackground(Color.white);
		//메뉴 선택 list
		list.setPreferredSize(new Dimension(250,3000));
		scroll=new JScrollPane(list,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setPreferredSize(new Dimension(250,200));

		ImageIcon chargeimg=new ImageIcon("charge.png");
		charge=new JButton(chargeimg);
		charge.setBorderPainted(false);
		charge.setBackground(back);
		charge.setFocusPainted(false);
		charge.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("total:"+result+"\n");
				MyThread me=new MyThread(result,mySelect);
				me.start();
			}

		});//charge버튼


		ImageIcon cancelimg=new ImageIcon("cart.png");
		cancel=new JButton(cancelimg);
		cancel.setBorderPainted(false);
		cancel.setBackground(back);
		cancel.setFocusPainted(false);
		cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int sub=selects[index];
				System.out.println("sub:"+prices[sub]);
				result=result-prices[sub];
				index--;
				mySelect="선택한 메뉴: \n";
				for(int i=0;i<index+1;i++){
					int j=selects[i];
					mySelect=mySelect+MenuArray[j]+",";
				}
				list.repaint();
			}

		});//cancel 버튼

		cartlist.add(cancel,"North");
		cartlist.add(scroll,"Center");
		cartlist.add(charge,"South");//동쪽의 요소들 배치


		jf=new JFrame();
		jf.getContentPane().setBackground(back);
		tp=new JTabbedPane();
		int[] prices={0};
		buttons=new JButton[23];
		JPanel coffee=new JPanel(new GridLayout(3,4));

		for(i=0;i<11;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(new MyAction());
			coffee.add(buttons[i]);
		}
		JPanel ade=new JPanel(new GridLayout(3,4));
		for(i=11;i<18;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(new MyAction());
			ade.add(buttons[i]);
		}

		JPanel desert=new JPanel(new GridLayout(3,4));
		for(i=18;i<23;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(new MyAction());
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
	
	class MyAction implements ActionListener
	{
		MyAction(){
		}
		public void actionPerformed(ActionEvent e){
			Object o=e.getSource();
			for(int i=0;i<23;i++){
				if(o==buttons[i]){
					index++;
					selects[index]=i;
					list.repaint();
					System.out.println("add:"+prices[i]);
					result=result+prices[i];
					mySelect=mySelect+MenuArray[i]+",";
				}
			}
		}

	}
	
	class MyPanel extends JPanel{
		ImageIcon icons[]=new ImageIcon[50];
		Image img[]=new Image[50];


		public void paintComponent(Graphics g){
			x=0;
			super.paintComponent(g);
			while(x<(index+1)){
				icons[x]=new ImageIcon("b"+selects[x]+".png");
				img[x]=icons[x].getImage();
				g.drawImage(img[x],70,143*x,this);
				x++;

			}
			
		}
	
	}
	
	


}
 
