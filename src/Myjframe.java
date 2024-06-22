import javax.swing.*;

public class Myjframe extends JFrame {
	JLabel a,b,d,h,e,f,g,k;
	JTextField c;
	JPasswordField pf;
	JComboBox cb;
	JSpinner sp;
	JRadioButton rm,rf;
	ButtonGroup bg;
	JCheckBox cr,cm;
	JSlider js;
	JButton btn;
	public Myjframe()
	
	{
		setTitle("Myjframe");
		setSize(800,800);
		setLayout(null);
		a=new JLabel("Regi");
		a.setBounds(350,20,200,50);
		add(a);
		b=new JLabel("Name");
		b.setBounds(30,70,150,40);
		add(b);
		c=new JTextField();
		c.setBounds(450,70,100,40);
		add(c);
		d=new JLabel("Password");
		d.setBounds(30,120,150,40);
		add(d);
		pf=new JPasswordField();
		pf.setBounds(450,120,100,40);
		add(pf);
		h=new JLabel("City");
		h.setBounds(30,170,150,40);
		add(h);
		cb=new JComboBox();
		cb.addItem("Delhi");
		cb.addItem("Agra");
		cb.addItem("Jaipur");
		cb.addItem("Pune");
		cb.setBounds(450,170,100,40);
		add(cb);
		e=new JLabel("Age");
		e.setBounds(30,220,150,40);
		add(e);
		sp=new JSpinner();
		sp.setBounds(450,220,100,40);
		add(sp);
		f=new JLabel("Sex");
		f.setBounds(30,270,150,40);
		add(f);
		bg=new ButtonGroup();
		rm=new JRadioButton("MAle");
		rf=new JRadioButton("FEMALE");
		rm.setBounds(450,270,100,40);
		rf.setBounds(600,270,100,40);
		bg.add(rm);
		bg.add(rf);
		add(rm);
		add(rf);
		g=new JLabel("Hobbies");
		g.setBounds(30,320,100,40);
		add(g);
		cr=new JCheckBox("Music");
		cm=new JCheckBox("Read");
		cr.setBounds(450,320,100,40);
		add(cr);
		cm.setBounds(560,320,100,40);
		add(cm);
		k=new JLabel("Score");
		k.setBounds(30,370,100,40);
		add(k);
		js=new JSlider();
		js.setBounds(450,370,150,40);
		add(js);
		btn=new JButton("Save");
		btn.setBounds(200,450,100,40);
		add(btn);
		
		
		
		
		
				
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe3 obj=new Myframe3();
	}

}
