package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador implements ActionListener
{
	private Mundo bd;
	private InterfazGUI gui;
	
	public Controlador()
	{
		bd = new Mundo();
		gui = new InterfazGUI(this);
	}
	public void notUserFound()
	{
			bd.getA();
			gui.getAlert().NotUserFound();
	}
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		if(evento.getActionCommand() == gui.getTooltip().CLOSE)
		{
			System.exit(0);
		}
		if(evento.getActionCommand() == gui.getTooltip().ABOUT)
		{
			gui.getAlert().AboutUs();
		}
	}
}
