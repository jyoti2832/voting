import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;



public class Myframe5 extends JFrame {
	JTree jt;
	DefaultMutableTreeNode a,b,d,e,f,g,h;
public Myframe5()
	
	{
	setTitle("Tree");
	setSize(800,800);
	a=new DefaultMutableTreeNode("INDIA");
	b=new DefaultMutableTreeNode("UP");
	e=new DefaultMutableTreeNode("Noida");
	f=new DefaultMutableTreeNode("Delhi");
	b.add(e);
	b.add(f);
	d=new DefaultMutableTreeNode("MP");
	g=new DefaultMutableTreeNode("BHOPAL");
	h=new DefaultMutableTreeNode("INDORE");
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
		Myframe5 obj=new Myframe5();
	}

}
