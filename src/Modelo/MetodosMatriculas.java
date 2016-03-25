package Modelo;

import java.util.ArrayList;

/**
 * Métodos del Frame de Matrículas
 * @author daniel
 */
public class MetodosMatriculas 
{   
    //Define todos los Arrays: el de Estudiantes, el de Cursos y el de Matrículas
    ArrayList <Estudiante> arrayEstudiantes;
    ArrayList <Curso> arrayCursos;
    ArrayList <Matricula> arrayMatricula;
    
    //Set de los tres Arrays
    public void setArrays(ArrayList <Curso> arrayCursos, ArrayList <Estudiante> arrayEstudiantes)
    {
        this.arrayCursos = arrayCursos;
        this.arrayEstudiantes = arrayEstudiantes;
    }
}
