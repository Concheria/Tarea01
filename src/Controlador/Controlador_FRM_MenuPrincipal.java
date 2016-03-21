/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_MantenimientoCursos;
import Vista.FRM_MantenimientoEstudiantes;
import Vista.FRM_Matriculas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author estudiante
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener 
{
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    FRM_MantenimientoCursos mantenimientoCursos;
    FRM_Matriculas matriculas;
    
    public Controlador_FRM_MenuPrincipal()
    {
        mantenimientoCursos = new FRM_MantenimientoCursos();
        mantenimientoEstudiantes = new FRM_MantenimientoEstudiantes();
        matriculas = new FRM_Matriculas();
    }
    
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
            this.matriculas.setVisible(true);
            System.out.println("Matriculas");
        }
    }
}
