package Modelo;

/**
 * Objeto Estudiante
 * @author estudiante
 */
public class Estudiante 
{
    //Define las Variables:
    private String cedula;
    private String nombre;
    private String direccion;

    //Método Constructor: Set a todas las Variables
    public Estudiante(String cedula, String nombre, String direccion)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
     /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Devuelve un String con toda la información
    public String getInfo()
    {
        String info = "Cedula: "+getCedula()+" - Nombre: "+getNombre()+" - Dirección: "+getDireccion();
        
        return info;
    }
}
