package Modelo;

import java.util.ArrayList;

/**
 * Métodos del Frame de Matrículas
 * @author daniel
 */
public class MetodosMatriculas 
{   
    //Define todos los Arrays: el de Estudiantes, el de Cursos y el de Matrículas
    ArrayList <Estudiante> arrayEstudiantes;
    ArrayList <Curso> arrayCursos;
    ArrayList <Matricula> arrayMatriculas;
    
    Estudiante estudianteGuardado;
    Curso cursoGuardado;
    
    //Método Constructor
    public MetodosMatriculas()
    {
        arrayMatriculas = new ArrayList <Matricula>();
    }
    
    //Set de los tres Arrays
    public void setArrays(ArrayList <Curso> arrayCursos, ArrayList <Estudiante> arrayEstudiantes)
    {
        this.arrayCursos = arrayCursos;
        this.arrayEstudiantes = arrayEstudiantes;
        System.out.println("Arrays Actualizados en Matrícula!");
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
    
    //Añade el objeto Matricula al ArrayList de Matriculas
    public void matricularEstudiante(Estudiante estudiante, Curso curso)
    {
        Matricula temporal = new Matricula(estudiante, curso);
        System.out.println("Estudiante Matriculado: "+temporal.getInfo());
        arrayMatriculas.add(temporal);
    }

    /**
     * Muestra el Estudiante ingresado y sus cursos
     * @return the Cursos para el Estudiante
     */
    public String mostrarCursEst()
    {
        Estudiante estudianteCiclo = estudianteGuardado;
        String info = "Estudiante:\n";
        info = ""+estudianteGuardado.getInfo()+"\n\nCursos:\n";
        int numCurso = 1;
        for(int i=0; i<arrayMatriculas.size();i++)
        {
            if(arrayMatriculas.get(i).getEstudiante() == estudianteCiclo)
            {
                info +=""+numCurso+". "+arrayMatriculas.get(i).getCurso().getInfo()+"\n";
                numCurso++;
            }
        }
        numCurso = 1;
        estudianteCiclo = null;
        return info;
    }
    
    //Guarda el Estudiante buscado (Se envía el objeto desde el controlador)
    public void setEstudianteGuardado(Estudiante estudianteGuardado)
    {
        this.estudianteGuardado = estudianteGuardado;
    }
    
    //Guarda el Curso buscado (Se envía el objeto desde el controlador)
    public void setCursoGuardado(Curso cursoGuardado)
    {       
        this.cursoGuardado = cursoGuardado;
    }
    
    //Devuelve el Estudiante guardado
    public Estudiante getEstudianteGuardado()
    {
        return estudianteGuardado;
    }
    
    //Devuelve el Curso guardado
    public Curso getCursoGuardado()
    {
        return cursoGuardado;
    }
    
    //Limpia el objeto Estudiante guardado enviando un parámetro Null
    public void limpiarEstudiante()
    {
        setEstudianteGuardado(null);
    }
    
    //Limpia el objeto Curso guardado enviando un parámetro Null
    public void limpiarCurso()
    {
        setCursoGuardado(null);
    }
    
    //Limpia los objetos Estudiante y Curso guardados enviandoles un párametro Null
    public void limpiarGuardados()
    {
        setEstudianteGuardado(null);
        
        setCursoGuardado(null);
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
    
    //Devuelve el Array de Matriculas
    public ArrayList <Matricula> getArrayMatriculas()
    {
        return arrayMatriculas;
    }
}
