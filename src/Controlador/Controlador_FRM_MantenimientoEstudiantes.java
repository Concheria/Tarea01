package Controlador;

import Modelo.Estudiante;
import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Controlador del Frame de Estudiantes: Controla las interacciones con el Usuario
 * @author Daniel Somarribas - b57072
 */
public class Controlador_FRM_MantenimientoEstudiantes implements ActionListener
{
    //Define los objetos necesarios: El Frame, los métodos, y el ArrayLists de Estudiantes
    MetodosEstudiantes metodos;
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    ArrayList <Estudiante> arrayEstudiantes;
    
    //Método Constructor: Define el Frame con el que interactúa y crea la instancia de los métodos
    public Controlador_FRM_MantenimientoEstudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiantes)
    {
        this.mantenimientoEstudiantes = mantenimientoEstudiantes;
        metodos = new MetodosEstudiantes();
    }
    
    //Set del ArrayList de Estudiantes
    public void setArrayEstudiantes()
    {
        arrayEstudiantes = metodos.getArrayEstudiantes();
    }
    
    //Devuelve el ArrayList de Estudiantes
    public ArrayList <Estudiante> getArrayEstudiantes()
    {
        setArrayEstudiantes();
        return arrayEstudiantes;
    }
    
    //Método Escucha: Interactúa con los botones
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            buscar();
            System.out.println("Buscar");
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            /**
             * Funcionamiento:
             * 1. Busca la cédula, si ya está puesta, manda un mensaje de error
             * 2. Si no está puesta, lo agrega al ArrayList
             * 3. Limpia los campos
             */
            if(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()) != null)
            {
                JOptionPane.showMessageDialog(null, "La cédula ingresada ya está en uso");
            }
            else
            {
                metodos.agregarEstudiante(mantenimientoEstudiantes.getInformacionEscrita());
                mantenimientoEstudiantes.clearFields();
                mantenimientoEstudiantes.configInic();
            }
            System.out.println("Agregar");
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            /**
             * Funcionamiento:
             * 1. Busca la cédula, si no está puestas, manda un mensaje de error
             * 2. Si ya está puesta
             * a. Elimina al estudiante
             * b. Añade un nuevo estudiante
             * 3. Limpia los campos
             */            
            if(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()) != null)
            {
                metodos.eliminarEstudiante(mantenimientoEstudiantes.getCedulaEscrita());
                metodos.agregarEstudiante(mantenimientoEstudiantes.getInformacionEscrita());
                JOptionPane.showMessageDialog(null, "El estudiante se ha modificado");
                mantenimientoEstudiantes.clearFields();
                mantenimientoEstudiantes.configInic();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La cédula ingresada no está en uso");
            }
            System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            /**
             * Funcionamiento:
             * 1. Busca la cédula, si no está puesta, manda un mensaje de error
             * 2. Si ya está puesta, elimina al estudiante
             * 3. Limpia los campos
             */
            if(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()) != null)
            {
                metodos.eliminarEstudiante(mantenimientoEstudiantes.getCedulaEscrita());
                JOptionPane.showMessageDialog(null, "Se ha eliminado el estudiante");
                mantenimientoEstudiantes.clearFields();
                mantenimientoEstudiantes.configInic();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La cédula ingresada no está en uso");
            }
            System.out.println("Eliminar");
        }
        if(e.getActionCommand().equals("Todos"))
        {
            //Muestra una lista con todos los estudiantes ingresados
            JOptionPane.showMessageDialog(null, metodos.getTodos());
            System.out.println("Todos");
        }
    }
    
    /**
     * Funcionamiento:
     * 1. Obtiene la Cédula escrita
     * 2. En el objeto de Métodos, busca si existe, si no existen manda un mensaje de error
     * 3. Si existen, busca el objeto del ArraList con la cédula y devuelve la información de ese objeto
     * 4. Llena los campos con la información en el Frame
     */
    public void buscar()
    {
        if(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()) != null)
        {
            mantenimientoEstudiantes.configBusc();
            String cedulaEncontrada = metodos.getCedulaBuscada(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()));
            System.out.println("Cedula Encontrada: "+cedulaEncontrada);
            
            String nombreEncontrado = metodos.getNombreBuscado(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()));
            System.out.println("Nombre Encontrado: "+nombreEncontrado);
            
            String direccionEncontrada = metodos.getDireccionBuscada(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()));
            System.out.println("Direccion Encontrada: "+direccionEncontrada);
            
            mantenimientoEstudiantes.fillFields(cedulaEncontrada, nombreEncontrado, direccionEncontrada);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningún estudiante con la cédula");
            mantenimientoEstudiantes.configAgreg();
        }
    }
}