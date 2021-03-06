import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;


public class TreeDemo  
{
	JTree tree;
	public TreeDemo()
	{
		JFrame jf=new JFrame();
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("ROOT");
		DefaultMutableTreeNode parent=new DefaultMutableTreeNode("PARENT");
		DefaultMutableTreeNode child2=new DefaultMutableTreeNode("CHILD2");
		DefaultMutableTreeNode child1=new DefaultMutableTreeNode("CHILD1");

		parent.add(child1);
		parent.add(child2);
		root.add(parent);
		tree=new JTree(root);
		JScrollPane sp=new JScrollPane(tree);

		DefaultTreeCellRenderer renderer=new DefaultTreeCellRenderer();
		tree.setCellRenderer(renderer);
		tree.setEditable(true);

		tree.addTreeSelectionListener(new TreeSelectionListener(){
			public void valueChanged(TreeSelectionEvent e){
				DefaultMutableTreeNode node=(DefaultMutableTreeNode)(e.getPath().getLastPathComponent());
				Object nodeObj=node.getUserObject();
				System.out.println("Path= "+e.getPath());
				System.out.println("Object= "+nodeObj);

			}
		});

		jf.getContentPane().add(sp,"Center");
		jf.setSize(300,200);
		jf.setVisible(true);


	}
}
