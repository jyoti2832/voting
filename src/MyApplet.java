import java.applet.Applet;
import java.awt.*;
public class MyApplet extends Applet {
	public void init()
	{
		
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome Here", 250, 100);
		setBackground(Color.RED);
		setForeground(Color.GREEN);
	}
}
