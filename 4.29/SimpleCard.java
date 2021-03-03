import java.awt.*;
import java.awt.event.*;
public class SimpleCard extends Frame 
{
	CardLayout card;
	Panel p1,p2,p3,p4,p5;
	Label l1,l2,l3,l4,l5;

	public SimpleCard(){
		super("SimpleCard");
		card=new CardLayout();
		setLayout(card);
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		l1=new Label();
		l2=new Label();
		l3=new Label();
		l4=new Label();
		l5=new Label();
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.green);
		p3.setBackground(Color.magenta);
		p4.setBackground(Color.white);
		p5.setBackground(Color.cyan);
		MouseHandler handler=new MouseHandler();
		p1.add(l1); 
		p1.addMouseListener(handler);
		p2.add(l2); 
		p2.addMouseListener(handler);
		p3.add(l3); 
		p3.addMouseListener(handler);
		p4.add(l4);
		p4.addMouseListener(handler);
		p5.add(l5); 
		p5.addMouseListener(handler);
		add("First",p1); 
		add("Second",p2); 
		add("Third",p3); 
		add("Fourth",p4); 
		add("Fifth",p5);
		card.show(this,"First");
		setSize(300,200);
		setVisible(true);



	}
	public class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			card.next(SimpleCard.this);
		}
	}
	{
	}
}
