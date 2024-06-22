import javax.swing.*;
import java.awt.*;
public class Myfram extends myframe {
	JLabel a,b,e,g,h,j,k,m,n,p
	;
	JTextField d;
	JPasswordField f;
	JComboBox cb;
	JList it;
	ButtonGroup bg;
	JRadioButton rm,rf;
	JCheckBox c1,c2;
	JSpinner jp;
	JSlider js;
	JProgressBar np ;
	JButton btn;
	public Myfram()
	{
		setTitle("Myfram");
		setSize(800,800);
		setLayout(null);
		a=new JLabel("Registration form");
		a.setFont(new Font("Arial",Font.BOLD,30));
		a.setForeground(Color.RED);
		a.setBounds(450,20,400,30);
		add(a);
		b=new JLabel("Name");
		b.setBounds(50,60,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(550,60,100,30);
		add(d);
		e=new JLabel("Password");
		e.setBounds(50,100,200,30);
		add(e);
		f=new JPasswordField();
		f.setBounds(550,100,100,30);
		add(f);
		g=new JLabel("City");
		g.setBounds(50,140,200,30);
		add(g);
		cb=new JComboBox();
		cb.addItem("Noida");
		cb.addItem("Jaipur");
		cb.addItem("Delhi");
		cb.addItem("Pune");
		cb.setBounds(550,140,100,30);
		add(cb);
		h=new JLabel("Qualification");
		h.setBounds(50,180,200,30);
		add(h);
		String P[]= {"BCA","MCA","BTech"};
		it =new JList(P);
		it.setBounds(550,180,100,70);
		add(it);
		j=new JLabel("Sex");
		j.setBounds(50,250,200,30);
		add(j);
		bg=new ButtonGroup();
		rm=new JRadioButton("Male");
		rf=new JRadioButton("Female");
		bg.add(rm);
		bg.add(rf);
		rm.setBounds(500,250,100,30);
		rf.setBounds(600,250,100,30);
		add(rm);
		add(rf);
		k=new JLabel("Hobbies");
		k.setBounds(50,290,200,30);
		add(k);
		c1=new JCheckBox("reading");
		c1.setBounds(550,290,100,30);
		add(c1);
		c2=new JCheckBox("singing");
		c2.setBounds(580,290,200,30);
		add(c2);
		m=new JLabel("Score");
		m.setBounds(50,330,200,30);
		add(m);
		jp=new JSpinner();
		jp.setBounds(150,330,100,30);
		add(jp);
		
		n=new JLabel("Marks");
		n.setBounds(50,370,200,30);
		add(n);
		js=new JSlider();
		js.setBounds(550,330,100,30);
		add(js);
		p=new JLabel("Progress");
		p.setBounds(50,420,200,30);
		add(p);
		np=new JProgressBar();
		np.setBounds(150,420,100,30);
		np.setValue(50);
		add(np);
		btn=new JButton("Save");
		btn.setBounds(150,500,100,30);
		add(btn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myfram obj=new Myfram();
	}

}
