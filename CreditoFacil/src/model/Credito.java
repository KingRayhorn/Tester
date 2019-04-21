package model;

public class Credito implements Cliente, Prestamo
{
	/*
	 * Se establecen los atributos del cr�dito donde incluyen Cliente y Prestamo
	 */
	private double monto, interes, tasaEfectiva, valorAnual, valorCuota, ingresos, dcScore;
	private String nombre, direccion, profesion, documento;
	private char tipoDocumento, tipoEmpleo;
	private int plazo;

	@Override
	public double monto() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return monto;
	}

	@Override
	public double interes() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return interes;
	}

	@Override
	public int plazo() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return plazo;
	}

	@Override
	public double tasaEfectiva() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		tasaEfectiva=(Math.pow((1+interes), 1.00000/12.00000)-1);
		return tasaEfectiva;
	}

	@Override
	public double valorAnual() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		valorAnual = ((1-Math.pow(1+tasaEfectiva, -plazo))/tasaEfectiva);
		return valorAnual;
	}

	@Override
	public double valorCuota() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		valorCuota=monto/valorAnual;
		return valorCuota;
	}

	@Override
	public String nombre() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return nombre;
	}

	@Override
	public String direccion() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return direccion;
	}

	@Override
	public char tipoDocumento() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return tipoDocumento;
	}

	@Override
	public String documento() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return documento;
	}

	@Override
	public char tipoEmpleo() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return tipoEmpleo;
	}

	@Override
	public String profesion() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return profesion;
	}

	@Override
	public double ingresos() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return ingresos;
	}

	@Override
	public double dcScore() 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return dcScore;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getTasaEfectiva() {
		return tasaEfectiva;
	}

	public void setTasaEfectiva(double tasaEfectiva) {
		this.tasaEfectiva = tasaEfectiva;
	}

	public double getValorAnual() {
		return valorAnual;
	}

	public void setValorAnual(double valorAnual) {
		this.valorAnual = valorAnual;
	}

	public double getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(double valorCuota) {
		this.valorCuota = valorCuota;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
}
