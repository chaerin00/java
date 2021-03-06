import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class DrawEvent extends JPanel 
{
	int x,y,w,h;
	JPanel jp;

	public void DrawEvent(){
		
	}
	void drawPanel(){
		addMouseListener(new MouseListener(){
			public void mousePressed(MouseEvent e){
				x=e.getX();
				y=e.getY();
			}
			public void mouseReleased(MouseEvent e){
				w=Math.abs(x-e.getX());
				h=Math.abs(h-e.getY());
				repaint();
			}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
			public void mouseClicked(MouseEvent e){}
		});
		addMouseMotionListener(new MouseMotionListener(){
			public void mouseDragged(MouseEvent e){
				w=Math.abs(x-e.getX());
				h=Math.abs(h-e.getY());
				repaint();
			}
			public void mouseMoved(MouseEvent e){}
		});
	}
	public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawOval(x,y,w,h);
			drawPanel();
		}
}
