package SingleResponsibility;

public class Alumno {

	/*
	 * creación atributos del alumno
	 */
	private String codigo;

	private String nombre;

	private String tipoDocumento;

	private String numeroDocumento;

	/*
	 * creación contructor vacio del alumno
	 */
	public Alumno() {

	}

	/*
	 * creación constructor con todos los parametros del alumno
	 */
	public Alumno(String codigo, String nombre, String tipoDocumento, String numeroDocumento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	/*
	 * creación métodos getter and setter
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
	 * creación meétodo toString()
	 */
	@Override
	public String toString() {
		return "Alumno con código=" + codigo + ", nombre=" + nombre + ", tipoDocumento=" + tipoDocumento
				+ ", numeroDocumento=" + numeroDocumento + "";
	}

}
