import java.awt.*;
public class GridCal
{
	public GridCal(){
		Frame f=new Frame("GridCal");
		f.setLayout(new BorderLayout());
		Panel p1=new Panel();
		TextField tf=new TextField(60);
		p1.add(tf);

		Panel p2=new Panel();
		p2.setLayout(new GridLayout(5,4));
		p2.add(new Button("c"));
		p2.add(new Button("/"));
		p2.add(new Button("X"));
		p2.add(new Button("DEL"));
		p2.add(new Button("7"));
		p2.add(new Button("8"));
		p2.add(new Button("9"));
		p2.add(new Button("-"));
		p2.add(new Button("4"));
		p2.add(new Button("5"));
		p2.add(new Button("6"));
		p2.add(new Button("+"));
		p2.add(new Button("1"));
		p2.add(new Button("2"));
		p2.add(new Button("3"));
		p2.add(new Button("+/-"));
		p2.add(new Button("."));
		p2.add(new Button("0"));
		p2.add(new Button("()"));
		p2.add(new Button("="));
		
		f.add("North",p1);
		f.add(p2);
		f.setSize(500,400);
		f.setVisible(true);
	}
}
