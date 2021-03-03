import java.awt.*;
import java.awt.event.*;
public class PopupDemo implements MouseListener 
{
	Canvas canvas;
	PopupMenu popup;

	PopupDemo(){
		Frame f=new Frame("PopupDemo");
		canvas=new Canvas();
		canvas.setSize(200,100);
		canvas.setBackground(Color.yellow);
		canvas.addMouseListener(this);

		popup=new PopupMenu("POP-UP");
		popup.add(new MenuItem("copy"));
		popup.add(new MenuItem("paste"));
		Menu col=new Menu("color");
		col.add(new MenuItem("WHITE"));
		col.add(new MenuItem("BLUE"));
		popup.add(col);
		canvas.add(popup);

		f.add("South",canvas);
		f.setSize(300,200);
		f.setVisible(true);
		
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}

	public void mousePressed(MouseEvent e){
		popup.show(canvas,e.getX(),e.getY());
	}

}
