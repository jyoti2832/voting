import java.applet.Applet;
import java.awt.Graphics;

public class Ap6 extends Applet implements Runnable {
	Thread t;
	int x=100;
	int y=100;
	public void init()
	{
		t=new Thread(this);
		t.start();
	}
	public void paint(Graphics g) {
		
	g.drawString("jyoti",x,y);	
	}
	public void run()
	{
		try
		{
			while(x<900)
			{
				
			
			Thread.sleep(1000);
			x=x+10;
			repaint();
		}
	}
		catch(Exception e)
		{
			
		}
	}
	
}
