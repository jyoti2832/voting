import java.applet.Applet;
import java.awt.*;
public class animation3 extends Applet implements Runnable{
	int x;
	Thread t;
	public void init() {
		x=10;
		t=new Thread(this);
		t.start();
		setFont(new Font("Arial",Font.BOLD,x));
	}
	
	public void run() {
		try
		{
			while(x<=50)
			{
				Thread.sleep(1000);
				x=x+2;
				setFont(new Font("Arial",Font.BOLD,x));
				repaint();
			}
		}
		
		catch(Exception ex) {
			
		}
	}
	public void paint(Graphics g) {
	
	g.drawString("Jyoti", 200, 200);
}
}
