
package Classes;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */

public class clsPedido {
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String idPedido;
    private int valorDescuento;
    private String estadoPedido;
    
    //ATRIBUTO DE RELACION CON LA CLASE CLIENTE - PRODUCTO - VENDEDOR
    private clsCliente cliente;
    private clsProducto listaPaqueteProducto;
    private clsVendedor vendedor;
    private clsProducto listaProducto;
    
    //METODO CONSTRUCTOR
    public clsPedido(String idPedido, int valorDescuento, String estadoPedido, clsCliente cliente, clsProducto listaPaqueteProducto, clsVendedor vendedor, clsProducto listaProducto) {
        this.idPedido = idPedido;
        this.valorDescuento = valorDescuento;
        this.estadoPedido = estadoPedido;
        this.cliente = cliente;
        this.listaPaqueteProducto = listaPaqueteProducto;
        this.vendedor = vendedor;
        this.listaProducto = listaProducto;
    }
        
    
    //METODOS ACCESORES Y MUTADORES

    /**
     * @return the idPedido
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the valorDescuento
     */
    public int getValorDescuento() {
        return valorDescuento;
    }

    /**
     * @param valorDescuento the valorDescuento to set
     */
    public void setValorDescuento(int valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    /**
     * @return the estadoPedido
     */
    public String getEstadoPedido() {
        return estadoPedido;
    }

    /**
     * @param estadoPedido the estadoPedido to set
     */
    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    /**
     * @return the cliente
     */
    public clsCliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(clsCliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the listaPaqueteProducto
     */
    public clsProducto getListaPaqueteProducto() {
        return listaPaqueteProducto;
    }

    /**
     * @param listaPaqueteProducto the listaPaqueteProducto to set
     */
    public void setListaPaqueteProducto(clsProducto listaPaqueteProducto) {
        this.listaPaqueteProducto = listaPaqueteProducto;
    }

    /**
     * @return the vendedor
     */
    public clsVendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(clsVendedor vendedor) {
        this.vendedor = vendedor;
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
