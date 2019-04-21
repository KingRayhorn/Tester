package modelo;

public class Mundo 
{
	private Archivo a;
	private Propiedades p;
	private Persistencia bd;
	private Chaside c;
	
	public Mundo()
	{
		a = new Archivo();
		p = new Propiedades();
		bd = new Persistencia();
		c = new Chaside();
	}

	public Archivo getA() {
		return a;
	}

	public void setA(Archivo a) {
		this.a = a;
	}

	public Propiedades getP() {
		return p;
	}

	public void setP(Propiedades p) {
		this.p = p;
	}

	public Persistencia getBd() {
		return bd;
	}

	public void setBd(Persistencia bd) {
		this.bd = bd;
	}

	public Chaside getC() {
		return c;
	}

	public void setC(Chaside c) {
		this.c = c;
	}
}
