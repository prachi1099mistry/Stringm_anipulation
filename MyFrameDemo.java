import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

class MyFrame extends Frame implements ActionListener, WindowListener
{
	Label l1;
	Label l2;
	TextField t1;
	TextField t2;
	Button b1;
	Button b2;
	MyFrame()
	{
		l1=new Label("String 1:");
		l2=new Label("String 2:");
		t1=new TextField(10);
		t2=new TextField(10);
		b1=new Button("Reverse");
		b2=new Button("Concate");
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(b1);
		add(l2);
		add(t2);
		add(b2);
		addWindowListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(250,250);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b1)
		{
			String s1=t1.getText();
			int len=s1.length();
			System.out.println("Reverse:");
			for(int i=len-1;i>=0;i--)
			{
				System.out.print(s1.charAt(i));
			}
		}
		else if(a.getSource()== b2)
		{
			String s2=t1.getText();
			String s3=t2.getText();
			System.out.println("\nString concate="+s2+s3);
		}
	}
	public void windowOpened(WindowEvent w){}
	public void windowClosing(WindowEvent w)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent w){}
	public void windowIconified(WindowEvent w){}
	public void windowDeiconified(WindowEvent w){}
	public void windowActivated(WindowEvent w){}
	public void windowDeactivated(WindowEvent w){}
}
class MyFrameDemo
{
	public static void main(String[] args)
	{
		new MyFrame();
	}
}