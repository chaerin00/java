import java.awt.*;
public class ButtonLabelwithf extends Frame
{
	Button ok;
	Label label;

	public ButtonLabelwithf(String msg){
		super(msg);
		//Frame f=new Frame("Buttonlabel without Frame");
		setLayout(new FlowLayout());

		ok=new Button("OK");
		label=new Label("���� ���Դϴ�.");

		add(ok);
		add(label);
		setSize(400,500);
		setVisible(true);//�����ΰ� frame�̱� ������
	}
}
