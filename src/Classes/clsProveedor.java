package Classes;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class clsProveedor extends clsPersona {
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String idProveedor;

    //METODO CONSTRUCTOR
    public clsProveedor(String idProveedor, String tipoDocumento, String numeroDocumento, String nombre, String direccion, String ciudad, String departamento, String telefono, String email) {
        super(tipoDocumento, numeroDocumento, nombre, direccion, ciudad, departamento, telefono, email);
        this.idProveedor = idProveedor;
    }

    //METODO ACCESORES Y MUTADORES
    /**
     * @return the idProveedor
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

}
