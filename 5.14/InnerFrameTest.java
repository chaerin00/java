import java.awt.*;
import javax.swing.*;


public class InnerFrameTest  
{
	JDesktopPane desktop;
	JInternalFrame inframe1,inframe2;
	JButton ok;

	public InnerFrameTest(){
		JFrame jf=new JFrame();
		desktop=new JDesktopPane();
		inframe1=new JInternalFrame("Inner Frame1");

		ok=new JButton("OK");
		inframe1.getContentPane().add(ok,BorderLayout.SOUTH);
		inframe1.setSize(200,200);
		inframe1.setVisible(true);

		inframe2=new JInternalFrame("Inner Frame2");
		JPanel jp=new JPanel();
		ImageIcon logo=new ImageIcon("olaf.png");
		JButton icon=new JButton(logo);
		jp.add(icon);
		inframe2.getContentPane().add(jp,BorderLayout.SOUTH);
		inframe2.setSize(400,500);
		inframe2.setVisible(true);

		desktop.add(inframe1); 
		desktop.add(inframe2);
		jf.getContentPane().add(desktop,BorderLayout.CENTER);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(500,500);
		jf.setVisible(true);
	}
}
