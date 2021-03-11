package SingleResponsibility;

/*
 * clase de persistencia de datos
 */
public class AlumnoDao {
	
	/*
	 * creaci�n m�todo para guardar un alumno
	 */
	public Alumno saveAlumno(Alumno alumno) {
		System.out.println("El " + alumno.toString() + " se ha guardado �xitosamente.");
		return alumno;
	}
	
	/*
	 * creaci�n m�todo elimianr un alumno
	 */
	public String deleteAlumno(Alumno alumno) {
		return "El alumno " + alumno.getNombre() + " se ha eliminado �xitosamente.";
	}
}
