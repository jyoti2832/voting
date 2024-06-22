import java.applet.Applet;
import java.awt.*;

public class AppletOne extends Applet {
	public void init()
	{
		
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello Applet",200,100);
		g.drawLine(50, 150, 350, 200);
		g.drawLine(50, 150, 350, 150);
		g.drawLine(50, 150, 50, 200);
		g.drawRect(150,320,100,100);
		g.drawOval(350,320,150,100);
	}

}
