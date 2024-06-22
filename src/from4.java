import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class from4 extends JFrame implements ActionListener {
	
	JButton btn,btn1,btn2;
	public from4()
	{
		setTitle("Form");
		setSize(700,700);
		setLayout(null);
		
		btn=new JButton("insert");
		btn.setBounds(250,380,100,30);
		add(btn);
		btn.addActionListener(this);
		btn1=new JButton("delete");
		btn1.setBounds(250,410,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2=new JButton("find");
		btn2.setBounds(250,440,100,30);
		add(btn2);
		btn2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		from4 obj=new from4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			new from1();
		}
		if(e.getSource()==btn1)
		{
			new from2();
		}
		if(e.getSource()==btn2)
		{
			new from3();
		}
	}

}
