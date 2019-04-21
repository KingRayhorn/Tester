package vista;

import javax.swing.*;

public class Messages extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public void NotUserFound()
	{
		JOptionPane.showMessageDialog(null, "No user found. Do you want to create one?", "Warning", JOptionPane.YES_NO_OPTION, null);
	}
	public void AboutUs()
	{
		JOptionPane.showMessageDialog(null, "Test Chaside: Vocational Orientation\nAlpha Release\nAuthor: Nicolas Ferreira P.\nMail: nferreirap@unbosque.edu.co\nAll rights reserved (2019).", "About", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
