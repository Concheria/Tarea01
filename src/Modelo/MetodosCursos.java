/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class MetodosCursos 
{
    ArrayList <Curso> arrayCursos;
    
    public MetodosCursos()
    {
        arrayCursos = new ArrayList <Curso>();
    }
    
    public void agregarCurso(String informacion[])
    {
        Curso temporal = new Curso(informacion[0],informacion[1],Integer.parseInt(informacion[2]));
        System.out.println("Curso creado: "+temporal.getInfo());
        arrayCursos.add(temporal);
    }
    
    public Curso buscarSiglas(String siglas)
    {
        System.out.println("Buscando Siglas");
        
        Curso cursoDesdeSiglas = null;
        
        for(int i=0; i < arrayCursos.size(); i++)
        {
            if(arrayCursos.get(i).getSiglas().equals(siglas))
            {
                System.out.println("Siglas Encontradas!");

                cursoDesdeSiglas = arrayCursos.get(i);
                
                i = arrayCursos.size();
            }
        }        
        return cursoDesdeSiglas;
    }
    
    public String getSiglasBuscadas(Curso cTemp)
    {
        String siglas = cTemp.getSiglas();
        
        return siglas;
    }
    
    public String getNombreBuscado(Curso cTemp)
    {
        String nombre = cTemp.getNombre();
        
        return nombre;
    }
    
    public int getCreditosBuscados(Curso cTemp)
    {
        int creditos = cTemp.getCreditos();
        
        return creditos;
    }
    
    public String getTodos()
    {
        String lista = "Estudiantes Registrados:\n\n";
        
        for(int i=0; i < arrayCursos.size(); i++)
        {
            if(arrayCursos.get(i).getSiglas() != null && arrayCursos.get(i).getSiglas() != "")
            {
                lista+= ""+(i+1)+". "+arrayCursos.get(i).getInfo()+"\n";
            }
        }
        
        return lista;
    }
}
