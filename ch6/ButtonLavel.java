import java.awt.*;
class ButtonLabel 
{
	Button ok;
	Label label;

	public ButtonLabel(){
		Frame f=new Frame("Buttonlabel without Frame");
		f.setLayout(new FlowLayout());

		ok=new Button("OK");
		label=new Label("���� ���Դϴ�.");

		f.add(ok);
		f.add(label);
		f.setSize(400,500);
		f.setVisible(true);
	}
}
