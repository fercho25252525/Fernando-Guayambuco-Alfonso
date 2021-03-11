package DependencyInversionPriciple;

public class AccesoADatos {

	private IConexion conexion;

    public AccesoADatos(IConexion conexion){
        this.conexion = conexion;
    }

    Dato getDatos(){
        return conexion.getDatos();
    }
}
