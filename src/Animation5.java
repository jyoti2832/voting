import java.applet.Applet;
import java.awt.*;
public class Animation5 extends Applet implements Runnable{
	Color c[]= {Color.RED,Color.GREEN,Color.BLUE,Color.PINK,Color.BLACK};
	int i;
	Thread t;
	
	public void init()
	{
	i=0;
	t=new Thread(this);
	t.start();
	}
	public void run()
	{
		try
		{
			while(i<5)
			{
				Thread.sleep(3000);
				repaint();
				if(i==4)
				{
					i=-1;
				}
				i++;
			}
		}
		catch(Exception e)
		{
			
		}
	}
		public void paint(Graphics g) {
			{
				setBackground(c[i]);
			}
	}
}
