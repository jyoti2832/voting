import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ap4 extends Applet implements KeyListener{
	Image ic;
	AudioClip ac;
	
	public void init(){
		ic=getImage(getCodeBase(),"1000031547.jpg");
		ac=getAudioClip(getCodeBase(),"sample-3s.wav");
		addKeyListener(this);
	}
	public void paint(Graphics g) {
		g.drawImage(ic, 200, 200, 200, 200, this);
		g.drawString("Press A.start s-stop",200,200);
	}
	@Override
	public void keyPressed(KeyEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getKeyChar()=='a'|| ae.getKeyChar()=='A')
			ac.play();
		if(ae.getKeyChar()=='s'|| ae.getKeyChar()=='S')
			ac.stop();
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
			
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
