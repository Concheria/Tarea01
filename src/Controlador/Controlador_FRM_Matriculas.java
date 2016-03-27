package Controlador;

import Modelo.Curso;
import Modelo.Estudiante;
import Modelo.MetodosMatriculas;
import Vista.FRM_Matriculas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
            if((metodos.getEstudianteGuardado() != null) && (metodos.getCursoGuardado() != null))
            {
                metodos.matricularEstudiante(metodos.getEstudianteGuardado(), metodos.getCursoGuardado());
                metodos.limpiarGuardados();
                matriculas.clearFields();
            }
            else
            {
                if((metodos.getEstudianteGuardado() == null) && (metodos.getCursoGuardado() == null))
                {
                    JOptionPane.showMessageDialog(null, "No ha ingresado ninguna información!");
                }
                else
                {
                    if(metodos.getEstudianteGuardado() == null)
                    {
                        JOptionPane.showMessageDialog(null, "No ha ingresado ningún estudiante!");
                    }
                    if(metodos.getCursoGuardado() == null)
                    {
                        JOptionPane.showMessageDialog(null, "No ha ingresado ningún curso!");
                    }
                }
            }
            System.out.println("Matricular");
        }
        if(e.getActionCommand().equals("BuscarEstudiantes"))
        {/**
             * Funcionamiento:
             * 1. Obtiene la Cédula escrita
             * 2. En el objeto de Métodos, busca si existe, si no existen manda un mensaje de error
             * 3. Si existen, busca el objeto del ArraList con la cédula y devuelve la información de ese objeto
             * 4. Llena los campos con la información en el Frame
             */
            System.out.println("Presionado Buscar");
            if(metodos.buscarCedula(matriculas.getCedulaEscrita()) != null)
            {
                String cedulaEncontrada = metodos.getCedulaBuscada(metodos.buscarCedula(matriculas.getCedulaEscrita()));
                System.out.println("Cedula Encontrada: "+cedulaEncontrada);
                
                String nombreEncontrado = metodos.getNombreBuscado(metodos.buscarCedula(matriculas.getCedulaEscrita()));
                System.out.println("Nombre Encontrado: "+nombreEncontrado);
                
                String direccionEncontrada = metodos.getDireccionBuscada(metodos.buscarCedula(matriculas.getCedulaEscrita()));
                System.out.println("Direccion Encontrada: "+direccionEncontrada);
                                
                metodos.setEstudianteGuardado((metodos.buscarCedula(matriculas.getCedulaEscrita())));
                
                matriculas.fillFieldsEstudiantes(cedulaEncontrada, nombreEncontrado, direccionEncontrada);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se ha encontrado ningún estudiante con la cédula");
            }
            System.out.println("Buscar Estudiantes");
        }
        if(e.getActionCommand().equals("BuscarCursos"))
        {
            /**
             * Funcionamiento:
             * 1. Obtiene las Siglas escritas
             * 2. En el objeto de Métodos, busca si existen, si no existen manda un mensaje de error
             * 3. Si existen, busca el objeto del ArraList con las siglas y devuelve la información de ese objeto
             * 4. Llena los campos con la información en el Frame
             */
            if(metodos.buscarSiglas(matriculas.getSiglasEscritas()) != null)
            {
                String siglasEncontradas = metodos.getSiglasBuscadas(metodos.buscarSiglas(matriculas.getSiglasEscritas()));
                System.out.println("Siglas Encontradas: "+siglasEncontradas);
                
                String nombreEncontrado = metodos.getNombreBuscado(metodos.buscarSiglas(matriculas.getSiglasEscritas()));
                System.out.println("Nombre Encontrado: "+nombreEncontrado);
                
                int creditosEncontrados = metodos.getCreditosBuscados(metodos.buscarSiglas(matriculas.getSiglasEscritas()));
                System.out.println("Cŕeditos Encontrados: "+creditosEncontrados);
                                
                metodos.setCursoGuardado((metodos.buscarSiglas(matriculas.getSiglasEscritas())));
                
                matriculas.fillFieldsCursos(siglasEncontradas, nombreEncontrado, creditosEncontrados);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se ha encontrado ningún curso con las siglas");
            }
            System.out.println("Buscar Cursos");
        }
        if(e.getActionCommand().equals("LimpiarEstudiante"))
        {
            metodos.limpiarEstudiante();
            matriculas.clearFieldsEstudiantes();
        }
        if(e.getActionCommand().equals("LimpiarCurso"))
        {
            metodos.limpiarCurso();
            matriculas.clearFieldsCursos();
        }
        if(e.getActionCommand().equals("MostrarCursEst"))
        {
            if(metodos.getArrayMatriculas() != null)
            {
                JOptionPane.showMessageDialog(null,metodos.mostrarCursEst());
            }
            System.out.println("Mostrar Todos");
        }
    }
}
