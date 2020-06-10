import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
	Frame f;
	GridLayout gl1,gl2;
	TextArea t;
	Panel p1,p2,p3,p4;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bmul,bc,bd,be,bp,bm;
	Font fo;
	
	String op1="",op2="",opt="";
	String line1 = "", line2 = ""; //line2:memory,line1:current
	int flag = 0,eq=0;  // 0:number1 , 1:operator , 2:number2
	
	public Calculator()
	{
		f = new Frame();
		gl1 = new GridLayout(5,1);
		gl2 = new GridLayout(1,4);
		fo = new Font("Cambria",Font.BOLD,40);
		f.setLayout(gl1);
		f.setSize(500,400);
		t = new TextArea("0",5,20,TextArea.SCROLLBARS_NONE);
		//t.SCROLLBARS_NONE;
		t.setEditable(false);
		f.add(t);
		p1 = new Panel();
		f.add(p1);
		p1.setLayout(gl2);
		p2 = new Panel();
		f.add(p2);
		p2.setLayout(gl2);
		p3 = new Panel();
		f.add(p3);
		p3.setLayout(gl2);
		p4 = new Panel();
		f.add(p4);
		p4.setLayout(gl2);
		
		b1 = new Button("1");
		p1.add(b1);
		b1.setFont(fo);
		b2 = new Button("2");
		p1.add(b2);
		b2.setFont(fo);
		b3 = new Button("3");
		p1.add(b3);
		b3.setFont(fo);
		bp = new Button("+");
		p1.add(bp);
		bp.setFont(fo);
		b4 = new Button("4");
		p2.add(b4);
		b4.setFont(fo);
		b5 = new Button("5");
		p2.add(b5);
		b5.setFont(fo);
		b6 = new Button("6");
		p2.add(b6);
		b6.setFont(fo);
		bm = new Button("-");
		p2.add(bm);
		bm.setFont(fo);
		b7 = new Button("7");
		p3.add(b7);
		b7.setFont(fo);
		b8 = new Button("8");
		p3.add(b8);
		b8.setFont(fo);
		b9 = new Button("9");
		p3.add(b9);
		b9.setFont(fo);
		bmul = new Button("*");
		p3.add(bmul);
		bmul.setFont(fo);
		bc = new Button("C");
		p4.add(bc);
		bc.setFont(fo);
		b0 = new Button("0");
		p4.add(b0);
		b0.setFont(fo);
		bd = new Button("/");
		p4.add(bd);
		bd.setFont(fo);
		be = new Button("=");
		p4.add(be);
		be.setFont(fo);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bmul.addActionListener(this);
		bc.addActionListener(this);
		bd.addActionListener(this);
		be.addActionListener(this);
		bp.addActionListener(this);
		bm.addActionListener(this);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		
		if(e.getSource()==b0)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="0";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="0";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="0";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b1)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="1";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="1";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="1";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b2)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="2";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="2";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="2";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b3)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="3";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="3";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="3";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b4)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="4";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="4";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="4";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b5)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="5";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="5";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="5";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b6)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="6";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="6";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="6";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b7)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="7";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="7";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="7";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b8)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="8";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="8";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="8";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==b9)
		{
			if(eq == 1)
			{
				flag = 0;
				op1 = "";
				op2 = "";
				opt = "";
				line1 = "";
				line2 = "";
				eq = 0;
			}
			if(flag == 0)
			{
				op1 +="9";
				line1 = op1;
				t.setText(line1+"\n"+line2);
			}
			else if(flag == 1)
			{
				op2 ="9";
				line1 = op2;
				t.setText(line1+"\n"+line2);
				flag = 2;
			}
			else if(flag == 2)
			{
				op2 +="9";
				line1 = op2;
				t.setText(line1+"\n"+line2);
			}
		}
		else if(e.getSource()==bmul)
		{
			if(flag == 0)
			{
				//op1 = "0";
				if(op1.equals(""))
					op1 = "0";
				opt = "*";
				line1 = op1;
				line2 += op1 + opt;
				t.setText(line1+"\n"+line2);
				flag = 1;
			}
			else if(flag == 1)
			{
				opt = "*";
				line2 = line2.substring(0, line2.length() - 1);
				line2 += opt;
				t.setText(line1+"\n"+line2);
				flag = 1;
			}
			else if(flag == 2)
			{
				int o1,o2;
				if(op1.equals(""))
					o1 = 0;
				else
					o1 = Integer.parseInt(op1);
				if(op2.equals(""))
					o2 = 0;
				else
					o2 = Integer.parseInt(op2);
				int o3 = 0;
				switch(opt)
				{
					case "+" : o3 = o1 + o2;
								break;
					case "-" : o3 = o1 - o2;
								break;
					case "*" : o3 = o1 * o2;
								break;
					case "/" : if(o2 == 0)
								{
									t.setText("Cant Divide by Zero");
									flag = 0;
									op1 = "0";
									op2 = "0";
									opt = "";
									line1 = "";
									line2 = "";
								}
								else
								{
									o3 = o1 / o2;
								}
								break;
				}
				if(flag!=0)
				{
					op1 = o3 + "";
					opt = "*";
					line1 = op1;
					line2 += op2+opt;
					t.setText(line1+"\n"+line2);
					flag = 1;
				}
			}
			eq = 0;
		}
		else if(e.getSource()==bd)
		{
			if(flag == 0)
			{
				//op1 = "0";
				if(op1.equals(""))
					op1 = "0";
				opt = "/";
				line1 = op1;
				line2 += op1 + opt;
				t.setText(line1+"\n"+line2);
				flag = 1;
			}
			else if(flag == 1)
			{
				opt = "/";
				line2 = line2.substring(0, line2.length() - 1);
				line2 += opt;
				t.setText(line1+"\n"+line2);
				flag = 1;
			}
			else if(flag == 2)
			{
				int o1,o2;
				if(op1.equals(""))
					o1 = 0;
				else
					o1 = Integer.parseInt(op1);
				if(op2.equals(""))
					o2 = 0;
				else
					o2 = Integer.parseInt(op2);
				int o3 = 0;
				switch(opt)
				{
					case "+" : o3 = o1 + o2;
								break;
					case "-" : o3 = o1 - o2;
								break;
					case "*" : o3 = o1 * o2;
								break;
					case "/" : if(o2 == 0)
								{
									t.setText("Cant Divide by Zero");
									flag = 0;
									op1 = "0";
									op2 = "0";
									opt = "";
									line1 = "";
									line2 = "";
								}
								else
								{
									o3 = o1 / o2;
								}
								break;
				}
				if(flag!=0)
				{
					op1 = o3 + "";
					opt = "/";
					line1 = op1;
					line2 += op2+opt;
					t.setText(line1+"\n"+line2);
					flag = 1;
				}
			}
			eq = 0;
		}
		else if(e.getSource()==bm)
		{
			if(flag == 0)
			{
				//op1 = "0";
				if(op1.equals(""))
					op1 = "0";
				opt = "-";
				line1 = op1;
				line2 += op1 + opt;
				t.setText(line1+"\n"+line2);
				flag = 1;
			}
			else if(flag == 1)
			{
				opt = "-";
				line2 = line2.substring(0, line2.length() - 1);
				line2 += opt;
				t.setText(line1+"\n"+line2);
				flag = 1;
			}
			else if(flag == 2)
			{
				int o1,o2;
				if(op1.equals(""))
					o1 = 0;
				else
					o1 = Integer.parseInt(op1);
				if(op2.equals(""))
					o2 = 0;
				else
					o2 = Integer.parseInt(op2);
				int o3 = 0;
				switch(opt)
				{
					case "+" : o3 = o1 + o2;
								break;
					case "-" : o3 = o1 - o2;
								break;
					case "*" : o3 = o1 * o2;
								break;
					case "/" : if(o2 == 0)
								{
									t.setText("Cant Divide by Zero");
									flag = 0;
									op1 = "0";
									op2 = "0";
									opt = "";
									line1 = "";
									line2 = "";
								}
								else
								{
									o3 = o1 / o2;
								}
								break;
				}
				if(flag!=0)
				{
					op1 = o3 + "";
					opt = "-";
					line1 = op1;
					line2 += op2+opt;
					t.setText(line1+"\n"+line2);
					flag = 1;
				}
			}
			eq = 0;
		}
		else if(e.getSource()==bp)
		{
			if(flag == 0)
			{
				//op1 = "0";
				if(op1.equals(""))
					op1 = "0";
				if(op1.equals(""))
					op1 = "0";
				opt = "+";
				line1 = op1;
				line2 += op1 + opt;
				t.setText(line1+"\n"+line2);
				flag = 1;
			}
			else if(flag == 1)
			{
				opt = "+";
				line2 = line2.substring(0, line2.length() - 1);
				line2 += opt;
				t.setText(line1+"\n"+line2);
				flag = 1;
			}
			else if(flag == 2)
			{
				int o1,o2;
				if(op1.equals(""))
					o1 = 0;
				else
					o1 = Integer.parseInt(op1);
				if(op2.equals(""))
					o2 = 0;
				else
					o2 = Integer.parseInt(op2);
				int o3 = 0;
				switch(opt)
				{
					case "+" : o3 = o1 + o2;
								break;
					case "-" : o3 = o1 - o2;
								break;
					case "*" : o3 = o1 * o2;
								break;
					case "/" : if(o2 == 0)
								{
									t.setText("Cant Divide by Zero");
									flag = 0;
									op1 = "0";
									op2 = "0";
									opt = "";
									line1 = "";
									line2 = "";
								}
								else
								{
									o3 = o1 / o2;
								}
								break;
				}
				if(flag!=0)
				{
					op1 = o3 + "";
					opt = "+";
					line1 = op1;
					line2 += op2+opt;
					t.setText(line1+"\n"+line2);
					flag = 1;
				}
			}
			eq = 0;
		}
		else if(e.getSource()==bc)
		{
			//op1 = "";
			op1 = "";
			op2 = "";
			opt = "";
			eq = 0;
			line1 = "";
			line2 = "";
			flag = 0;
			t.setText("0");
		}
		else if(e.getSource()==be)
		{
			if(flag == 0)
			{
				t.setText(line1+"\n"+line2);
				line2 = "";
				opt = "";
			}
			else if(flag == 1)
			{
				if(eq!=1)
				{
					op2 = op1;
				}
				int o1,o2;
				if(op1.equals(""))
					o1 = 0;
				else
					o1 = Integer.parseInt(op1);
				if(op2.equals(""))
					o2 = 0;
				else
					o2 = Integer.parseInt(op2);
				int o3 = 0;
				switch(opt)
				{
					case "+" : o3 = o1 + o2;
								break;
					case "-" : o3 = o1 - o2;
								break;
					case "*" : o3 = o1 * o2;
								break;
					case "/" : if(o2 == 0)
								{
									t.setText("Cant Divide by Zero");
									flag = 0;
									op1 = "0";
									op2 = "0";
									opt = "";
									line1 = "";
									line2 = "";
								}
								else
								{
									o3 = o1 / o2;
								}
								break;
				}
				if(flag!=0)
				{
					op1 = o3 + "";
					//opt = "+";
					line1 = op1;
					line2 = op1 + opt;
					t.setText(line1);
					flag = 1;
				}
			}
			else if(flag == 2)
			{
				int o1,o2;
				if(op1.equals(""))
					o1 = 0;
				else
					o1 = Integer.parseInt(op1);
				if(op2.equals(""))
					o2 = 0;
				else
					o2 = Integer.parseInt(op2);
				int o3 = 0;
				switch(opt)
				{
					case "+" : o3 = o1 + o2;
								break;
					case "-" : o3 = o1 - o2;
								break;
					case "*" : o3 = o1 * o2;
								break;
					case "/" :  if(o2 == 0)
								{
									t.setText("Cant Divide by Zero");
									flag = 0;
									op1 = "0";
									op2 = "0";
									opt = "";
									line1 = "";
									line2 = "";
								}
								else
								{
									o3 = o1 / o2;
								}
								break;
				}
				if(flag!=0)
				{
					op1 = o3 + "";
					//opt = "+";
					opt = "";
					line1 = op1;
					line2 = "";
					t.setText(line1);
					flag = 0;
				}/*
				else
				{
					op1 = o3 + "";
					op2 = "0";
					opt = "";
					line1 = op1;
					line2 = "";
					t.setText(line1);
					flag = 0;
				}*/
			}
			eq=1;
		}
	}
	
	public static void main(String args[])
	{
		Calculator cal = new Calculator();
	}
}