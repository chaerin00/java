import java.awt.*;
public class BorderTest
{
	public BorderTest(){
		Frame f=new Frame("BorderTest");
		f.setLayout(new BorderLayout(5,5));
		f.add("North",new Button("N"));
		f.add("Center",new Button("c"));
		f.add("South",new Button("s"));
		f.add("West",new Button("W"));
		f.add("East",new Button("E"));

		f.setSize(300,200);
		f.setVisible(true);
	}
}  
