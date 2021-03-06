import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

public class BasicPaint extends JFrame implements ActionListener
{
	JPanel p;
	JButton b1=new JButton("좋음");
	JButton b2=new JButton("보통");
	JButton b3=new JButton("나쁨");
	JButton b4=new JButton("매우나쁨");
	GradientPaint color=new GradientPaint(0,0,Color.WHITE,0,100,Color.WHITE);
	JPanel c=new Panel3(color);


	public BasicPaint(){
		//b1=new JButton("좋음");
		b1.addActionListener(this);
		//b2=new JButton("보통");
		b2.addActionListener(this);
		//b3=new JButton("나쁨");
		b3.addActionListener(this);
		//b4=new JButton("매우나쁨");
		b4.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p=new JPanel(new GridLayout(2,3));
		p.add(new Panel6());
		p.add(new Panel1()); 
		p.add(new Panel2());
		p.add(new Panel5());
		p.add(new Panel4(b1,b2,b3,b4));
		p.add(c);
		add(p);
		setSize(1500,1000);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();
		if(o==b1){
			color=new GradientPaint(0,0,Color.WHITE,0,100,Color.blue);
			System.out.println("누름");}

		else if(o==b2){
			color=new GradientPaint(0,0,Color.WHITE,0,100,Color.green);
			System.out.println("누름");}
		else if(o==b3){
			System.out.println("누름");
			color=new GradientPaint(0,0,Color.WHITE,0,100,Color.orange);}
		else if(o==b4){
			color=new GradientPaint(0,0,Color.WHITE,0,100,Color.red);
			System.out.println("누름");
		}
		c.repaint();


	}


}
