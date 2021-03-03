import java.awt.event.*;
import javax.swing.*;

class MenuTest implements ActionListener 
{
	JMenuBar bar;
	JMenu file,style;
	JMenuItem fileNew;
	JCheckBoxMenuItem num;
	JRadioButtonMenuItem dos,unix;
	JFrame jf;

	public MenuTest(){
		jf=new JFrame();
		makeMenu();
		makeBody();

		jf.setSize(400,400);
		jf.setVisible(true);

	}
	protected void makeMenu(){
		bar=new JMenuBar();
		file=new JMenu("File");
		file.setMnemonic('F');
		fileNew=new JMenuItem("New");
		fileNew.addActionListener(this);
		file.add(fileNew);
		file.addSeparator();

		num=new JCheckBoxMenuItem("Line Number");
		num.addActionListener(this);
		style=new JMenu("Style");
		file.add(num);
		file.add(style);

		dos=new JRadioButtonMenuItem("DOS Style",true);
		dos.addActionListener(this);
		unix=new JRadioButtonMenuItem("DOS Style",true);
		unix.addActionListener(this);
		ButtonGroup bg=new ButtonGroup();
		bg.add(dos);
		bg.add(unix);

		bar.add(file);
		jf.setJMenuBar(bar);


	}
	protected void makeBody(){
		
	}
	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();
		if(o==fileNew){
			System.out.println("New");
		}else if(o==num){
			System.out.println("Line Number");
		}else if(o==dos){
			System.out.println("DOS");
		}
		else if(o==unix){
			System.out.println("Line UNIX");
		}
	}
}
