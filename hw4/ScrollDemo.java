import java.awt.*;
public class ScrollDemo 
{
	public ScrollDemo(){
		Frame f=new Frame("Scroll Demo");
		f.setLayout(new FlowLayout());

		Scrollbar V=new Scrollbar(Scrollbar.VERTICAL);
		Scrollbar H=new Scrollbar(Scrollbar.HORIZONTAL);
		f.add(V);
		f.add(H);

		f.setSize(300,200);
		f.setVisible(true);
	}
	
}
