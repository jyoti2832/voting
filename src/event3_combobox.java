import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class event3_combobox extends JFrame implements ItemListener {
	JComboBox cb;
	public event3_combobox() {
		setTitle("COMBOBOX");
		setSize(800,800);
		
		setLayout(null);
		cb=new JComboBox();
		cb.addItem("RED");
		cb.addItem("GREEN");
		cb.addItem("BLUE");
		cb.setBounds(200,140,100,30);
		add(cb);
		
		cb.addItemListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		event3_combobox obj=new event3_combobox();
		
		
		
		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(cb.getSelectedIndex()==0)
			getContentPane().setBackground(Color.RED);
		if(cb.getSelectedIndex()==1)
			getContentPane().setBackground(Color.GREEN);
		if(cb.getSelectedIndex()==2)
			getContentPane().setBackground(Color.BLUE);
	}
}