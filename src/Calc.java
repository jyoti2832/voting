import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame {
			
		
			JLabel a,b,c;
			JTextField tf,tf1;
			JButton b1,b2,b3,b4;
				public Calc() {
					setTitle("Calculater");
					setSize(800,800);
					setLayout(null);
					c = new JLabel("Claculater");
					c.setBounds(300,20,550,50);
					add(c);
					a = new JLabel("No.1");
					a.setBounds(250,50,150,80);
					add(a);
					b = new JLabel("No.2");
					b.setBounds(250,150,150,80);
					add(b);
					tf= new JTextField();
					tf.setBounds(300,70,80,50);
					add(tf);
				//	add(b);
					tf1= new JTextField();
					tf1.setBounds(300,170,80,50);
					add(tf1);
					b1 = new JButton("+");
					b1.setBounds(200,300,50,40);
					add(b1);
					b2 = new JButton("-");
					b2.setBounds(300,300,50,40);
					add(b2);
					b3 = new JButton("*");
					b3.setBounds(400,300,50,40);
					add(b3);
					b4 = new JButton("/");
					b4.setBounds(500,300,50,40);
					add(b4);
					
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					setVisible(true);
				}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Calc obj = new Calc();
			}

		

	}

