import javax.swing.*;
public class Stroke1 
{
	Stroke1(){
		JFrame f=new JFrame("2020");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new StrokePanel()); 
		f.setSize(300,200);
		f.setVisible(true);

	}

}