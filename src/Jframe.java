import javax.swing.*;

public class Jframe extends JFrame {
		JMenuBar mb;
		JMenu f,e,ff;
		JMenuItem m1,m2,m3,m4,m5,m6,m7,m8;
		public Jframe()
		{
			setTitle("Myfram");
			setSize(800,800);
			setLayout(null);
			mb=new JMenuBar();
			f=new JMenu("File");
			m1=new JMenuItem("New");
			m2=new JMenuItem("Open");
			m3=new JMenuItem("Save");
			m4=new JMenuItem("Exit");
			f.add(m1);
			f.addSeparator();
			f.add(m2);
			f.addSeparator();
			f.add(m3);
			f.addSeparator();
			f.add(m4);
			f.addSeparator();
			mb.add(f);
			e=new JMenu("Edit");
			m5=new JMenuItem("Cut");
			m6=new JMenuItem("Copy");
			m7=new JMenuItem("Paste");
			m8=new JMenuItem("Exit");
			e.add(m5);
			e.addSeparator();
			e.add(m6);
			e.addSeparator();
			e.add(m7);
			e.addSeparator();
			e.add(m8);
			e.addSeparator();
			mb.add(e);
			setJMenuBar(mb);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
			
			
			

			
			
			
			
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jframe obj=new Jframe();
		
	}
}
	
			
				
	


