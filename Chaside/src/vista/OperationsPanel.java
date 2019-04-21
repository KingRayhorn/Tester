package vista;

import javax.swing.*;
import java.awt.*;

public class OperationsPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton goBack, goForward, pause, goNext;
	
	public OperationsPanel()
	{
		setLayout(new GridLayout(1, 4));
		
		goBack = new JButton("Go Back");
		add(goBack);
		
		goForward = new JButton("Go Forward");
		add(goForward);
		
		pause = new JButton("Pause");
		add(pause);
		
		goNext = new JButton("Continue");
		add(goNext);
	}
}
