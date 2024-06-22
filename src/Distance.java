import javax.swing.JFrame;
import javax.swing.*;
public class Distance extends JFrame {
  
	JLabel j1,j2;
	JTextField tf,tf1,tf2;
	JButton jb;
	 public Distance() {
		
		 setTitle("Distance");
		 setSize(800,800);
		 setLayout(null);
		 
		 j1=new JLabel("Distance :");
		 j1.setBounds(100,50,100,100);
		 add(j1);
		  
		 tf=new JTextField();
		 tf.setBounds(200,90,100,20);
		 add(tf);
		 
		 
		 j2=new JLabel("Time :");
		 j2.setBounds(100,140,100,20);
		 add(j2);
		  
		 tf1=new JTextField();
		 tf1.setBounds(200,140,100,20);
		 add(tf1);
		 
         jb=new JButton("Speed");
         jb.setBounds(95,190,70,20);
         add(jb);
         
         tf2=new JTextField();
         tf2.setBounds(200,190,100,20);
         add(tf2);
		 
         
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);
		  
	}
	public static void main(String[] args) {
		Distance ref=new Distance();

	}

}