package vista;

import java.awt.*;
import javax.swing.*;

import controlador.Controlador;

public class InterfazGUI extends JFrame
{

	private static final long serialVersionUID = 1L;
	private Messages alert;
	private BarPanel tooltip;
	private GreatPanel pgiant;
	public InterfazGUI(Controlador control)
	{
		alert = new Messages();
		tooltip = new BarPanel();
		pgiant = new GreatPanel();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("Chaside: Vocational Orientation");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
		
		add(tooltip, BorderLayout.NORTH);
		add(pgiant, BorderLayout.CENTER);
		
		tooltip.getMarClose().addActionListener(control);
		tooltip.getMayAbout().addActionListener(control);
	}
	/*
	 * Getters & Setters generados por el usuario en Eclipse IDE
	 */
	public Messages getAlert() 
	{
		return alert;
	}
	public void setAlerta(Messages alert) 
	{
		this.alert = alert;
	}
	public BarPanel getTooltip() {
		return tooltip;
	}
	public void setTooltip(BarPanel tooltip) {
		this.tooltip = tooltip;
	}
	public GreatPanel getPgigante() {
		return pgiant;
	}
	public void setPgigante(GreatPanel pgiant) {
		this.pgiant = pgiant;
	}

}
