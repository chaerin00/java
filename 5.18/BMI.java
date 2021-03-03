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
		jf=new JFrame("BMI계산기");
		title=new JLabel("비만도 계산");
		ImageIcon logo=new ImageIcon("health.png");
		JLabel health1=new JLabel(logo);
		
		JLabel health2=new JLabel(logo);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("맑은고딕",Font.BOLD,15));
		JPanel toptop=new JPanel(new BorderLayout());
		toptop.add(health1,"West");
		toptop.add(title,"Center");
		toptop.add(health2,"East");
		toptop.setBorder(BorderFactory.createEmptyBorder(25,80,25,80));
		toptop.setBackground(new Color(181,252,146));
		result=new JLabel("결과가 출력됩니다");
		result.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setFont(new Font("맑은고딕",Font.BOLD,15));
		JPanel result_p=new JPanel();
		result_p.add(result);
		result_p.setBackground(Color.WHITE);
		top=new JPanel(new BorderLayout());
		top.add(toptop,"North");
		top.add(result_p,"Center");

		h=new JLabel("신장[cm]");
		h.setFont(new Font("맑은고딕",Font.PLAIN,12));
		height=new JTextField(20);
		w=new JLabel("체중[kg]");
		w.setFont(new Font("맑은고딕",Font.PLAIN,12));
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

		cal=new JButton("계산하기");
		cal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double cm=Double.parseDouble(height.getText());
				double kg=Double.parseDouble(weight.getText());

				double degree=kg/(cm*cm*0.0001);
				String bmi="";
				if(degree>=20&&degree<25){
					bmi="BMI지수: "+degree+"  -> 정상입니다.";
				}else if(degree>=25&&degree<30){
					bmi="BMI지수: "+degree+"  -> 1도비만 입니다.";
				}else if(degree>=30&&degree<40){
					bmi="BMI지수: "+degree+"  -> 2도비만 입니다.";
				}else if(degree>=40){
					bmi="BMI지수: "+degree+"  -> 고도비만 입니다.";
				}else{
					bmi="BMI지수: "+degree+"  -> 저체중 입니다.";
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
