/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author daniel
 */
public class Curso {
    
    private String nombre;
    private String siglas;
    private int creditos;

    public Curso(String siglas, String nombre, int creditos)
    {
        this.nombre = nombre;
        this.siglas = siglas;
        this.creditos = creditos;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the siglas
     */
    public String getSiglas() {
        return siglas;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param siglas the siglas to set
     */
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public String getInfo()
    {
        String info = "Siglas: "+siglas+" - Nombre: "+nombre+" - Créditos: "+creditos;
        
        return info;
    }
    
}
