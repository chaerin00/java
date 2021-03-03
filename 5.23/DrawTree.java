import javax.swing.*;
public class DrawTree
{
	DrawTree(){
		JFrame f=new JFrame("2020");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new DrawTreePanel()); 
		f.setSize(300,200);
		f.setVisible(true);

	}

}
