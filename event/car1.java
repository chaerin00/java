import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

class car1 extends JPanel
{
	BufferedImage img=null;
	int x=1,y=1;
	public car1(){
		try{
			img=ImageIO.read(new File("car.png"));
		}catch(IOException e){
			System.out.println("no image");
			System.exit(1);
		}
		addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e){
				int code=e.getKeyCode();
				switch (code)
				{
				case KeyEvent.VK_UP:y-=10;break;
				case KeyEvent.VK_DOWN:y+=10;break;
				case KeyEvent.VK_LEFT:x-=10;break;
				case KeyEvent.VK_RIGHT:x+=10;break;
				
				}
				repaint();


			}
			public void keyReleased(KeyEvent arg0){}
			public void keyTyped(KeyEvent arg0){}
		});
		this.requestFocus();
		setFocusable(true);

	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img,x,y,null);
	}
}

