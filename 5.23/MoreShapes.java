import javax.swing.*;
public class MoreShapes 
{
	MoreShapes(){
		JFrame f=new JFrame("2020");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyShapePanel()); 
		f.setSize(300,200);
		f.setVisible(true);

	}

}
