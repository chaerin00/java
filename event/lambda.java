import javax.swing.*;
import java.awt.event.*;

class lambda extends JFrame 
{
	JButton button;
	JLabel label;

	public lambda(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("2020 이벤트");

		JPanel panel=new JPanel();
		button=new JButton("버튼을 누르세오");
		label=new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(e ->{label.setText("버튼이 눌러졌습니다");});
		panel.add(button);
		panel.add(label);
		add(panel);
		setVisible(true);
	}
	
}
