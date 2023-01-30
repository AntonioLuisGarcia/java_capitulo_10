import java.util.HashMap;
import java.util.Scanner;
//
/*
 * Ejercicio 21.
 * 
 * La asociación “Amigos de los anfibios” nos ha encargado una aplicación educativa sobre estos 
 * animalitos. Crea un programa que pida al usuario el tipo de anfibio y que, a continuación, nos 
 * muestre su hábitat y su alimentación. Si el tipo de anfibio introducido no existe, se debe mostrar
 * el mensaje “Ese tipo de anfibio no existe”.
 * 
 * @author Antonio Luis Garcia 
 */

public class ejercicio21 {
    public static void main(String[] args) {

        HashMap<String, String> habitat = new HashMap<>();
        habitat.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas.");
        habitat.put("salamandra", "Ecosistemas húmedos.");
        habitat.put("sapo", "En cualquier sitio salvo el desierto y la Antártida.");
        habitat.put("tritón", "América y África.");

        HashMap<String, String> alimentacion = new HashMap<>();
        alimentacion.put("rana", "Larvas e insectos.");
        alimentacion.put("salamandra", "Pequeños crustáceos e insectos.");
        alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores.");
        alimentacion.put("tritón", "Insectos.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Diga un anfibio:");
        String anfibio = sc.nextLine();
        sc.close();

        if(habitat.containsKey(anfibio)){
            System.out.println("Habitat: " + habitat.get(anfibio));
            System.out.println("Alimentacion: " + alimentacion.get(anfibio));
        }else{
            System.out.println("No conocemos a ese anfibio");
        }
    }
}
