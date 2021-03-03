import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.script.ScriptException;
import javax.script.*;;


class OdiyaCal1 extends JFrame implements ActionListener
{
	JPanel menu;
	JLabel price;
	String total="total:0";
	JButton[] buttons;
	int[] prices;
	//int[] select;
	String[] ordermenu; 
	int s_index=0;
	JButton order;
	JPanel center;
	int result=0;
	String menulist;
	

	public OdiyaCal1(){

		ImageIcon logo=new ImageIcon("odiya.png");
		JLabel odiya=new JLabel(logo);
		odiya.setBorder(BorderFactory.createEmptyBorder(20,20,10,10));


		menu=new JPanel(new GridLayout(3,3));
		price=new JLabel(total);
		price.setFont(new Font("∏º¿∫∞ÌµÒ",Font.BOLD,20));
		Color c=new Color(68,114,196);
		getContentPane().setBackground(c);
		price.setForeground(Color.WHITE);
		price.setHorizontalAlignment(JLabel.CENTER);

		buttons=new JButton[9];
		ordermenu=new String[50];
		order=new JButton("¡÷πÆ«œ±‚");
		order.setBorderPainted(false);
		order.setBackground(Color.white);
		order.setFocusPainted(false);
		order.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int i=0;i<ordermenu.length;i++){
					menulist=menulist+" "+ordermenu[i];
				}
				total=total+"="+result;
				price.setText(total);
			}
		});


		for(int i=0;i<9;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(this);
			menu.add(buttons[i]);
		}
		center=new JPanel(new BorderLayout());
		center.setBackground(c);
		center.add("North",menu);
		center.add("Center",price);
		add("North",odiya);
		add("Center",center);
		add("South",order);
		
		setSize(1000,1000);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent e){
		int[] prices={5000,4000,5000,5000,4500,5000,5500,5500,5500,4500,4500};
		String[] select={"¿⁄πŸƒ® «¡∂Û«™ƒ°≥Î","æ∆∏ﬁ∏Æƒ´≥Î","ƒ´∆‰∏ƒ´","Ω√≥™∏Û∂Û∂º","ƒ´«™ƒ°≥Î","ƒ´∂Û∏·∏∂≥¢æ∆∂«","ƒÌæÿ≈©Ω¶¿Ã≈©","µ˛±‚Ω¶¿Ã≈©","√ ƒ⁄∆ƒ∏£∆‰","√ ƒ⁄∂Û∂º","≥Ï¬˜∂Û∂º"};

		Object o=e.getSource();
		int index=0;
		for(int i=0;i<buttons.length;i++){
			if(o==buttons[i]){
				index=i;
			}
		}
		System.out.println(index);
		ordermenu[index++]=select[index];
		result=result+prices[index];

		total=total+"+"+prices[index];
		price.setText(total);
	}


}