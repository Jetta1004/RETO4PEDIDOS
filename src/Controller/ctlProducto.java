package Controller;

import Classes.clsCliente;
import Classes.clsProducto;
import Model.ModelCliente;
import Model.modelProducto;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class ctlProducto {

    //ATRIBUTO QUE CONECTA EL CONTROLADOR Y EL MODELO
    modelProducto modelProducto;

    //SE INSTANCIA EL OBJETO QUE VA A CONECTAR
    public ctlProducto() {
        modelProducto = new modelProducto();
    }

    //METODO CRUD CREAR
    public boolean crear(String codigoProducto, String nombre, String descripcion,
            int cantidad, int precioUnitario, int proveedor, ArrayList<clsProducto> listaProducto) {
        clsProducto producto = new clsProducto(codigoProducto, nombre, descripcion,
                cantidad, precioUnitario, proveedor);
        return modelProducto.crear(producto, listaProducto);
    }

    //METODO PARA RECIBIR EL LA TABLA(ARRAY)DE LA CLASE LISTA PRODUCTO "listaProducto"
    public String[][] matriz(ArrayList<clsProducto> listaProducto) {
        //SE CREA ENTERO PARA QUE DE EL TAMAÑO DE LISTA
        int tamañoLista = listaProducto.size();
        //SE CREA MATRIZ PARA CONTENER LA INFORMACION DE "listaProducto"
        //TENER EN CUENTA LA CANTIDAD DE COLUMNAS PARA QUE NO GENERE CAMPOS VACIOS
        String[][] matrizProducto = new String[tamañoLista][6];

        //SE CREA VARIABLE PARA TENER UN INDICE (i) Y PODER INICIALIZAR LA MATRIZ
        int i = 0;

        //SE CREA UN FOR PARA BUSCAR LA VARIABLE LLAMADA PRODUCTO DENTRO DE 
        //LA CLASE PRODUCTO Y CONTIENE EL TAMAÑO DE LA LISTA PRODUCTO
        for (clsProducto producto : listaProducto)
        {
            matrizProducto[i][0] = producto.getIdProducto();
            matrizProducto[i][1] = producto.getNombre();
            matrizProducto[i][2] = producto.getDescripcion();
            //SE PARSEA EL STRING AGREGANDOLE UNA CADENA VACIA "" (ES OTRA FORMA DE HACERLO)
            //matrizProducto[i][3] = producto.getCantidadInventario()+ "";
            // SE CONVIERTE ENTERO A UNA CADENA CON EL USO DE "Integer.toString"
            matrizProducto[i][3] = Integer.toString(producto.getCantidadInventario());
            matrizProducto[i][4] = Integer.toString(producto.getPrecioUnitario());
            matrizProducto[i][5] = Integer.toString(producto.getProveedor());
            i++;
        }
        return matrizProducto;
    }

    //METODO CRUD BUSCAR
    public clsProducto buscar(String codigoProducto, ArrayList<clsProducto> listaProducto) {
        clsProducto producto = modelProducto.buscar(codigoProducto, listaProducto);
        return producto;
    }

    //METODO CRUD MODIFICAR
    public boolean modificar (String codigoProducto, String nombre, String descripcion,
            int cantidad, int precioUnitario, int proveedor, ArrayList<clsProducto> listaProducto) {
        clsProducto producto = new clsProducto(codigoProducto, nombre, descripcion,
                cantidad, precioUnitario, proveedor);
        return modelProducto.modificar(producto, listaProducto);    
    }
    
    //METODO ELIMINAR
    public boolean eliminar(String codigoProducto, List<clsProducto> listaProducto) {
        return modelProducto.eliminar(codigoProducto, listaProducto);
    }
}
