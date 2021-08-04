package Model;

import Classes.clsProducto;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class modelProducto {

    //SE RECIBE EL OBJETO PARA EL CONTROLADOR Y SE LLEVA A UNA TABLA Y SI VA ADICIONANDO
    public boolean crear(clsProducto producto, ArrayList<clsProducto> listaProducto) {
        listaProducto.add(producto);
        return true;
    }

    //BUSCA EL PRODUCTO
    public clsProducto buscar(String codigoProducto, ArrayList<clsProducto> listaProducto) {
        //SE DEBE RECORER LA LISTA PARA VERIFICAR SI ESTA
        boolean productoEncontrado = false;
        //RECORREMOS LA LISTA DE LOS PRODUCTO, PARA CONFIRMA SI SE ENCUENTRA EN LA LISTA
        for (clsProducto producto : listaProducto)
        {
            //SI EL CODIGO ESTA, TRAE TODOS LOS DATOS DEL PRODUCTO
            if (producto.getIdProducto().equals(codigoProducto))
            {
                productoEncontrado = true;
                clsProducto productoEnc = new clsProducto(producto.getIdProducto(),
                        producto.getNombre(),
                        producto.getDescripcion(),
                        producto.getCantidadInventario(),
                        producto.getPrecioUnitario(),
                        producto.getProveedor());
                return productoEnc;
            }
        }
        //SI ES DIFERENTE NO TRAE NADA
        if (!productoEncontrado)
        {
            return null;
        }
        return null;
    }
    
    //SE BUSCA EL CODIGO PRODUCTO Y SE MODIFICA LA INFO
    public boolean modificar(clsProducto productoModificar, ArrayList<clsProducto> listaProducto) {
        for (clsProducto producto : listaProducto)
        {
            //SI ENCUENTRA EL CLIENTE A ACTUALIZAR, SOBREESCRIBE TODOS SUS ATRIBUTOS
            if (productoModificar.getIdProducto().equals(productoModificar.getIdProducto()))
            {
                //ESTO SE REALIZA A TRAVEZ DE LOS METODOS MUTADORES DE PRODUCTO 
                producto.setIdProducto(productoModificar.getIdProducto());
                producto.setNombre(productoModificar.getNombre());
                producto.setDescripcion(productoModificar.getDescripcion());
                producto.setCantidadInventario(productoModificar.getCantidadInventario());
                producto.setPrecioUnitario(productoModificar.getPrecioUnitario());
                producto.setProveedor(productoModificar.getProveedor());                
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
