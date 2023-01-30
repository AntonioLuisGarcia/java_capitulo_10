package ejerciciosExtra.extra1;

import java.util.ArrayList;
import java.util.HashMap;

public class Universidad {
    private HashMap<String,Estudiante> estudiantes;

    public Universidad(){
        this.estudiantes = new HashMap<>();
    }

    public void inscribirEstudiante(Estudiante e){
        
        if(estudiantes.containsKey(e.getMatricula())){
            System.out.println("Este alumno ya esta matriculado");
        }else{
            estudiantes.put(e.getMatricula(),e);
        }
    }

    public Estudiante buscarEstudiantePorMatricula(String matricula){
        if(estudiantes.containsKey(matricula)){
            return estudiantes.get(matricula);
        }
        return null;
    }

    public void eliminarEstudiantePorMatricula(String matricula){
        if(estudiantes.containsKey(matricula)){
            estudiantes.remove(matricula);
        }else{
            System.out.println("Este alumno no esta matriculado");
        }
    }

    public ArrayList<Estudiante> listarEstudiantes(){
        ArrayList<Estudiante> e = new ArrayList<>();

        estudiantes.forEach((key,estudent)-> e.add(estudent));

        return e;
    }

    public ArrayList<Estudiante> listarEstudiantesPorEdad(int edad){
        ArrayList<Estudiante> e = listarEstudiantes();
        e.removeIf((estudent)->estudent.getEdad()!=edad);
        return e;
    }

    public void mostrarLista(){
        ArrayList<Estudiante> e = listarEstudiantes();

        for(Estudiante estudiante : e){
            System.out.println(estudiante);
        }
    }
}
