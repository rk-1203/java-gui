import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Scroll implements AdjustmentListener
{
	Frame f;
	BorderLayout bl;
	GridLayout gl1;
	GridBagConstraints gbc;
	Panel p1,p2,p3;
	Scrollbar sb1,sb2,sb3;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Color mycolor;
	int r,g,b;

	public Scroll()
	{
		f = new Frame();
		f.setSize(600,400);
		bl = new BorderLayout();
		gl1 = new GridLayout(1,3,1,1);
		f.setLayout(bl);
		p1 = new Panel();
		p1.setLayout(gl1);
		r = 255;
		g = 255;
		b = 255;
		sb1 = new Scrollbar(Scrollbar.VERTICAL, r, 5, 0, 260);
		sb2 = new Scrollbar(Scrollbar.VERTICAL, b, 5, 0, 260);
		sb3 = new Scrollbar(Scrollbar.VERTICAL, g, 5, 0, 260);
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);

		//sb1.setBackground(new Color(255,0,0));
		sb1.setB;
		sb2.setBackground(new Color(0,255,0));
		sb3.setBackground(new Color(0,0,255));
		p1.add(sb1);
		p1.add(sb2);
		p1.add(sb3);
		p2 = new Panel();
		p2.setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		Insets i = new Insets(5,10,10,5);
		gbc.insets = i;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.ipadx = 10;
		gbc.ipady = 10;
		//gbc.anchor = GridBagConstraints.CENTER;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		//gbc.weightx = 0.5;
		l1 = new Label("Red");
		l2 = new Label("Green");
		l3 = new Label("Blue");
		t1 = new TextField(5);
		t2 = new TextField(5);
		t3 = new TextField(5);
		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		t1.setText(r+"");
		t2.setText(g+"");
		t3.setText(b+"");
		p2.add(l1,gbc);
		gbc.gridx = 1;
		p2.add(t1,gbc);
		gbc.gridx = 2;
		p2.add(l2,gbc);
		gbc.gridx = 3;
		p2.add(t2,gbc);
		gbc.gridx = 4;
		p2.add(l3,gbc);
		gbc.gridx = 5;
		p2.add(t3,gbc);
		
		p3 = new Panel();
		mycolor = new Color(r,g,b);
		p3.setBackground(mycolor);
		f.add(p1,"East");
		f.add(p2,"South");
		f.add(p3,"Center");
		f.setVisible(true);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		if(e.getSource() == sb1)
			r = sb1.getValue();
		else if(e.getSource() == sb2)
			g = sb2.getValue();
		else if(e.getSource() == sb3)
			b = sb3.getValue();
		mycolor = new Color(r,g,b);
		p3.setBackground(mycolor);
		t1.setText(r+"");
		t2.setText(g+"");
		t3.setText(b+"");
	}
	
	public static void main(String args[])
	{
		Scroll s = new Scroll();
	}
}