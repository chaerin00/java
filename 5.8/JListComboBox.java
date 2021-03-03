import java.awt.*;
import javax.swing.*;

public class JListComboBox  
{
	JList fruits;
	JComboBox colors;
	public JListComboBox(){
		JFrame jf=new JFrame("½ºÀ® ¸®½ºÆ®¿Í ÄÞº¸¹Ú½º");
		jf.getContentPane().setLayout(new FlowLayout());

		String items[]={"apple","orange","banana","pear"};
		fruits=new JList(items);
		fruits.setVisibleRowCount(items.length);
		JScrollPane sp=new JScrollPane(fruits);

		colors=new JComboBox();
		colors.addItem("White");
		colors.addItem("blue");
		colors.addItem("green");

		jf.getContentPane().add(sp);
		jf.getContentPane().add(colors);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(500,500);
		jf.setVisible(true);

	}
}
