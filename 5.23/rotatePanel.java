import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class  rotatePanel extends JPanel
{
	Rectangle2D.Double rect;

	public rotatePanel(){
		rect=new Rectangle2D.Double(10,10,150,50);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		g2.draw(rect);
		g2.translate(80,30);
		g2.rotate(Math.PI/8.0);
		g2.draw(rect);
		g2.translate(150,150);
		for(int i=0;i<4;i++){
			g2.rotate(Math.PI/2.0);
			g2.drawString("HELLO MORNING",0,0);
		}

	}
}
