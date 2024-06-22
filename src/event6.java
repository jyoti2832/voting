import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class event6 extends JFrame implements KeyListener {
	JLabel a;int x=100,y=250;
	public event6() 
{
	setTitle("KEYLISTENER");
	setSize(800,800);
	setLayout(null);
	a=new JLabel("JyotiKumari");
	a.setBounds(x,y,100,30);
	add(a);
	addKeyListener(this);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		event6 obj=new event6();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==e.VK_UP)
		{
			y=y-10;
			a.setBounds(x,y,100,30);
		}
		if (e.getKeyCode()==e.VK_DOWN)
		{
			y=y+10;
			a.setBounds(x,y,100,30);
		}
		if (e.getKeyCode()==e.VK_LEFT)
		{
			x=x-10;
			a.setBounds(x,y,100,30);
		}
		if (e.getKeyCode()==e.VK_RIGHT)
		{
			x=x+10;
			a.setBounds(x,y,100,30);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
