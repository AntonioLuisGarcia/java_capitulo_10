package ejerciciosExtra.extra1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;

    private static int numeroDeEstudiantes;

    public Estudiante(){
        numeroDeEstudiantes++;
        this.nombre = "Estudiante" + numeroDeEstudiantes;
        this.edad = (int)(Math.random()*13+18);
        this.matricula = ""+numeroDeEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public static int getNumeroDeEstudiantes() {
        return numeroDeEstudiantes;
    }

    @Override
    public String toString(){
        return nombre + " tiene " + edad + " años y tiene matricula " + matricula;
    }
    
}
