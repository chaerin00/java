import java.awt.*;
public class ListDemo extends Frame
{
	public ListDemo(){
		super("ddddd");

		setLayout(new FlowLayout());
		List list=new List(3,false);
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		add(list);
		setSize(300,200);
		setVisible(true);
	}
}  
