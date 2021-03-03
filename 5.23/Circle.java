import javax.swing.*;
public class Circle 
{
	Circle(){
		JFrame f=new JFrame("2020");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new GradientPanel()); 
		f.setSize(300,200);
		f.setVisible(true);

	}

}
