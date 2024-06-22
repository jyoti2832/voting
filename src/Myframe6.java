import javax.swing.*;
import java.awt.event.*;
public class Myframe6 extends JFrame implements ActionListener {
	JButton btn;
	public Myframe6()
	{
		setTitle("frame");
		setSize(800,800);
		btn=new JButton("click");
		btn.setBounds(150,500,100,30);
		add(btn);
		btn.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe6 obj=new Myframe6();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this,"welcome here.");
	}

}
