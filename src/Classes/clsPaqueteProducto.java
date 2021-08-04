package Classes;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class clsPaqueteProducto {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private String idPaquete;
    private String nombrePaquete;
    private String descripcion;
    private int precioPaquete;
    private float descuentoPaquete;

    //ATRIBUTO DE RELACION CON LA CLASE PRODUCTO
    private clsProducto listaProducto;

    //METODO CONSTRUCTOR
    public clsPaqueteProducto(String idPaquete, String nombrePaquete, String descripcion, int precioPaquete, float descuentoPaquete, clsProducto listaProducto) {
        this.idPaquete = idPaquete;
        this.nombrePaquete = nombrePaquete;
        this.descripcion = descripcion;
        this.precioPaquete = precioPaquete;
        this.descuentoPaquete = descuentoPaquete;
        this.listaProducto = listaProducto;
    }

    //METODOS ACCESORES Y MUTADORES
    /**
     * @return the idPaquete
     */
    public String getIdPaquete() {
        return idPaquete;
    }

    /**
     * @param idPaquete the idPaquete to set
     */
    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    /**
     * @return the nombrePaquete
     */
    public String getNombrePaquete() {
        return nombrePaquete;
    }

    /**
     * @param nombrePaquete the nombrePaquete to set
     */
    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
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
     * @return the precioPaquete
     */
    public int getPrecioPaquete() {
        return precioPaquete;
    }

    /**
     * @param precioPaquete the precioPaquete to set
     */
    public void setPrecioPaquete(int precioPaquete) {
        this.precioPaquete = precioPaquete;
    }

    /**
     * @return the descuentoPaquete
     */
    public float getDescuentoPaquete() {
        return descuentoPaquete;
    }

    /**
     * @param descuentoPaquete the descuentoPaquete to set
     */
    public void setDescuentoPaquete(float descuentoPaquete) {
        this.descuentoPaquete = descuentoPaquete;
    }

    /**
     * @return the listaProducto
     */
    public clsProducto getListaProducto() {
        return listaProducto;
    }

    /**
     * @param listaProducto the listaProducto to set
     */
    public void setListaProducto(clsProducto listaProducto) {
        this.listaProducto = listaProducto;
    }

}
