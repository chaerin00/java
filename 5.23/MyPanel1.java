import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

class  MyPanel1 extends JPanel
{
	ArrayList<Shape> shapeArray=new ArrayList<Shape>();
	public MyPanel1(){
		Shape s;

		s=new Arc2D.Float(10,10,300,300,0,114,Arc2D.CHORE);
		shapeArray.add(s);
		s=new Arc2D.Float(10,10,300,300,115,285,Arc2D.CHORE);
		shapeArray.add(s);
		s=new Arc2D.Float(10,10,300,300,286,350,Arc2D.CHORE);
		shapeArray.add(s);
		s=new Arc2D.Float(10,10,300,300,350,360,Arc2D.CHORE);
		shapeArray.add(s);
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(Color.blue);
		g2.fill(new Arc2D.Float(10,10,300,300,0,114,Arc2D.CHORE));
		g2.setPaint(Color.green);
		g2.fill(new Arc2D.Float(10,10,300,300,115,285,Arc2D.CHORE));
		g2.setPaint(Color.blue);
		g2.fill(new Arc2D.Float(10,10,300,300,286,350,Arc2D.CHORE));
		g2.setPaint(Color.blue);
		g2.fill(new Arc2D.Float(10,10,300,300,350,360,Arc2D.CHORE));
	}
}
