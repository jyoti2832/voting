import javax.swing.*;

public class event13 extends JFrame {
	JLabel a,b,c,d,e,f,g;
	JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;
	JButton btn,btn1 ;
	public event13()
	{
		setTitle("Marksheet");
		setSize(700,700);
		setLayout(null);
		a=new JLabel("Name");
		a.setBounds(70,60,200,30);
		add(a);
		jt1=new JTextField();
		jt1.setBounds(350,60,100,30);
		add(jt1);
		b=new JLabel("Sem1");
		b.setBounds(70,100,200,30);
		add(b);
		jt2=new JTextField();
		jt2.setBounds(350,100,100,30);
		add(jt2);
		c=new JLabel("Sem2");
		c.setBounds(70,140,200,30);
		add(c);
		jt3=new JTextField();
		jt3.setBounds(350,140,100,30);
		add(jt3);
		d=new JLabel("Sem3");
		d.setBounds(70,180,200,30);
		add(d);
		jt4=new JTextField();
		jt4.setBounds(350,180,100,30);
		add(jt4);
		e=new JLabel("Sem4");
		e.setBounds(70,220,200,30);
		add(e);
		jt5=new JTextField();
		jt5.setBounds(350,220,100,30);
		add(jt5);
		btn=new JButton("Total");
		btn.setBounds(70,260,100,30);
		add(btn);
		jt6=new JTextField();
		jt6.setBounds(350,260,100,30);
		add(jt6);
		f=new JLabel("Percentage");
		f.setBounds(70,300,200,30);
		add(f);
		jt7=new JTextField();
		jt7.setBounds(350,300,100,30);
		add(jt7);
		g=new JLabel("Division");
		g.setBounds(70,340,200,30);
		add(g);
		jt8=new JTextField();
		jt8.setBounds(350,340,100,30);
		add(jt8);
		btn1=new JButton("Close");
		btn1.setBounds(150,400,100,40);
		add(btn1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		event13 obj=new event13();
	}

}
