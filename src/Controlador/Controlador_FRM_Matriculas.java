/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosMatriculas;
import Vista.FRM_Matriculas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author daniel
 */
public class Controlador_FRM_Matriculas implements ActionListener
{
    MetodosMatriculas metodos;
    FRM_Matriculas matriculas;
    
    public Controlador_FRM_Matriculas(FRM_Matriculas matriculas)
    {
        this.matriculas = matriculas;
        metodos = new MetodosMatriculas();
    }
    
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
    }
}
