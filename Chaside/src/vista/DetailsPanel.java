package vista;

import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private String user, counter;
	private JLabel msgWelcome, msgAnsweredQuestions;
	private JButton getResults, askHelp;
	
	public DetailsPanel()
	{
		setLayout(new GridLayout(2, 3));
		user = new String("User");
		counter = new String("0");
		msgWelcome = new JLabel("Welcome "+user+"!");
		msgAnsweredQuestions = new JLabel("You have "+counter+"/98 answered questions");
		
		getResults = new JButton("Get results");
		askHelp = new JButton("Ask for help");
		
		add(msgWelcome);
		add(msgAnsweredQuestions);
		add(getResults);
		add(askHelp);
	}
}
