/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Estudiante 
{
    private String cedula;
    private String nombre;
    private String direccion;

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
    
    public String getInfo()
    {
        String info = "Cedula: "+getCedula()+" - Nombre: "+getNombre()+" - Dirección: "+getDireccion();
        
        return info;
    }
}
