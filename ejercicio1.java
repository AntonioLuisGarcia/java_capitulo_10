
/*
* Ejercicio 1
*
* Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación muestra esos nombres por pantalla. 
* Utiliza para ello un bucle for que recorra todo el ArrayList sin usar ningún índice.
* 
* @author Antonio Luis Garcia
*/

import java.util.ArrayList;

public class ejercicio1{
    public static void main(String[] args) {

        ArrayList <String> nombreClase = new ArrayList<String>(); 

        nombreClase.add("Antonio");
        nombreClase.add("Dani");
        nombreClase.add("Carlos");
        nombreClase.add("Javi");
        nombreClase.add("Pablo");
        nombreClase.add("Adrian");

        for(String nombres: nombreClase){
            System.out.println(nombres);
        }
    }
}
