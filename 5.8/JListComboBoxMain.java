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
		JLabel label=new JLabel("대학교 로고",logo,JLabel.RIGHT);
		label.setFont(new Font("굴림체",Font.PLAIN,20));
		one.add(label);

		tabpane.addTab("대학로고",one);
		tabpane.addTab("미정1",two);
		tabpane.addTab("미정2",Three);
		tabpane.addTab("미정3",four);

		jf.getContentPane().add(tabpane,BorderLayout.CENTER);

		jf.setSize(400,400);
		jf.setVisibel(true);


	}
}
