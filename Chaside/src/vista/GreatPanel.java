package vista;

import java.awt.*;

import javax.swing.*;

public class GreatPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private BigPanel pGreat;
	private QuestionsPanel pQuestions;
	
	public GreatPanel()
	{
		setLayout(new GridLayout(1, 2));
		
		pGreat = new BigPanel();
		pQuestions = new QuestionsPanel();
		
		add(pGreat);
		add(pQuestions);
	}
}
