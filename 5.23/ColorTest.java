import javax.swing.*;
public class ColorTest 
{
	ColorTest(){
		JFrame f=new JFrame("2020");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new ColorPanel()); 
		f.setSize(300,200);
		f.setVisible(true);

	}

}
