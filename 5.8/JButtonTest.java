import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class JButtonTest{
	
	JLabel label;
	JButton text,icon;


	public JButtonTest(String msg){
		JFrame jf=new JFrame(msg);
		jf.getContentPane().setBackground(Color.yellow);
		jf.getContentPane().setLayout(new FlowLayout());

		ImageIcon logo=new ImageIcon("snow.png");
		label=new JLabel("���б� �ΰ�",logo,JLabel.RIGHT);
		jf.getContentPane().add(label);

		text=new JButton("2020 button");
		text.setToolTipText("�ؽ�Ʈ ��ư");
		jf.getContentPane().add(text);

		icon=new JButton("�̹��� ��ư",logo);
		jf.getContentPane().add(icon);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1000,500);
		jf.setVisible(true);

		 

	}
}

