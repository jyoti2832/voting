import javax.swing.*;

public class event8 extends JFrame {
	JLabel b,e;
	JTextField d;
	JPasswordField f;
	JButton btn,btn1;
	public event8()
	{
		setTitle("Login Screen");
		setSize(700,700);
		setLayout(null);
		b=new JLabel("Name");
		b.setBounds(70,60,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(350,60,100,30);
		add(d);
		e=new JLabel("Password");
		e.setBounds(70,120,200,30);
		add(e);
		f=new JPasswordField();
		f.setBounds(350,120,100,30);
		add(f);
		btn=new JButton("Ok");
		btn.setBounds(100,350,100,30);
		add(btn);
		btn1=new JButton("Cancel");
		btn1.setBounds(300,350,100,30);
		add(btn1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		event8 obj=new event8();
	}

}

