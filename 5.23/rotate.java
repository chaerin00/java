import javax.swing.*;
public class rotate 
{
	rotate(){
		JFrame f=new JFrame("2020");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new rotatePanel()); 
		f.setSize(300,200);
		f.setVisible(true);

	}

}