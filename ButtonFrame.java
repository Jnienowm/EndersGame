import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//added line as staging test for Git

class ButtonListener implements ActionListener
{
	int count = 0;
	public void actionPerformed(ActionEvent e)
	{
	    System.out.println("Button pressed (" + count++ + ") " + 
			       e.getActionCommand());
	}
}
//branch p2 change
//added other line as test
class ButtonCloser extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
	System.out.println("Application exiting");
	System.exit(0);
    }
}

//p1 edit for git test
//second p1 edit
public class ButtonFrame extends JFrame
{
	public ButtonFrame()
	{
		JButton open = new JButton("Open");
		JButton close = new JButton("Close");
		ActionListener listener = new ButtonListener();

		open.addActionListener(listener);
		close.addActionListener(listener);

		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		pane.add(open);
		pane.add(close);

		addWindowListener(new ButtonCloser());
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String args[])
	{
		JFrame f = new ButtonFrame();
	}
}
