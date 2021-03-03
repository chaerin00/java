import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;

class Panel1 extends JPanel
{
	//ArrayList<Shape> shapeArray=new ArrayList<Shape>();
	public Panel1(){
		Shape s;

		/*s=new Arc2D.Float(10,10,300,300,0,114,Arc2D.PIE);
		shapeArray.add(s);
		s=new Arc2D.Float(10,10,300,300,115,285,Arc2D.PIE);
		shapeArray.add(s);
		s=new Arc2D.Float(10,10,300,300,286,350,Arc2D.PIE);
		shapeArray.add(s);
		s=new Arc2D.Float(10,10,300,300,350,360,Arc2D.PIE);
		shapeArray.add(s);
		s=new Ellipse2D.Float(320,10,10,10);
		shapeArray.add(s);
		s=new Ellipse2D.Float(320,30,10,10);
		shapeArray.add(s);
		s=new Ellipse2D.Float(320,50,10,10);
		shapeArray.add(s);
		s=new Ellipse2D.Float(320,70,10,10);
		shapeArray.add(s);*/
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setFont(new Font("°íµñÃ¼",Font.BOLD,10));

		g2.setPaint(Color.blue);
		g2.fill(new Ellipse2D.Float(320,10,10,10));
		g2.fill(new Arc2D.Float(50,50,300,300,0,114,Arc2D.PIE));
		g2.drawString("ÁÁÀ½(32%)",330,20);

		g2.setPaint(Color.green);
		g2.fill(new Ellipse2D.Float(320,30,10,10));
		g2.fill(new Arc2D.Float(50,50,300,300,115,170,Arc2D.PIE));
		g2.drawString("º¸Åë(47%)",330,40);

		g2.setPaint(Color.orange);
		g2.fill(new Ellipse2D.Float(320,50,10,10));
		g2.fill(new Arc2D.Float(50,50,300,300,286,64,Arc2D.PIE));
		g2.drawString("³ª»Ý(18%)",330,60);

		g2.setPaint(Color.red);
		g2.fill(new Ellipse2D.Float(320,70,10,10));
		g2.fill(new Arc2D.Float(50,50,300,300,350,11,Arc2D.PIE));
		g2.drawString("¸Å¿ì ³ª»Ý(3%)",330,80);
	}
}
