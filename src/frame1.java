import javax.swing.*;
import java.awt.*;
public class frame1 extends Jframe {
	JLabel a,b,e,g,h,j,k,m,r;
	JTextField d;
	JPasswordField f;
	JComboBox cb;
	ButtonGroup bg;
	JRadioButton rm,rf;
	JProgressBar np;
	JList it;
	JSpinner jp;
	JButton btn;
	JSlider js;
	JCheckBox c1,c2;
	public frame1() {
		
		add(g);
		cb=new JComboBox();setTitle("frame");
		setSize(800,800);
		setLayout(null);
		a=new JLabel("Registration");
		a.setFont(new Font("Arial",Font.BOLD,30));
		a.setForeground(Color.GREEN);
		a.setBounds(450,30,400,30);
		add(a);
		b=new JLabel("Name");
		b.setBounds(500,60,200,30);
		add(b);
		d=new JTextField();
		d.setBounds(200,140,100,30);
		add(d);
		e=new JLabel("Password");
		e.setBounds(200,100,200,30);
		add(e);
		f=new JPasswordField();
		f.setBounds(200,100,100,30);
		add(f);
		g=new JLabel("City");
		g.setBounds(50,140,200,30);
		cb.addItem("Noida");
		cb.addItem("Jaipur");
		cb.addItem("Delhi");
		cb.addItem("Pune");
		cb.addItem("Goa");
		cb.addItem("Mumbai");
		add(cb);
		h=new JLabel("Qualification");
		h.setBounds(50,180,200,30);
		add(h);
		String p[]= {"BCA","MCA","BTECH"};
		it=new JList(p);
		it.setBounds(200,180,100,70);
		add(it);
		j=new JLabel("Sex");
		j.setBounds(200,180,100,70);
		add(j);
		bg=new ButtonGroup();
		rm=new JRadioButton("Male");
		rf=new JRadioButton("Female");
		bg.add(rm);
		bg.add(rf);
		rm.setBounds(140,250,100,30);
		rf.setBounds(250,250,100,30);
		add(rm);
		add(rf);
		k=new JLabel("Hobbies");
		k.setBounds(50,250,100,30);
		add(k);
		c1=new JCheckBox("Reading");
		c1.setBounds(140,290,100,30);
		add(c1);
		c2=new JCheckBox("Singing");
		c2.setBounds(250,290,100,30);
		add(c2);
		m=new JLabel("Score");
		m.setBounds(50,330,200,20);
		add(m);
		jp=new JSpinner();
		jp.setBounds(150,330,100,30);
		add(jp);
		m=new JLabel("Marks");
		m.setBounds(50,380,200,30);
		add(m);
		js=new JSlider();
		js.setBounds(150,380,100,30);
		add(js);
		r=new JLabel("Progress");
		r.setBounds(50,420,200,30);
		add(r);
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
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		frame1 obj=new frame1();
		
		
		
		
	}
}