import javax.swing.*;
import java.awt.event.*;

class lambda extends JFrame 
{
	JButton button;
	JLabel label;

	public lambda(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("2020 �̺�Ʈ");

		JPanel panel=new JPanel();
		button=new JButton("��ư�� ��������");
		label=new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(e ->{label.setText("��ư�� ���������ϴ�");});
		panel.add(button);
		panel.add(label);
		add(panel);
		setVisible(true);
	}
	
}
