package Modelo;

import java.util.Date;

/**
 * Objeto Matrícula
 * @author daniel
 */
public class Matricula 
{
    //Define las variables
    private Estudiante estudiante;
    private Curso curso;
    private Date fecha;

    //Método Constructor: Set a todas las Variables
    public Matricula(Estudiante estudiante, Curso curso, Date fecha)
    {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fecha = fecha;
    }
    
    /**
     * @return the estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    //Devuelve un String con toda la información
    public void getInfo()
    {
        int dia = fecha.getDay();
        int mes = fecha.getMonth();
        int año = fecha.getYear();
        
        String infoFecha = "Fecha: "+dia+"/"+mes+"/"+año;
        
        String infoEstudiante = "Estudiante: "+estudiante.getInfo();
        
        String infoCurso = "Curso: "+curso.getInfo();
        
        String info = ""+infoFecha+"\n"+infoEstudiante+"\n"+infoCurso;
    }
}
