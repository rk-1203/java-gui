import java.awt.*;
import java.awt.event.*;
class Painting implements MouseMotionListener, MouseListener
{
	Frame f;
	Dimension dul,dur,dll,dlr;
	int x,y;
	
	public Painting()
	{
		f = new Frame();
		f.setSize(600,600);
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		/*
		Graphics g = f.getGraphics();
		g.setColor(Color.red);
		x = e.getX();
		y = e.getY();
		g.drawLine(x,y,x,y);
		*/
	}
	
	public void mousePressed(MouseEvent e)
	{
		Graphics g = f.getGraphics();
		g.setColor(Color.red);
		x = e.getX();
		y = e.getY();
		g.drawLine(x,y,x,y);
	}
	
	public void mouseDragged(MouseEvent e)
	{
		Graphics g = f.getGraphics();
		g.setColor(Color.red);
		g.drawLine(x,y,e.getX(),e.getY());		
		x = e.getX();
		y = e.getY();
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
		Painting p = new Painting();
	}
}