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
		MenuArray=new String[]{"�ڹ�Ĩ����Ǫġ��","�Ƹ޸�ī��","ī���ī","�ó����","ī���","ī��Ḷ���ƶ�","����ũ",
		"�����","�����ĸ���","���̽�����","������","�������ֽ�","�����ֽ�","�����ֽ�","Ʈ����Į���̵�","�ٹ��ĸ���",
		"����Ƽ","�����̵�","���̽�ũ��","Ƽ��̼�","��������ũ","��ī��","����"};
		mySelect="������ �޴�: "+"\n";
		selects=new int[50];
		Color back=new Color(68,114,196);
		ImageIcon logo=new ImageIcon("odiya.png");
		odiya=new JLabel(logo);
		odiya.setBorder(BorderFactory.createEmptyBorder(20,20,10,10));//����� �ΰ� �ֱ�

		cartlist=new JPanel();
		cartlist.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
		cartlist.setBackground(new Color(255,0,0,0));//panel ����� �����ϰ�
		cartlist.setLayout(new BorderLayout());

	
		list=new MyPanel();
		list.setBackground(Color.white);
		//�޴� ���� list
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

		});//charge��ư


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
				mySelect="������ �޴�: \n";
				for(int i=0;i<index+1;i++){
					int j=selects[i];
					mySelect=mySelect+MenuArray[j]+",";
				}
				list.repaint();
			}

		});//cancel ��ư

		cartlist.add(cancel,"North");
		cartlist.add(scroll,"Center");
		cartlist.add(charge,"South");//������ ��ҵ� ��ġ


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
 