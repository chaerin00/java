import java.awt.*;
import javax.swing.*;


public class TableDemo 
{
	public TableDemo(){
		JFrame jf=new JFrame();

		String columnName[]={
			"�̸�","��ȭ��ȣ","EMAil"};
		String data[][]={
			{"������","010-0000-0000","000@naver.com"},
				{"��ä��","010-0000-0001","001@naver.com"},
				{"�Ӽ���","010-0000-0002","002@naver.com"},
		};
		
		JTable table=new JTable(data,columnName);
		JScrollPane sp=new JScrollPane(table);
		jf.getContentPane().add(sp,BorderLayout.CENTER);

		jf.setSize(400,400);
		jf.setVisible(true);
	}
}