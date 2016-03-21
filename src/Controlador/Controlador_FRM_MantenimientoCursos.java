/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Controlador_FRM_MantenimientoCursos implements ActionListener
{
    MetodosCursos metodos;
    FRM_MantenimientoCursos mantenimientoCursos;
    
    public Controlador_FRM_MantenimientoCursos(FRM_MantenimientoCursos mantenimientoCursos) 
    {
        this.mantenimientoCursos = mantenimientoCursos;
        metodos = new MetodosCursos();
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
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
            JOptionPane.showMessageDialog(null, metodos.getTodos());
            System.out.println("Todos");
        }
    }
}
