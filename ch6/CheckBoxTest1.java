import java.awt.*;
class  CheckBoxTest1
{
	CheckBoxTest1(String msg){
		Frame f=new Frame(msg);

		f.setLayout(new FlowLayout());
		Checkbox one=new Checkbox("One");
		Checkbox two=new Checkbox("Two");
		Checkbox three=new Checkbox("Three");
		f.add(one);
		f.add(two);
		f.add(three);
		f.setSize(800,800);
		f.setVisible(true);
	}
}
