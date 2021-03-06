import javax.swing.*;
import java.awt.*;


class  DrawTreePanel extends JPanel
{
	public DrawTreePanel(){
	}
	private void drawTree(Graphics g,int x1,int y1,double a,int d){
		if(d==0) return;
		int x2=x1+(int)(Math.cos(Math.toRadians(a))*d*10.0);
		int y2=y1+(int)(Math.sin(Math.toRadians(a))*d*10.0);
		g.drawLine(x1,y1,x2,y2);
		drawTree(g,x2,y2,a-20,d-1);
		drawTree(g,x2,y2,a+20,d-1);

	}
	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		drawTree(g,400,600,-90,10);
	}
}
