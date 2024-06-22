import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class event12 extends Applet implements MouseMotionListener,MouseListener{
	Image ic;
	int x,y;
	public void init()
	{
		ic=getImage(getCodeBase(),"1000060293.jpg");
		x=200;
		y=200;
		addMouseMotionListener(this);
		addMouseListener(this);
		
	}
	public void paint(Graphics g)
	{
		g.drawImage(ic,x,y,500,500,this);
		g.drawString("x and y are"+x+"      "+y, 50, 50);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x=e.getX();
		y=e.getY();
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ic=getImage(getCodeBase(),"1000060293.jpg");
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
