package view;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.net.URI;

import javax.swing.*;

import controller.Controlador;

public class InterfazGUI extends JFrame
{
	/*
	 * Se establecen los atributos como privados para el funcionamiento del GUI.
	 */
	private static final long serialVersionUID = 1L; //El serial por defecto de la clase
	private Mensajes alerta; // Estos son los mensajes informativos, de advertencia, errores y demas que van a aparecer en el programa.
	private PanelGrande pGrande; // Este es el panel grande. Donde se contiene, los clientes y la tabla.
	private PanelMenuBar pMenuBarra; // Esta es la barra, donde va el menú "archivo" "edicion" "ayuda" etc...
	
	/*
	 * Se establece el constructor de InterfazGUI que es la ventana principal donde va a aparecer todos los programas. 
	 */
	public InterfazGUI(Controlador control)
	{
		alerta = new Mensajes(); // Instancia de los mensajes
		pGrande = new PanelGrande(); // Instancia del panel grande.
		pMenuBarra = new PanelMenuBar(); // Instancia del panel barra.
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 400);
		setTitle("CreditoFacil - SinTitulo.cred");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
		
		add(pMenuBarra, BorderLayout.NORTH);
		add(pGrande, BorderLayout.CENTER);
		
		this.getPGrande().getPclientes().getTxCuota().setEditable(false);
		this.getPGrande().getPclientes().getTxTasaEfectiva().setEditable(false);
		this.getPGrande().getPclientes().getTxValorAnual().setEditable(false);
		
		pMenuBarra.getMarCerrar().addActionListener(control);
		pMenuBarra.getMayAcerca().addActionListener(control);
		pMenuBarra.getMayObtener().addActionListener(control);
		pMenuBarra.getMarCargar().addActionListener(control);
		pMenuBarra.getMarePDF().addActionListener(control);
		pMenuBarra.getMarGuardar().addActionListener(control);
		pMenuBarra.getMarGuardarComo().addActionListener(control);
		pGrande.getPclientes().getCotizar().addActionListener(control);
		pGrande.getPclientes().getBorrar().addActionListener(control);
		pGrande.getPclientes().getTxCliente().addActionListener(control);
		pGrande.getPclientes().getlTipoDocumento2().addActionListener(control);
		pGrande.getPclientes().getTxDocumento().addActionListener(control);
		pGrande.getPclientes().getTxMonto().addActionListener(control);
		pGrande.getPclientes().getTxPlazo().addActionListener(control);
		pGrande.getPclientes().getTxInteres().addActionListener(control);
	}
	public void openHelp() // https://www.codeproject.com/Questions/398241/how-to-open-url-in-java
	{
		try {
		  Desktop desktop = Desktop.getDesktop();
		  URI oURL = new URI("https://www.google.com/search?q=como+ser+millenial+y+usar+java&oq=como+ser+millenial+y+usar+java&aqs=chrome..69i57.14857j0j8&sourceid=chrome&ie=UTF-8"); //TODO: Poner como link directo al pdf de documentacion de esta mondá.
		  desktop.browse(oURL);
		} catch (Exception e) {
		  e.printStackTrace();
		}
	}
	/*
	 * Son los Getters & Setters generados automáticamente por la instrucción del usuario de Eclipse IDE
	 */
	public Mensajes getAlerta() 
	{
		return alerta;
	}
	public void setAlerta(Mensajes alerta) 
	{
		this.alerta = alerta;
	}
	public PanelGrande getPGrande() 
	{
		return pGrande;
	}
	public void setPGrande(PanelGrande pGrande) 
	{
		this.pGrande = pGrande;
	}
	public PanelMenuBar getPbarra() 
	{
		return pMenuBarra;
	}
	public void setPbarra(PanelMenuBar pbarra) 
	{
		this.pMenuBarra = pbarra;
	}
}
