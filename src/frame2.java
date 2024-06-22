import javax.swing.*;
import java.awt.*;
public class frame2 extends JFrame {
	JLabel a,b,e,g,h;
	JTextField d;
	JPasswordField f;
	JComboBox cb;
	JList it;
	public frame2() {
		setTitle("Myframe");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("Registration");
		a.setBounds(450,30,400,30);
		add(a);
		b=new JLabel("Name");
		b.setBounds(500,60,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(200,140,100,30);
		add(d);
		e=new JLabel("Password");
		e.setBounds(200,100,200,30);
		add(e);
		f=new JPasswordField();
		f.setBounds(200,100,100,30);
		add(f);
		
		g=new JLabel("City");
		g.setBounds(50,140,200,30);
		add(g);
		cb=new JComboBox();
		cb.addItem("Noida");
		cb.addItem("Jaipur");
		cb.addItem("Delhi");
		cb.addItem("Pune");
		cb.addItem("Goa");
		cb.addItem("Mumbai");
		cb.setBounds(550,140,100,30);
		add(cb);
		h=new JLabel("Qualification");
		h.setBounds(50,180,200,30);
		add(h);
		String p[]= {"BCA","MCA","BTECH"};
		it=new JList(p);
		it.setBounds(200,180,100,70);
		add(it);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame2 obj=new frame2();
	
	}

}

