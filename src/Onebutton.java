import javax.swing.*;
import java.awt.event.*;
public class Onebutton extends JFrame implements ActionListener {

	JButton btn;
	public Onebutton() {
		setSize(800,800);
		setLayout(null);
		btn=new JButton("Button");
		btn.setBounds(200,200,100,100);
		add(btn);
		btn.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		Onebutton obj=new Onebutton();
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stubX
		JOptionPane.showMessageDialog(this,"Welcome to Jyoti here");
	}
}