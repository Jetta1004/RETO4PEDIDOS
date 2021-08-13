package Classes;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author JENNY TATIANA HENAO ARIAS GRUPO 52
 */
public class clsCliente extends clsPersona {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private String idCliente;
    private String fechaNacimiento;
    private int cantidadCompras;
    private boolean fidelizacion;

    //METODO CONSTRUCTOR
    public clsCliente(String idCliente, String fechaNacimiento, int cantidadCompras, boolean fidelizacion, String tipoDocumento, String numeroDocumento, String nombre, String direccion, String ciudad, String departamento, String telefono, String email) {
        super(tipoDocumento, numeroDocumento, nombre, direccion, ciudad, departamento, telefono, email);
        this.idCliente = idCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.cantidadCompras = cantidadCompras;
        this.fidelizacion = fidelizacion;
    }

    //METODO CONSTRUCTOR BD PARA PRUEBA
    public clsCliente(String idCliente, String nombre, String tipoDocumento, String numeroDocumento,
            String direccion, String ciudad, String departamento,
            String telefono, String email, String fechaNacimiento) {
        super(tipoDocumento, numeroDocumento, nombre, direccion, ciudad, departamento, telefono, email);
        this.idCliente = idCliente;
        this.fechaNacimiento = fechaNacimiento;
    }

    public clsCliente() {
        throw new UnsupportedOperationException(); 

      
       
    //SOBREESCRIBIR
    @Override
    public String toString() {
        return "Id Cliente:  " + getIdCliente() + " "
                + "Tipo Documento:  " + getTipoDocumento() + " "
                + "Numero Documento:  " + super.getNumeroDocumento() + " "
                + "Nombre:  " + super.getNombre() + " "
                + "Direccion:  " + super.getDireccion() + " "
                + "Ciudad:  " + super.getCiudad() + " "
                + "Departamento:  " + super.getDepartamento() + " "
                + "Telefono:  " + super.getTelefono() + " "
                + "Email:  " + super.getEmail() + " "
                + "Fidelización:  " + isFidelizacion() + " ";
    }

    //METODOS ACCESORES Y MUTADORES
    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the cantidadCompras
     */
    public int getCantidadCompras() {
        return cantidadCompras;
    }

    /**
     * @param cantidadCompras the cantidadCompras to set
     */
    public void setCantidadCompras(int cantidadCompras) {
        this.cantidadCompras = cantidadCompras;
    }

    /**
     * @return the fidelizacion
     */
    public boolean isFidelizacion() {
        return fidelizacion;
    }

    //FIDELIZACION CLIENTES
    public void setFidelizacion(boolean fidelizacion) {
        this.fidelizacion = fidelizacion;
    }

    public void aplicarFidelizacion() {
        // Obtienes el mes actual
        Month mes = LocalDate.now().getMonth();

        // Obtienes el nombre del mes
        String nombre = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

        if ((this.cantidadCompras >= 100) && (this.fechaNacimiento.toLowerCase().contains(nombre.toLowerCase())))
        {
            this.fidelizacion = true;
        }
    }

}
