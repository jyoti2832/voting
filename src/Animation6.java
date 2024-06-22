import java.applet.Applet;
import java.awt.*;
public class Animation6 extends Applet implements Runnable{
	
	int i;
	Thread t;
	
	public void init()
	{
	i=0;
	t=new Thread(this);
	t.start();
	setFont(new Font("Arial",Font.BOLD,30));
	
	}
	public void run()
	{
		try
		{
			while(i<60)
			{
				Thread.sleep(1000);
				repaint();
				i++;
				
				
			}
		}
		catch(Exception e)
		{
			
		}
	}
		public void paint(Graphics g) {
			{
				g.drawString(String.valueOf(i),200,400);
			}
	}
}

