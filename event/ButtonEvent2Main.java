import javax.swing.*;

class ButtonEvent2Main
{
	JFrame f;

	public ButtonEvent2Main(){
		f=new JFrame();
		f.add(new ButtonEvent2());
		f.setSize(300,500);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ButtonEvent2Main();
	}
}
