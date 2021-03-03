import java.awt.*;
import javax.swing.*;

public class TabDemo
{
	JFrame jf;
	JTabbedPane tabpane;

	public TabDemo(String msg){
		jf=new JFrame(msg);
		tabpane=new JTabbedPane();

		JPanel one=new JPanel();
		JPanel two=new JPanel();
		JPanel three=new JPanel();
		JPanel four=new JPanel();

		one.setBackground(Color.red);
		two.setBackground(Color.green);
		three.setBackground(Color.blue);
		four.setBackground(Color.white);

		ImageIcon logo=new ImageIcon("snow.png");
		JLabel label=new JLabel("���б� �ΰ�",logo,JLabel.RIGHT);
		label.setFont(new Font("����ü",Font.PLAIN,20));
		one.add(label);

		tabpane.addTab("���зΰ�",one);
		tabpane.addTab("����1",two);
		tabpane.addTab("����2",Three);
		tabpane.addTab("����3",four);

		jf.getContentPane().add(tabpane,BorderLayout.CENTER);

		jf.setSize(400,400);
		jf.setVisibel(true);


	}
}