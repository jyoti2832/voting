import javax.swing.*;
import java.awt.*;

public class Login1 extends JFrame {
	JLabel name,pass1;
	JTextField name1;
	JPasswordField pass;
	JButton login,close;
	public Login1()
	{
		setTitle("Login");
		setSize(800,800);
		setLayout(null);
		name=new JLabel("Name");
		name.setBounds(30,70,150,40);
		add(name);
		name1=new JTextField();
		name1.setBounds(450,70,100,40);
		add(name1);
		pass1=new JLabel("Password");
		pass1.setBounds(30,120,150,40);
		add(pass1);
		pass=new JPasswordField();
		pass.setBounds(450,120,100,40);
		add(pass);
		login=new JButton("Login");
		login.setBounds(200,200,100,40);
		add(login);
		close=new JButton("Close");
		close.setBounds(400,200,200,40);
		add(close);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login1 obj=new Login1();
	}

}
