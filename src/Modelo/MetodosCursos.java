package Modelo;

import java.util.ArrayList;

/**
 * Métodos del Frame de Cursos
 * @author Daniel Somarribas - b57072
 */
public class MetodosCursos 
{
    //Define el ArrayList de Cursos
    ArrayList <Curso> arrayCursos;
    
    //Método Constructor: Crea el ArrayList de Cursos
    public MetodosCursos()
    {
        arrayCursos = new ArrayList <Curso>();
    }
    
    //Devuelve el ArrayList de Cursos
    public ArrayList <Curso> getArrayCursos()
    {
        return arrayCursos;
    }
    
    //Añade un nuevo Curso al ArrayList
    public void agregarCurso(String informacion[])
    {
        Curso temporal = new Curso(informacion[0],informacion[1],Integer.parseInt(informacion[2]));
        System.out.println("Curso creado: "+temporal.getInfo());
        arrayCursos.add(temporal);
    }
    
    //Usa un Ciclo For para repasar el ArrayList de Cursos en busca de unas Siglas
    //Devuelve un objeto Curso
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
    
    //Devuelve las siglas del Curso buscado
    public String getSiglasBuscadas(Curso cTemp)
    {
        String siglas = cTemp.getSiglas();
        
        return siglas;
    }
    
    //Devuelve el nombre del Curso buscado
    public String getNombreBuscado(Curso cTemp)
    {
        String nombre = cTemp.getNombre();
        
        return nombre;
    }
    
    //Devuelve los créditos del Curso buscado
    public int getCreditosBuscados(Curso cTemp)
    {
        int creditos = cTemp.getCreditos();
        
        return creditos;
    }
    
    //Devuelve un String con todos los cursos registrados usando un Ciclo For
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