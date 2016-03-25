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
    private int dia;
    private int mes;
    private int anio;

    //Método Constructor: Set a todas las Variables
    public Matricula(Estudiante estudiante, Curso curso)
    {
        this.estudiante = estudiante;
        this.curso = curso;
        fecha = new Date();
        this.dia = fecha.getDay();
        this.mes = fecha.getMonth();
        this.anio = fecha.getYear();
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
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
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
    public void setFecha() {
        fecha = new Date();
    }
        
    /**
     * @param dia the dia to set
     */
    public void setDia() {
        setFecha();
        this.dia = fecha.getDay();
    }
    
    /**
     * @param mes the mes to set
     */
    public void setMes() {
        fecha = new Date();
        this.mes = fecha.getMonth();
    }
    
    /**
     * @param anio the anio to set
     */
    public void setAnio()
    {
        fecha = new Date();
        this.anio = fecha.getYear();
    }
    
    //Devuelve un String con toda la información
    public String getInfo()
    {       
        String infoFecha = "Fecha: "+dia+"/"+mes+"/"+anio;
        
        String infoEstudiante = "Estudiante: "+estudiante.getInfo();
        
        String infoCurso = "Curso: "+curso.getInfo();
        
        String info = ""+infoFecha+"\n"+infoEstudiante+"\n"+infoCurso;
        
        return info;
    }
}