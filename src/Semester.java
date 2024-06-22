import javax.swing.JFrame;
import javax.swing.*;
public class Semester extends JFrame {
  
	 JLabel j1,j2,j3,j4,j5,j6,j7;
	 JTextField tf,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
     JButton jb,jb1;
	 public Semester() {
		
		 setTitle("Semester");
		 setSize(800,800);
		 setLayout(null);
		 
		 j1=new JLabel("Name :");
		 j1.setBounds(100,50,100,100);
		 add(j1);
		 
		 tf=new JTextField();
		 tf.setBounds(200,95,100,20);
		 add(tf);
		 
		 
		 j2=new JLabel("Semester 1 :");
		 j2.setBounds(100,100,100,100);
		 add(j2);
		 
		 tf1=new JTextField();
		 tf1.setBounds(200,140,100,20);
		 add(tf1);
		 
		 
		 j3=new JLabel("Semester 2 :");
		 j3.setBounds(100,150,100,100);
		 add(j3);
		 
		 tf2=new JTextField();
		 tf2.setBounds(200,190,100,20);
		 add(tf2);
		 
		 
		 
		 j4=new JLabel("Semester 3 :");
		 j4.setBounds(100,200,100,100);
		 add(j4);
		 
		 tf3=new JTextField();
		 tf3.setBounds(200,240,100,20);
		 add(tf3);

		 j5=new JLabel("Semester 4 :");
		 j5.setBounds(100,250,100,100);
		 add(j5);
		 
		 tf4=new JTextField();
		 tf4.setBounds(200,290,100,20);
		 add(tf4);
		 
		 j6=new JLabel("Semester 5 :");
		 j6.setBounds(100,300,100,100);
		 add(j6);
		 
		 tf5=new JTextField();
		 tf5.setBounds(200,340,100,20);
		 add(tf5);
		 
		 j7=new JLabel("Semester 6 :");
		 j7.setBounds(100,350,100,100);
		 add(j7);
		 
		 tf6=new JTextField();
		 tf6.setBounds(200,390,100,20);
		 add(tf6);
		 
		 jb=new JButton("Total");
		 jb.setBounds(100,450,80,20);
		 add(jb);
		 
		 tf7 = new JTextField();
		 tf7.setBounds(200,450,100,20);
		 add(tf7);
		 
		 jb1=new JButton("Per");
		 jb1.setBounds(100,490,80,20);
		 add(jb1);
		 
		 tf8 = new JTextField();
		 tf8.setBounds(200,490,100,20);
		 add(tf8);
		 

		 
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);
		
	}
	
	public static void main(String[] args) {
	 Semester ref=new Semester();

	}

}
