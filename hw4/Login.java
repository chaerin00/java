import java.awt.*;
public class Login extends Frame
{
	TextField t1,t2;
	Label press,login,pw;
	Button ok;
	Panel p1,p2,p3;

	public Login(String msg){
		super(msg);
		setLayout(new BorderLayout(20,100));

		t1=new TextField(30);
		t2=new TextField(30);
		login=new Label("login");
		pw=new Label("password");
		t2.setEchoChar('*');
		press=new Label("press");
		ok=new Button("ok");
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();


		p1.add(login);
		p1.add(t1);
		p2.add(pw);
		p2.add(t2);
		p3.add(press);
		p3.add(ok);
		add("North",p1);
		add("Center",p2);
		add("South",p3);

		setSize(500,400);
		setVisible(true);
	}
}
