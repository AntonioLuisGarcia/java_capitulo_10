package ejerciciosExtra.extra1;

public class pruebaUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad();

        uni.inscribirEstudiante(new Estudiante());
        uni.inscribirEstudiante(new Estudiante());
        uni.inscribirEstudiante(new Estudiante());

        System.out.println(uni.buscarEstudiantePorMatricula("3"));
        System.out.println(uni.buscarEstudiantePorMatricula("4"));

        uni.mostrarLista();
        uni.eliminarEstudiantePorMatricula("1");
        System.out.println();
        uni.mostrarLista();
        System.out.println();
        uni.mostrarListaUni();
    }
}
