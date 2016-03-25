package Controlador;

import Modelo.Curso;
import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Controlador del Frame de Cursos: Controla las interacciones con el Usuario
 * @author Daniel Somarribas - b57072
 */
public class Controlador_FRM_MantenimientoCursos implements ActionListener
{
    //Define los objetos necesarios: El Frame, los métodos, y el ArrayList de Cursos
    MetodosCursos metodos;
    FRM_MantenimientoCursos mantenimientoCursos;
    ArrayList <Curso> arrayCursos;

   //Método Constructor: Define el Frame con el que interactúa y crea la instancia de los métodos
    public Controlador_FRM_MantenimientoCursos(FRM_MantenimientoCursos mantenimientoCursos) 
    {
        this.mantenimientoCursos = mantenimientoCursos;
        metodos = new MetodosCursos();
    }
    
    //Set del ArrayList de Cursos
    public void setArrayCursos()
    {
        arrayCursos = metodos.getArrayCursos();
    }
    
    //Devuelve el ArrayList de Cursos
    public ArrayList <Curso> getArrayCursos()
    {
        setArrayCursos();
        return arrayCursos;
    }

    //Método Escucha: Interactúa con los botones
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            /**
             * Funcionamiento:
             * 1. Obtiene las Siglas escritas
             * 2. En el objeto de Métodos, busca si existen, si no existen manda un mensaje de error
             * 3. Si existen, busca el objeto del ArraList con las siglas y devuelve la información de ese objeto
             * 4. Llena los campos con la información en el Frame
             */
            if(metodos.buscarSiglas(mantenimientoCursos.getSiglasEscritas()) != null)
            {
                String siglasEncontradas = metodos.getSiglasBuscadas(metodos.buscarSiglas(mantenimientoCursos.getSiglasEscritas()));
                System.out.println("Siglas Encontradas: "+siglasEncontradas);
                
                String nombreEncontrado = metodos.getNombreBuscado(metodos.buscarSiglas(mantenimientoCursos.getSiglasEscritas()));
                System.out.println("Nombre Encontrado: "+nombreEncontrado);
                
                int creditosEncontrados = metodos.getCreditosBuscados(metodos.buscarSiglas(mantenimientoCursos.getSiglasEscritas()));
                System.out.println("Cŕeditos Encontrados: "+creditosEncontrados);
                
                mantenimientoCursos.fillFields(siglasEncontradas, nombreEncontrado, creditosEncontrados);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se ha encontrado ningún curso con las siglas");
            }
            System.out.println("Buscar");
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            /**
             * Funcionamiento:
             * 1. Busca las siglas, si ya están puestas, manda un mensaje de error
             * 2. Si no están puestos, lo agrega al ArrayList
             * 3. Limpia los campos
             */
            if(metodos.buscarSiglas(mantenimientoCursos.getSiglasEscritas()) != null)
            {
                JOptionPane.showMessageDialog(null, "Las siglas ingresada ya están en uso");
            }
            else
            {
                metodos.agregarCurso(mantenimientoCursos.getInformacionEscrita());
                mantenimientoCursos.clearFields();
            }
            System.out.println("Agregar");
        }
        if(e.getActionCommand().equals("Todos"))
        {
            //Muestra una lista con todos los cursos ingresados
            JOptionPane.showMessageDialog(null, metodos.getTodos());
            System.out.println("Todos");
        }
    }
}