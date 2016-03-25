package Controlador;

import Modelo.Curso;
import Modelo.Estudiante;
import Modelo.MetodosMatriculas;
import Vista.FRM_Matriculas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Controlador del Frame de Matrículas: Controla las interacciones con el Usuario
 * @author Daniel Somarribas - b57072
 */
public class Controlador_FRM_Matriculas implements ActionListener
{
    //Define los objetos necesarios: El Frame, los métodos, y los ArrayLists de Estudiantes y Cursos
    MetodosMatriculas metodos;
    FRM_Matriculas matriculas;
    ArrayList <Curso> arrayCursos;
    ArrayList <Estudiante> arrayEstudiantes;
    
    //Método Constructor: Define el Frame con el que interactúa y crea la instancia de los métodos
    public Controlador_FRM_Matriculas(FRM_Matriculas matriculas)
    {
        this.matriculas = matriculas;
        metodos = new MetodosMatriculas();
    }
    
    //Set de los ArrayLists de Cursos y Estudiantes
    public void setArrays(ArrayList<Curso> arrayCursos, ArrayList<Estudiante> arrayEstudiantes) 
    {
        this.arrayCursos = arrayCursos;
        this.arrayEstudiantes = arrayEstudiantes;
        sendArrays();    }
    
    //Envía los ArrayLists a los métodos
    public void sendArrays()
    {
        metodos.setArrays(arrayCursos, arrayEstudiantes);
    }
    
    //Método Escucha: Interactúa con los botones
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Matricular"))
        {
            System.out.println("Matricular");
        }
        if(e.getActionCommand().equals("BuscarEstudiantes"))
        {
            System.out.println("Buscar Estudiantes");
        }
        if(e.getActionCommand().equals("BuscarCursos"))
        {
            System.out.println("Buscar Cursos");
        }
        if(e.getActionCommand().equals("Todos"))
        {
            System.out.println("Mostrar Todos");
        }
    }
}
