import java.awt.*;
import javax.swing.*;


public class TableDemo 
{
	public TableDemo(){
		JFrame jf=new JFrame();

		String columnName[]={
			"이름","전화번호","EMAil"};
		String data[][]={
			{"윤용익","010-0000-0000","000@naver.com"},
				{"안채린","010-0000-0001","001@naver.com"},
				{"임순범","010-0000-0002","002@naver.com"},
		};
		
		JTable table=new JTable(data,columnName);
		JScrollPane sp=new JScrollPane(table);
		jf.getContentPane().add(sp,BorderLayout.CENTER);

		jf.setSize(400,400);
		jf.setVisible(true);
	}
}
