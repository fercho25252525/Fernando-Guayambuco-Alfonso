package SingleResponsibility;

public class Alumno {

	/*
	 * creaci�n atributos del alumno
	 */
	private String codigo;

	private String nombre;

	private String tipoDocumento;

	private String numeroDocumento;

	/*
	 * creaci�n contructor vacio del alumno
	 */
	public Alumno() {

	}

	/*
	 * creaci�n constructor con todos los parametros del alumno
	 */
	public Alumno(String codigo, String nombre, String tipoDocumento, String numeroDocumento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	/*
	 * creaci�n m�todos getter and setter
	 */
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/*
	 * creaci�n me�todo toString()
	 */
	@Override
	public String toString() {
		return "Alumno con c�digo=" + codigo + ", nombre=" + nombre + ", tipoDocumento=" + tipoDocumento
				+ ", numeroDocumento=" + numeroDocumento + "";
	}

}
