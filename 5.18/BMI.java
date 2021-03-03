import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BMI 
{
	JPanel top,input;
	JButton cal;
	JFrame jf;
	JLabel title,result,h,w;
	JTextField weight,height;
	public BMI(){
		jf=new JFrame("BMI����");
		title=new JLabel("�񸸵� ���");
		ImageIcon logo=new ImageIcon("health.png");
		JLabel health1=new JLabel(logo);
		
		JLabel health2=new JLabel(logo);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("�������",Font.BOLD,15));
		JPanel toptop=new JPanel(new BorderLayout());
		toptop.add(health1,"West");
		toptop.add(title,"Center");
		toptop.add(health2,"East");
		toptop.setBorder(BorderFactory.createEmptyBorder(25,80,25,80));
		toptop.setBackground(new Color(181,252,146));
		result=new JLabel("����� ��µ˴ϴ�");
		result.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setFont(new Font("�������",Font.BOLD,15));
		JPanel result_p=new JPanel();
		result_p.add(result);
		result_p.setBackground(Color.WHITE);
		top=new JPanel(new BorderLayout());
		top.add(toptop,"North");
		top.add(result_p,"Center");

		h=new JLabel("����[cm]");
		h.setFont(new Font("�������",Font.PLAIN,12));
		height=new JTextField(20);
		w=new JLabel("ü��[kg]");
		w.setFont(new Font("�������",Font.PLAIN,12));
		weight=new JTextField(20);
		JPanel hpanel=new JPanel();
		hpanel.add(h);
		hpanel.add(height);
		JPanel wpanel=new JPanel();
		wpanel.add(w);
		wpanel.add(weight);
		input=new JPanel(new GridLayout(2,1));
		input.add(hpanel);
		input.add(wpanel);

		cal=new JButton("����ϱ�");
		cal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double cm=Double.parseDouble(height.getText());
				double kg=Double.parseDouble(weight.getText());

				double degree=kg/(cm*cm*0.0001);
				String bmi="";
				if(degree>=20&&degree<25){
					bmi="BMI����: "+degree+"  -> �����Դϴ�.";
				}else if(degree>=25&&degree<30){
					bmi="BMI����: "+degree+"  -> 1���� �Դϴ�.";
				}else if(degree>=30&&degree<40){
					bmi="BMI����: "+degree+"  -> 2���� �Դϴ�.";
				}else if(degree>=40){
					bmi="BMI����: "+degree+"  -> ���� �Դϴ�.";
				}else{
					bmi="BMI����: "+degree+"  -> ��ü�� �Դϴ�.";
				}
				//String bmi=Double.toString(degree);
				result.setText(bmi);
			}
		});
		cal.setPreferredSize(new Dimension(100,50));
		cal.setForeground(Color.WHITE);
		cal.setBackground(new Color(31,223,90));
		JPanel exe=new JPanel();
		exe.add(cal);



		jf.getContentPane().add(top,"North");
		jf.getContentPane().add(input,"Center");
		jf.getContentPane().add(exe,"South");

		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);



	}
}
