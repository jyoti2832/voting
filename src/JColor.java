import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class JColor extends JFrame implements ActionListener {
	JComboBox cb;
	public JColor() {
		setTitle("JColor");
		setSize(800,800);
		setLayout(null);
		cb=new JComboBox();
		cb.addItem("RED");
		cb.addItem("GREEN");
		cb.addItem("BLUE");
		cb.setBounds(200,140,100,30);
		add(cb);
		cb.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		JColor obj=new JColor();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(cb.getSelectedIndex()==0)
			getContentPane().setBackground(Color.RED);
		if(cb.getSelectedIndex()==1)
			getContentPane().setBackground(Color.GREEN);
		if(cb.getSelectedIndex()==2)
			getContentPane().setBackground(Color.BLUE);
	}
	
		
	
	
	
}