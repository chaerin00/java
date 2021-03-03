import javax.swing.*;
import java.awt.*;
class MyThread extends Thread{
	int total;
	public MyThread(int a){
		total=a;
	}
	
	public void run(){
		JFrame jf=new JFrame();
		JLabel result=new JLabel("total: "+total);
		result.setFont(new Font("¸¼Àº°íµñ",Font.BOLD,20));
		result.setHorizontalAlignment(JLabel.CENTER);

		jf.getContentPane().add(result);
		jf.setVisible(true);
		jf.setSize(300,200);
	}
}