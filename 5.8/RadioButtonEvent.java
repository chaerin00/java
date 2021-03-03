import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class RadioButtonEvent extends JFrame implements ActionListener{

	private JRadioButton small,medium,large;
	private JLabel text;
	private JPanel topPanel,sizePanel,resultPanel;

	public RadioButtonEvent(){
		setTitle("���� ��ư �׽�Ʈ");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		topPanel=new JPanel();
		JLabel label=new JLabel("� ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		topPanel.add(label); 
		add(topPanel,BorderLayout.NORTH);

		sizePanel=new JPanel();
		small=new JRadioButton("Small Size");
		medium=new JRadioButton("Medium Size");
		large=new JRadioButton("LArge Size");
		ButtonGroup size=new ButtonGroup();

		size.add(small);
		size.add(medium);
		size.add(large);

		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);

		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);

		add(sizePanel,BorderLayout.CENTER);

		resultPanel=new JPanel();
		text=new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�");
		text.setForeground(Color.red);

		resultPanel.add(text);
		add(resultPanel,BorderLayout.SOUTH);
		setVisible(true);


	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==small){
			text.setText("Smallũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource()==medium){
			text.setText("Mediumũ�Ⱑ ���õǾ����ϴ�.");
		}
		if(e.getSource()==large){
			text.setText("Largeũ�Ⱑ ���õǾ����ϴ�.");
		}
	}
}