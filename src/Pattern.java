import java.awt.*;
import java.awt.event.*;
class Pattern implements MouseListener, MouseMotionListener
{
	Frame f;
	Dimension dul,dur,dll,dlr;
	
	public Pattern()
	{
		f = new Frame();
		f.setSize(600,600);
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		Dimension d = f.getSize();
		dul = new Dimension(0,0);
		dur = new Dimension(d.width,0);
		dll = new Dimension(0,d.height);
		dlr = new Dimension(d.width,d.height);
		
		Graphics g = f.getGraphics();
		g.setColor(Color.red);
		g.drawLine(e.getX(),e.getY(),dul.width,dul.height);
		g.setColor(Color.green);
		g.drawLine(e.getX(),e.getY(),dur.width,dur.height);
		g.setColor(Color.yellow);
		g.drawLine(e.getX(),e.getY(),dll.width,dll.height);
		g.setColor(Color.blue);
		g.drawLine(e.getX(),e.getY(),dlr.width,dlr.height);
	}
	
	public void mousePressed(MouseEvent e)
	{
		Dimension d = f.getSize();
		dul = new Dimension(0,0);
		dur = new Dimension(d.width,0);
		dll = new Dimension(0,d.height);
		dlr = new Dimension(d.width,d.height);
		
		Graphics g = f.getGraphics();
		g.setColor(Color.red);
		g.drawLine(e.getX(),e.getY(),dul.width,dul.height);
		g.setColor(Color.green);
		g.drawLine(e.getX(),e.getY(),dur.width,dur.height);
		g.setColor(Color.yellow);
		g.drawLine(e.getX(),e.getY(),dll.width,dll.height);
		g.setColor(Color.blue);
		g.drawLine(e.getX(),e.getY(),dlr.width,dlr.height);
	}
	
	public void mouseDragged(MouseEvent e)
	{
		Dimension d = f.getSize();
		dul = new Dimension(0,0);
		dur = new Dimension(d.width,0);
		dll = new Dimension(0,d.height);
		dlr = new Dimension(d.width,d.height);
		
		Graphics g = f.getGraphics();
		g.setColor(Color.red);
		g.drawLine(e.getX(),e.getY(),dul.width,dul.height);
		g.setColor(Color.green);
		g.drawLine(e.getX(),e.getY(),dur.width,dur.height);
		g.setColor(Color.yellow);
		g.drawLine(e.getX(),e.getY(),dll.width,dll.height);
		g.setColor(Color.blue);
		g.drawLine(e.getX(),e.getY(),dlr.width,dlr.height);
	}
	
	public void mouseMoved(MouseEvent e)
	{
		//Do Nothing Method
	}
	public void mouseExited(MouseEvent e)
	{
		//Do Nothing Method
	}
	public void mouseEntered(MouseEvent e)
	{
		//Do Nothing Method
	}
	public void mouseReleased(MouseEvent e)
	{
		//Do Nothing Method
	}
	
	public static void main(String args[])
	{
		Pattern p = new Pattern();
	}
}