package Controlador;

import Modelo.Curso;
import Modelo.Estudiante;
import Vista.FRM_MantenimientoCursos;
import Vista.FRM_MantenimientoEstudiantes;
import Vista.FRM_Matriculas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Método controlador del Menú Principal
 * @author daniel
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener 
{
    //Define Frames y Objetos
    //Nota: Los arrays de Cursos y estudiantes viajan por la aplicación para poder sincronizarse al matricular un estudiante
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    FRM_MantenimientoCursos mantenimientoCursos;
    FRM_Matriculas matriculas;
    ArrayList <Curso> arrayCursos;
    ArrayList <Estudiante> arrayEstudiantes;
    
    //Método Constructor
    //Crea los Frames
    public Controlador_FRM_MenuPrincipal()
    {
        mantenimientoCursos = new FRM_MantenimientoCursos();
        mantenimientoEstudiantes = new FRM_MantenimientoEstudiantes();
        matriculas = new FRM_Matriculas();
    }
    
    //Metodo setArrays()
    //Pide los objetos desde los métodos hacia arriba, creando una reacción en cadena que devuelve los objetos
    public void setArrays()
    {
        arrayEstudiantes = mantenimientoEstudiantes.getArrayEstudiantes();
        arrayCursos = mantenimientoCursos.getArrayCursos();
    }
    
    //Método sendArrays
    //Envía los objetos al frame de matrículas, creando una reacción en cadena
    public void sendArrays()
    {
        setArrays();
        matriculas.setArrays(arrayCursos, arrayEstudiantes);
    }
    
    //Método Escucha: Interactúa con los botones
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        if(e.getActionCommand().equals("Estudiantes"))
        {
            this.mantenimientoEstudiantes.setVisible(true);
        }
        if(e.getActionCommand().equals("Cursos"))
        {
            this.mantenimientoCursos.setVisible(true);
            System.out.println("Presionó el Menú Cursos");
        }
        if(e.getActionCommand().equals("Matriculas"))
        {
            sendArrays();
            this.matriculas.setVisible(true);
            System.out.println("Matriculas");
        }
    }
}