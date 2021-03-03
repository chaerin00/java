import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class  StrokePanel extends JPanel
{
	Ellipse2D.Double circle;
	Rectangle2D.Double rect;

	public StrokePanel(){
		circle=new Ellipse2D.Double(10,10,200,200);
		rect=new Rectangle2D.Double(10,10,200,200);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setStroke(new BasicStroke(2));
		g2.draw(rect);
		float[] dash={30,10,10,10};
		g2.setStroke(new BasicStroke(8,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10,dash,0));
		g2.draw(circle);


	}
}
