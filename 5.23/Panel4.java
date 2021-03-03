import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Panel4 extends JPanel
{
	public Panel4(JButton a,JButton b,JButton c,JButton d){
		setLayout(new GridLayout(2,2));
		this.setSize(new Dimension(300,300));

		this.add(a);
		this.add(b);
		this.add(c);
		this.add(d);
	}
	
}
