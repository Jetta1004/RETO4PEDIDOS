package Controller;

import Classes.clsCliente;
import Model.ModelCliente;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class ctlCliente {
    
    //ESTE ATRIBUTO REPRESENTA LA CONEXION DE LA CAPA CONTROLADORA A LA MODELO
    ModelCliente modelCliente;

    
    //SE INSTANCIA EL MODELO POR MEDIO DEL OBJETO POR MEDIO DEL CUAL TIENE ACCESO OFICIALMENTE A LA CAPA MODELO
    public ctlCliente() {
        modelCliente = new ModelCliente();
    }

    /* SE INDICAN TODOS LOS METODOS CRUD, DONDE SE PROCESA LA INFORMACION QUE LLEGA
    COMO PARAMETROS DESDE LA CAPA VIEW, SE CREAN LOS OBJETOS (SE PROCESA LA INFORMACION)
    Y POSTERIORMENTE SE INVOCA LA CAPA MODELO 
    */
    
    //METODO CRUD CREAR
    public boolean crear(String idCliente, String fechaNacimiento, int cantidadCompras,
            boolean fidelizacion, String tipoDocumento, String numeroDocumento,
            String nombre, String direccion, String ciudad, String departamento,
            String telefono, String email, List<clsCliente> listaCliente) {
        clsCliente cliente = new clsCliente(idCliente, fechaNacimiento, cantidadCompras,
                fidelizacion, tipoDocumento, numeroDocumento, nombre, direccion, ciudad,
                departamento, telefono, email);
        return modelCliente.crear(cliente, listaCliente);
    }

    //METODO CRUD BUSCAR
        public clsCliente leer(String numeroDocumento, List<clsCliente> listaCliente) {
        return modelCliente.leer(numeroDocumento, listaCliente);
        }

    //METODO ACTUALIZAR
    public boolean actualizar(String idCliente, String fechaNacimiento, int cantidadCompras,
            boolean fidelizacion, String tipoDocumento, String numeroDocumento,
            String nombre, String direccion, String ciudad, String departamento,
            String telefono, String email, List<clsCliente> listaCliente) {
        clsCliente cliente = new clsCliente(idCliente, fechaNacimiento, cantidadCompras,
                fidelizacion, tipoDocumento, numeroDocumento, nombre, direccion, ciudad,
                departamento, telefono, email);
        return modelCliente.actualizar(cliente, listaCliente);
    }

    //METODO BORRAR
    public boolean delete(String numeroDocumento, List<clsCliente> listaClientes) {
        return ModelCliente.delete(numeroDocumento, listaClientes);
    }
}
