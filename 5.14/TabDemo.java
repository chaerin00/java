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

		one.setBackground(Color.blue);
		two.setBackground(Color.white);
		three.setBackground(Color.red);
		four.setBackground(Color.yellow);

		ImageIcon logo1=new ImageIcon("snow.png");
		JLabel label1=new JLabel("안녕하세요 눈송이예요",logo1,JLabel.RIGHT);
		label1.setFont(new Font("굴림체",Font.PLAIN,20));
		ImageIcon logo2=new ImageIcon("olaf.png");
		JLabel label2=new JLabel("안녕하세요 올라프예요",logo2,JLabel.LEFT);

		one.add(label1);
		two.add(label2);

		tabpane.addTab("대학로고",one);
		tabpane.addTab("미정1",two);
		tabpane.addTab("미정2",three);
		tabpane.addTab("미정3",four);

		jf.getContentPane().add(tabpane,BorderLayout.CENTER);

		jf.setSize(600,600);
		jf.setVisible(true);


	}
}
