package Modelo;

import java.util.ArrayList;

/**
 * Métodos del Frame de Estudiantes
 * @author Daniel Somarribas - b57072
 */
public class MetodosEstudiantes 
{
    //Define el ArrayList de Estudiantes
    ArrayList <Estudiante> arrayEstudiantes;
    
    //Método Constructor: Crea el ArrayList de Estudiantes
    public MetodosEstudiantes()
    {
        arrayEstudiantes=new ArrayList <Estudiante>();
    }
    
    //Devuelve el ArrayList de Estudiantes
    public ArrayList <Estudiante> getArrayEstudiantes()
    {
        return arrayEstudiantes;
    }
    
    //Añade un nuevo Estudiante al ArrayList
    public void agregarEstudiante(String informacion[])
    {
        Estudiante temporal=new Estudiante(informacion[0], informacion[1], informacion[2]);
        System.out.println("Estudiante creado: "+temporal.getInfo());
        arrayEstudiantes.add(temporal);
    }
    
    //Usa un Ciclo For para repasar el ArrayList de Estudiantes en busca de una Cédula
    //Devuelve un objeto Estudiante
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
    
    //Devuelve la cédula del Estudiante buscado
    public String getCedulaBuscada(Estudiante eTemp)
    {
        String cedula = eTemp.getCedula();
        
        return cedula;
    }
    
    //Devuelve el nombre del Estudiante buscado
    public String getNombreBuscado(Estudiante eTemp)
    {
        String nombre = eTemp.getNombre();
        
        return nombre;
    }
    
    //Devuelve la dirección del Estudiante buscado
    public String getDireccionBuscada(Estudiante eTemp)
    {
        String direccion = eTemp.getDireccion();
        
        return direccion;
    }
    
    //Devuelve un String con todos los estudiantes registrados usando un Ciclo For
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
    
    /**
     * Elimina al Estudiante
     * @param cedula
     * 
     * Funcionamiento:
     * 1. Recibe la cédula del estudiante
     * 2. Usa un Ciclo For para recorrer el ArrayList de Estudiantes en busca de esa cédula
     * 3. Elimina al Estudiante de la posición encontrada
     * 
     * Nota: (Se sabe que el Estudiante existe porque ya está confirmado desde el controlador)
     */
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
}
