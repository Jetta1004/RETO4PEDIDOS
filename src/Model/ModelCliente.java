package Model;

import Classes.clsCliente;
import java.util.List;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */


public class ModelCliente {
    //CREAR
    public boolean crear(clsCliente cliente, List<clsCliente> listaCliente) {
        //SE AGREGA EL CLIENTE A LA LISTA DE CLIENTES
        listaCliente.add(cliente);
        return true;
    }
    
    //BUSCAR
    public clsCliente leer(String numeroDocumento, List<clsCliente> listaCliente) {
               
        //AL BUSCAR SE TRAE TODA LA INFO DEL CLIENTE 
        for (clsCliente cliente : listaCliente)
        {
            if (cliente.getNumeroDocumento().equals(numeroDocumento))
            {
                clsCliente ClienteEncontrado = new clsCliente(
                        cliente.getIdCliente(),
                        cliente.getFechaNacimiento(),
                        0, //CANTIDAD DE COMPRAS 
                        cliente.isFidelizacion(),
                        cliente.getTipoDocumento(),
                        cliente.getNumeroDocumento(),
                        cliente.getNombre(),
                        cliente.getDireccion(),
                        cliente.getCiudad(),
                        cliente.getDepartamento(),
                        cliente.getTelefono(),
                        cliente.getEmail());
                return ClienteEncontrado;
            }
        }
        return null;
    }
    
    //ACTUALIZAR
    public boolean actualizar(clsCliente clienteNuevo, List<clsCliente> listaClientes) {
        for (clsCliente cliente : listaClientes)
        {
            //SI ENCUENTRA EL CLIENTE A ACTUALIZAR, SOBREESCRIBE TODOS SUS ATRIBUTOS
            if (clienteNuevo.getIdCliente().equals(clienteNuevo.getIdCliente()))
            {
                //ESTO SE REALIZA A TRAVEZ DE LOS METODOS MUTADORES DE CLIENTE
                cliente.setIdCliente(clienteNuevo.getIdCliente());
                cliente.setFechaNacimiento(clienteNuevo.getFechaNacimiento());
                cliente.setTipoDocumento(clienteNuevo.getTipoDocumento());
                cliente.setNumeroDocumento(clienteNuevo.getNumeroDocumento());
                cliente.setNombre(clienteNuevo.getNombre());
                cliente.setDireccion(clienteNuevo.getDireccion());
                cliente.setCiudad(clienteNuevo.getCiudad());
                cliente.setDepartamento(clienteNuevo.getDepartamento());
                cliente.setTelefono(clienteNuevo.getTelefono());
                cliente.setEmail(clienteNuevo.getEmail());
                cliente.setFidelizacion(clienteNuevo.isFidelizacion());
                return true;
            }
        }
        return false;
    }
    
    //BORRAR
    public static boolean delete(String numeroDocumento, List<clsCliente> listaClientes) {
        //Recorremos lista de los clientes para buscar la cédula (id) indicada por parte del usuario.
        for (clsCliente cliente : listaClientes)
        {
            if (cliente.getNumeroDocumento().equals(numeroDocumento))
            {
                //SE ELIMINA EL CLIENTE ENCONTRADO
                listaClientes.remove(cliente);

                return true;
            }
        }
        return false;
    }
}
