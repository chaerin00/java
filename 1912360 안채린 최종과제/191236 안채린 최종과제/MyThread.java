import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class MyThread extends Thread{
	int total;
	String select;
	JLabel result;

	public MyThread(int a,String s){
		total=a;
		select=s;
	}
	
	public void run(){
		JFrame jf=new JFrame();
		JPanel center_panel=new JPanel(new BorderLayout());

		JTextArea selectLabel=new JTextArea(select,7,20);
		selectLabel.setFont(new Font("����",Font.BOLD,20));
		selectLabel.setLineWrap(true);
		Border lineBorder=BorderFactory.createLineBorder(Color.black,3);
		Border empty=BorderFactory.createEmptyBorder(7,7,7,7);
		selectLabel.setBorder(BorderFactory.createCompoundBorder(lineBorder,empty));


		result=new JLabel("total: "+total);
		result.setFont(new Font("�������",Font.BOLD,20));
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setPreferredSize(new Dimension(600,250));

		JPanel buttons=new JPanel();
		JButton done=new JButton("�����Ϸ�");
		done.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				result.setText("ã���ּż� �����մϴ�:)");
			}
		});
		center_panel.add(selectLabel,BorderLayout.CENTER);
		center_panel.add(result,BorderLayout.SOUTH);
		JButton cancel=new JButton("�������");
		cancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jf.setVisible(false);
			}
		});
		buttons.add(done);
		buttons.add(cancel);

		jf.getContentPane().add(center_panel,BorderLayout.CENTER);
		jf.getContentPane().add(buttons,BorderLayout.SOUTH);
		jf.setVisible(true);
		jf.setSize(600,600);
	}
}