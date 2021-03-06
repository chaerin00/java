import java.awt.*;
import java.awt.event.*;
public class SimpleCard2 extends Frame implements ItemListener
{
	CardLayout card;
	Panel body,ps[];
	int selected;
	Choice choice;

	public SimpleCard2(){
		super("SimpleCard");
		body=new Panel();
		body.setLayout(card=new CardLayout());
		MouseHandler handler=new MouseHandler();
		String data[]={"First","Second","Third","Fourth","Fifth"};
		Color colors[]={Color.YELLOW,Color.GREEN,Color.MAGENTA,Color.WHITE,Color.CYAN};
		ps=new Panel[data.length];
		for(int i=0;i<ps.length;i++){
			ps[i]=new Panel();
			ps[i].setBackground(colors[i]);
			ps[i].add(new Label(data[i]+"Panel"));
			ps[i].addMouseListener(handler);
			body.add(String.valueOf(i),ps[i]);
		}

		card.show(body,"0");
		selected=0;
		choice=new Choice();
		choice.addItemListener(this);
		for(int i=0;i<ps.length;i++){
			choice.add(String.valueOf(i+1));
		}
		add(choice,"East");
		add(body,"Center");
		addWindowListener(new WindowHandler());
		setSize(300,200);
		setVisible(true);



	}
	public class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			card.next(body);
			selected=(selected+1)%ps.length;
			choice.select(selected);
		}
	}
	public void itemStateChanged(ItemEvent e){
		Object o=e.getSource();
		if(o==choice){
			int index=choice.getSelectedIndex();
			card.show(body,String.valueOf(index));
			selected=index;
		}
	}
	public class WindowHandler extends WindowAdapter{
		public void WindowClosing(WindowEvent e){
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
	
}
