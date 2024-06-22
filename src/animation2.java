import java.applet.Applet;
import java.awt.*;
public class animation2 extends Applet implements Runnable{
	int x,y;
	Thread t; 
	int i=0;
	public void init()
	{
		x=200;
		y=200;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			while(i<=50)
			{
				Thread.sleep(500);
				x=x+10;
				repaint();
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void paint(Graphics g)
	{
		g.drawLine(x, y, x+20, y);
	}
	}
	



