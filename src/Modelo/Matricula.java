/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author daniel
 */
public class Matricula 
{
    private Estudiante estudiante;
    private Curso curso;
    private Date fecha;

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
