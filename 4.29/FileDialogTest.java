import java.awt.*;
public class  FileDialogTest extends Frame
{
	public FileDialogTest(String title){
		super(title);
		FileDialog fd=new FileDialog(this,"FileDialog");
		setSize(300,200);
		setVisible(true);
		fd.setVisible(true);
	}
}
