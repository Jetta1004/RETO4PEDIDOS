package Classes;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class clsVendedor extends clsPersona {
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String idVendedor;
    private int ventasRealizadas;

    //METODO CONSTRUCTOR
    public clsVendedor(String idVendedor, int ventasRealizadas, String tipoDocumento, String numeroDocumento, String nombre, String direccion, String ciudad, String departamento, String telefono, String email) {
        super(tipoDocumento, numeroDocumento, nombre, direccion, ciudad, departamento, telefono, email);
        this.idVendedor = idVendedor;
        this.ventasRealizadas = ventasRealizadas;
    }

    //METODOS ACCESORES Y MUTADORES
    /**
     * @return the idVendedor
     */
    public String getIdVendedor() {
        return idVendedor;
    }

    /**
     * @param idVendedor the idVendedor to set
     */
    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    /**
     * @return the ventasRealizadas
     */
    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    /**
     * @param ventasRealizadas the ventasRealizadas to set
     */
    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

}
