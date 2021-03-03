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
		JLabel label1=new JLabel("�ȳ��ϼ��� �����̿���",logo1,JLabel.RIGHT);
		label1.setFont(new Font("����ü",Font.PLAIN,20));
		ImageIcon logo2=new ImageIcon("olaf.png");
		JLabel label2=new JLabel("�ȳ��ϼ��� �ö�������",logo2,JLabel.LEFT);

		one.add(label1);
		two.add(label2);

		tabpane.addTab("���зΰ�",one);
		tabpane.addTab("����1",two);
		tabpane.addTab("����2",three);
		tabpane.addTab("����3",four);

		jf.getContentPane().add(tabpane,BorderLayout.CENTER);

		jf.setSize(600,600);
		jf.setVisible(true);


	}
}
