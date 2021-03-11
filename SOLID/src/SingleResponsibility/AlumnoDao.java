package SingleResponsibility;

/*
 * clase de persistencia de datos
 */
public class AlumnoDao {
	
	/*
	 * creación método para guardar un alumno
	 */
	public Alumno saveAlumno(Alumno alumno) {
		System.out.println("El " + alumno.toString() + " se ha guardado éxitosamente.");
		return alumno;
	}
	
	/*
	 * creación método elimianr un alumno
	 */
	public String deleteAlumno(Alumno alumno) {
		return "El alumno " + alumno.getNombre() + " se ha eliminado éxitosamente.";
	}
}
