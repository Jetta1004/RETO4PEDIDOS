package Classes;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class clsInvetario {
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String idInventario;
    private int Cantidad;

    //ATRIBUTO DE RELACION CON LA CLASE PRODUCTO
    private clsProducto listaProducto;

    //METODO CONSTRUCTOR
    public clsInvetario(String idInventario, int Cantidad, clsProducto listaProducto) {
        this.idInventario = idInventario;
        this.Cantidad = Cantidad;
        this.listaProducto = listaProducto;
    }
    
    //METODO ACCESORES Y MUTADORES
    /**
     * @return the idInventario
     */
    public String getIdInventario() {
        return idInventario;
    }

    /**
     * @param idInventario the idInventario to set
     */
    public void setIdInventario(String idInventario) {
        this.idInventario = idInventario;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
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
