import javax.swing.*;

class DrawEventMain 
{
	JFrame f;

	public DrawEventMain(String msg){
		f=new JFrame(msg);
		f.setSize(800,900);
		f.add(new DrawEvent());
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new DrawEventMain("마우스 이벤트");
	}
}