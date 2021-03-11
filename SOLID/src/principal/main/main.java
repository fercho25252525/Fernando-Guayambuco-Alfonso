package principal.main;

import SingleResponsibility.Alumno;
import SingleResponsibility.AlumnoDao;
import interfaceSegregationPrinciple.IAve;
import interfaceSegregationPrinciple.IAveNadadora;
import interfaceSegregationPrinciple.LoroImpl;
import interfaceSegregationPrinciple.PinguinoImpl;
import openClosePrinciple.Audi;
import openClosePrinciple.Coche;
import openClosePrinciple.Mercedes;
import openClosePrinciple.Renault;

public class main {

	public static void main(String args[]) {
		interfaceSegregationPrinciple();
		liskovSustitutionPrinciple();
		voidapenClosedPrinciple();
		singleResponsibility();
	}
	/*
	 * los clientes no se ven forzados a depender de sus interfaces
	 */
	public static void interfaceSegregationPrinciple() {
		accionesLoro();
		accionesPnguino() ;
	}
	
	public static void accionesLoro() {
		LoroImpl loro = new LoroImpl();
		loro.comer();
		loro.volar();
	}
	
	public static void accionesPnguino() {
		PinguinoImpl pinguino= new PinguinoImpl();
		pinguino.comer();
		pinguino.nadar();
	}
	
	/*
	 * la subclase es sustituida por la clase padre
	 */
	public static void liskovSustitutionPrinciple(){
		LiskovSustitutionPrinciple.Coche[] arrayCoches = { new LiskovSustitutionPrinciple.Renault(), new LiskovSustitutionPrinciple.Mercedes() };

		imprimirNumAsientos(arrayCoches);
	}
	private static void imprimirNumAsientos(LiskovSustitutionPrinciple.Coche[] arrayCoches) {
		for (LiskovSustitutionPrinciple.Coche coche : arrayCoches) {
	        System.out.println(coche.numeroAsientos());
	    }
	}

	/*
	 * principio open/close principle
	 * estar abiertos para su extensión, pero cerradas para su modificación.
	 */
	public static void voidapenClosedPrinciple() {
		
		Coche[] arrayCoches = { new Renault(), new Audi(), new Mercedes() };

		imprimirPrecioMedioCoche(arrayCoches);
	}
	
	public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){  
	    for (Coche coche : arrayCoches) {
	        System.out.println(coche.precioMedioCoche());
	    }
	}

	/*
	 * principio single responsibility se separan las responsabilidades de las
	 * clases la clase Alumno es el esquema de dato la clase AlumnoDao se encarga de
	 * realizar la persistencia de datos
	 */
	public static void singleResponsibility() {

		Alumno alumno = new Alumno("101", "pepito", "perez", "10264893");
		AlumnoDao alumnoDB = new AlumnoDao();
		alumnoDB.saveAlumno(alumno);
		alumnoDB.deleteAlumno(alumno);
	}


	
}
