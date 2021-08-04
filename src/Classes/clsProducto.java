package Classes;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class clsProducto {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private String idProducto;
    private String nombre;
    private String descripcion;
    private int cantidadInventario;
    private int precioUnitario;

    //ATRIBUTO DE RELACION CON LA CLASE PROVEEDOR
    private int proveedor;

    //METODO CONSTRUCTOR
    public clsProducto(String idProducto, String nombre, String descripcion, int cantidadInventario, int precioUnitario, int proveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
        this.proveedor = proveedor;
    }

    public clsProducto(String idProducto, String nombre, String descripcion, int cantidadInventario, int precioUnitario) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

    //METODOS ACCESORES Y MUTADORES
    /**
     * @return the idProducto
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidadInventario
     */
    public int getCantidadInventario() {
        return cantidadInventario;
    }

    /**
     * @param cantidadInventario the cantidadInventario to set
     */
    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    /**
     * @return the precioUnitario
     */
    public int getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the proveedor
     */
    public int getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

}
