import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OdiyaCal 
{
	JPanel menu;
	JLabel price;
	String total="";
	JButton[] buttons;
	int[] prices;

	public OdiyaCal(){
		menu=new JPanel(new GridLayout(3,4));
		price=new JLabel(total);


		for(int i=0;i<11;i++){
			buttons[i]=new JButton(new ImageIcon("b"+i+".png"));
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(Color.white);
			buttons[i].setFocusPainted(false);
			buttons[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(e.getSource()==buttons[i]){
						total=total+"5000";
						price.setText(total);
					}
				}
			});
			menu.add(buttons[i]);
		}
	}


}
