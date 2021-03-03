import javax.swing.JFrame;

class CHeckBoxMain
{
	public static void main(String[] args){
		JFrame frame=new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CheckBox panel=new CheckBox();

		panel.setOpaque(true);

		frame.add(panel);
		frame.setSize(500,200);
		frame.setVisible(true);
	}


}