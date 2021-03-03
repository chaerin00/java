import javax.swing.*;
public class SnowMan 
{
	SnowMan(){
		JFrame f=new JFrame("2020");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new SnowManPanel()); 
		f.setSize(300,200);
		f.setVisible(true);

	}

}
