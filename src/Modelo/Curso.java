package Modelo;

/**
 * Objeto Curso
 * @author daniel
 */
public class Curso 
{
    //Define las Variables:
    private String nombre;
    private String siglas;
    private int creditos;

    //Método Constructor: Set a todas las Variables
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
    
    //Devuelve un String con toda la información
    public String getInfo()
    {
        String info = "Siglas: "+siglas+" - Nombre: "+nombre+" - Créditos: "+creditos;
        
        return info;
    }
    
}
