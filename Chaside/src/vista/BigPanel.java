package vista;

import javax.swing.*;
import java.awt.*;

public class BigPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private OperationsPanel pOperaciones;
	private DetailsPanel pDetalles;
	
	public BigPanel()
	{
		setLayout(new GridLayout(2, 1));
		
		pOperaciones = new OperationsPanel();
		pDetalles = new DetailsPanel();
		
		add(pDetalles);
		add(pOperaciones);
	}
}
