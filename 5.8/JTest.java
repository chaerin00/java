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
		label=new JLabel("이미지를 보려면 아래버튼 클릭");
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
			label.setText("이미지를 보려면 클릭");
			current=false;
		}else{
		ImageIcon snow=new ImageIcon("snow.png");
		imglabel.setIcon(snow);
		label.setText("원상태로 복구");
		current=true;
		}
	}
}
