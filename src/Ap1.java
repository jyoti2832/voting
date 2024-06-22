import java.applet.Applet;
import java.awt.*;
public class Ap1 extends Applet {
	public void init()
	{
		
	}
	public void paint(Graphics g) {
		g.drawLine(200,50,400,200);
		g.drawLine(200, 50, 400, 50);
		g.drawRect(200, 200, 300, 200);
		g.drawOval(200,400,200,150);
	}
}
