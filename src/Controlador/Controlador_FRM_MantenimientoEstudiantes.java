/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Controlador_FRM_MantenimientoEstudiantes implements ActionListener
{
    MetodosEstudiantes metodos;
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    
    public Controlador_FRM_MantenimientoEstudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiantes)
    {
        this.mantenimientoEstudiantes = mantenimientoEstudiantes;
        metodos = new MetodosEstudiantes();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
            System.out.println("Presionado Buscar");
            if(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()) != null)
            {
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
            }
            System.out.println("Buscar");
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            if(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()) != null)
            {
                JOptionPane.showMessageDialog(null, "La cédula ingresada ya está en uso");
            }
            else
            {
                metodos.agregarEstudiante(mantenimientoEstudiantes.getInformacionEscrita());
                mantenimientoEstudiantes.clearFields();
            }
            System.out.println("Agregar");
        }
        if(e.getActionCommand().equals("Modificar"))
        {            
            if(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()) != null)
            {
                metodos.eliminarEstudiante(mantenimientoEstudiantes.getCedulaEscrita());
                metodos.agregarEstudiante(mantenimientoEstudiantes.getInformacionEscrita());
                JOptionPane.showMessageDialog(null, "El estudiante se ha modificado");
                mantenimientoEstudiantes.clearFields();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La cédula ingresada no está en uso");
            }            
            System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
             if(metodos.buscarCedula(mantenimientoEstudiantes.getCedulaEscrita()) != null)
            {
                metodos.eliminarEstudiante(mantenimientoEstudiantes.getCedulaEscrita());
                JOptionPane.showMessageDialog(null, "Se ha eliminado el estudiante");
                mantenimientoEstudiantes.clearFields();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La cédula ingresada no está en uso");
            }            
            System.out.println("Eliminar");
        }
        if(e.getActionCommand().equals("Todos"))
        {
            JOptionPane.showMessageDialog(null, metodos.getTodos());
            System.out.println("Todos");
        }
    }
}
