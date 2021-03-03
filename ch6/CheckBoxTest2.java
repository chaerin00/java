import java.awt.*;
class  CheckBoxTest2 extends Frame
{
	CheckBoxTest2(String msg){
		super(msg);

		setLayout(new FlowLayout());
		Checkbox one=new Checkbox("One");
		Checkbox two=new Checkbox("Two");
		Checkbox three=new Checkbox("Three");
		add(one);
		add(two);
		add(three);
		setSize(800,800);
		setVisible(true);
	}
}
