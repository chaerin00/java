import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class JTest implements ActionListener{
	JPanel panel;
	JLabel imglabel,label;
	JButton button;
	boolean current=false;


	public JTest(String msg){
		JFrame jf=new JFrame(msg);
		jf.setSize(1000,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel=new JPanel();
		label=new JLabel("�̹����� ������ �Ʒ���ư Ŭ��");
		imglabel=new JLabel();
		button=new JButton("Image Lable");
		ImageIcon icon=new ImageIcon("NULL");
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(imglabel);
		panel.add(label);
		panel.add(button);
		jf.add(panel);

		
		jf.setVisible(true);

		 

	}
	public void actionPerformed(ActionEvent e){
		if(current){
			imglabel.setIcon(null);
			label.setText("�̹����� ������ Ŭ��");
			current=false;
		}else{
		ImageIcon snow=new ImageIcon("snow.png");
		imglabel.setIcon(snow);
		label.setText("�����·� ����");
		current=true;
		}
	}
}