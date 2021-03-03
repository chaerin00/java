import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

public class BasicPaint extends JFrame implements ActionListener
{
	JPanel p;
	JButton b1=new JButton("����");
	JButton b2=new JButton("����");
	JButton b3=new JButton("����");
	JButton b4=new JButton("�ſ쳪��");
	GradientPaint color=new GradientPaint(0,0,Color.WHITE,0,100,Color.WHITE);
	JPanel c=new Panel3(color);


	public BasicPaint(){
		//b1=new JButton("����");
		b1.addActionListener(this);
		//b2=new JButton("����");
		b2.addActionListener(this);
		//b3=new JButton("����");
		b3.addActionListener(this);
		//b4=new JButton("�ſ쳪��");
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
			System.out.println("����");}

		else if(o==b2){
			color=new GradientPaint(0,0,Color.WHITE,0,100,Color.green);
			System.out.println("����");}
		else if(o==b3){
			System.out.println("����");
			color=new GradientPaint(0,0,Color.WHITE,0,100,Color.orange);}
		else if(o==b4){
			color=new GradientPaint(0,0,Color.WHITE,0,100,Color.red);
			System.out.println("����");
		}
		c.repaint();


	}


}