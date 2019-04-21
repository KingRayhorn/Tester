package vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class BarPanel extends JPanel
{
	private static final long serialVersionUID = 1L;//El serial por defecto de la clase
	private JMenuBar menuBar;
	private JMenu mFile;
	private JMenu mHelp;
	private JMenuItem marClose;
	private JMenuItem mayAbout;
	public static final String CLOSE = "Close";
	public static final String ABOUT = "About";
	public static final String LOAD = "Load";
	public static final String SAVEAS = "SaveAs";
	public static final String SAVE = "Save";
	
	public BarPanel()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar = new JMenuBar();
		add(menuBar);
		mFile = new JMenu("File");
		mFile.setMnemonic(KeyEvent.VK_A);
		menuBar.add(mFile);
		marClose = new JMenuItem("Close");
		marClose.setActionCommand(CLOSE);
		marClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		mFile.add(marClose);
		mHelp = new JMenu("Help");
		mHelp.setMnemonic(KeyEvent.VK_Y);
		menuBar.add(mHelp);
		mayAbout = new JMenuItem("About...");
		mayAbout.setActionCommand(ABOUT);
		mayAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		mHelp.add(mayAbout);
	}

	public JMenuItem getMarClose() {
		return marClose;
	}

	public void setMarCerrar(JMenuItem marClose) {
		this.marClose = marClose;
	}

	public JMenuItem getMayAbout() {
		return mayAbout;
	}

	public void setMayAbout(JMenuItem mayAbout) {
		this.mayAbout = mayAbout;
	}
	
}
