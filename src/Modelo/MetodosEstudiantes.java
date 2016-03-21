/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class MetodosEstudiantes 
{
    ArrayList <Estudiante> arrayEstudiantes;
    
    public MetodosEstudiantes()
    {
        arrayEstudiantes=new ArrayList <Estudiante>();
    }
    
    public void agregarEstudiante(String informacion[])
    {
        Estudiante temporal=new Estudiante(informacion[0], informacion[1], informacion[2]);
        System.out.println("Estudiante creado: "+temporal.getInfo());
        arrayEstudiantes.add(temporal);
    }
    
    public Estudiante buscarCedula(String cedula)
    {
        System.out.println("Buscando Cedula");
        
        Estudiante estudianteDesdeCedula = null;
        
        for(int i=0; i < arrayEstudiantes.size(); i++)
        {
            if(arrayEstudiantes.get(i).getCedula().equals(cedula))
            {
                System.out.println("Cedula Encontrada!");

                estudianteDesdeCedula = arrayEstudiantes.get(i);
                
                i = arrayEstudiantes.size();
            }
        }        
        return estudianteDesdeCedula;
    }
    
    public String getCedulaBuscada(Estudiante eTemp)
    {
        String cedula = eTemp.getCedula();
        
        return cedula;
    }
    
    public String getNombreBuscado(Estudiante eTemp)
    {
        String nombre = eTemp.getNombre();
        
        return nombre;
    }
    
    public String getDireccionBuscada(Estudiante eTemp)
    {
        String direccion = eTemp.getDireccion();
        
        return direccion;
    }
    
    public String getTodos()
    {
        String lista = "Estudiantes Registrados:\n\n";
        
        for(int i=0; i < arrayEstudiantes.size(); i++)
        {
            if(arrayEstudiantes.get(i).getCedula() != null && arrayEstudiantes.get(i).getCedula() != "")
            {
                lista+= ""+(i+1)+". "+arrayEstudiantes.get(i).getInfo()+"\n";
            }
        }
        
        return lista;
    }
    
    public void eliminarEstudiante(String cedula)
    {
        int posicion = 0;
        Estudiante temp = null;
        
        for(int i=0; i < arrayEstudiantes.size(); i++)
        {
            if(arrayEstudiantes.get(i).getCedula().equals(cedula))
            {
                System.out.println("Cedula Encontrada!");

                posicion = i;
                
                temp = arrayEstudiantes.get(i);
                
                i = arrayEstudiantes.size();
            }
        }

        System.out.println("Eliminado: "+temp.getInfo());
                
        arrayEstudiantes.remove(posicion);
    }
    
    public void mostrarInformacionEstudiantes()
    {
        Estudiante temporal;
        temporal=arrayEstudiantes.get(0);
        System.out.println(temporal.getInfo());
    }
}
