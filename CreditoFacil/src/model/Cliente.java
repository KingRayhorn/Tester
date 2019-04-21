package model;

public interface Cliente 
{
	public String nombre(); // Puede ir el nombre completo del cliente.
	public String direccion(); // Aqui va el domicilio de residencia del cliente. Ojal� pudiera ir en este formato: Direcci�n, Interior(si aplica), Ciudad, Departamento, CP, Pais
	public char tipoDocumento(); // r = Cedula de Ciudadan�a; n = NUIP; e = C�dula de Extranjer�a; p = Pasaporte; O = otros...
	public String documento(); // Aqui va el documento. Como p puede ser en alfanum�rico, ej. PE102523. Se establece como String.
	public char tipoEmpleo(); // i = Independiente; e = Estudiante; a = Asalariado; p = Pensionado; d = Desempleado..
	public String profesion(); // Aqui puede ir desde vendedor de empanadas, hasta humilde congresista.
	public double ingresos(); // Aqui van los ingresos.
	public double dcScore(); //dcScore = Puntaje de DataCr�dito.
}
