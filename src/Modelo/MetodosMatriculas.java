/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class MetodosMatriculas 
{   
    ArrayList <Estudiante> arrayEstudiantes;
    ArrayList <Curso> arrayCursos;
    ArrayList <Matricula> arrayMatricula;
    
    public void setArrays(ArrayList <Curso> arrayCursos, ArrayList <Estudiante> arrayEstudiantes)
    {
        this.arrayCursos = arrayCursos;
        this.arrayEstudiantes = arrayEstudiantes;
    }
}
