import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class tree1 extends JFrame {
	JTree jt;
	DefaultMutableTreeNode a,b,d,e,f,g,h;
	public tree1() {
		setTitle("tree");
		setSize(800,800);
		a=new DefaultMutableTreeNode("India");
		b=new DefaultMutableTreeNode("Up");
		e=new DefaultMutableTreeNode("Noida");
		f=new DefaultMutableTreeNode("DElhi");
		b.add(e);
		b.add(f);
		d=new DefaultMutableTreeNode("Mp");
		g=new DefaultMutableTreeNode("Bhopal");
		h=new DefaultMutableTreeNode("Indore");
		d.add(g);
		d.add(h);
		a.add(b);
		a.add(d);
		jt=new JTree(a);
		add(jt);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree1 obj=new tree1();
	}

}
