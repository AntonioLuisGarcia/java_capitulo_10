/*
 * Ejercicio 11.
 * 
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior. 
 * El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de las palabras y comprobará 
 * si son correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas y cuántas erróneas.
 * 
 * @author Antonio Luis Garcia
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ejercicio11{
    public static void main(String[] args) {
        HashMap <String,String> dictionary = new HashMap<>();

        dictionary.put("dog", "perro");
        dictionary.put("cat", "gato");
        dictionary.put("house", "casa");
        dictionary.put("book", "libro");
        dictionary.put("pen", "bolígrafo");
        dictionary.put("computer", "computadora");
        dictionary.put("car", "coche");
        dictionary.put("tree", "árbol");
        dictionary.put("flower", "flor");
        dictionary.put("sky", "cielo");
        dictionary.put("sun", "sol");
        dictionary.put("moon", "luna");
        dictionary.put("water", "agua");
        dictionary.put("food", "comida");
        dictionary.put("friend", "amigo");
        dictionary.put("father", "padre");
        dictionary.put("mother", "madre");
        dictionary.put("sister", "hermana");
        dictionary.put("brother", "hermano");

        String[] keys = dictionary.keySet().toArray(new String[0]);
        int numero;
        ArrayList<Integer> numeros = new ArrayList<>();
        String palabra;
    
        for(int i = 0 ; i < 5 ; i++){

            do{
                numero = (int)(Math.random()*20);
            }while(numeros.contains(numero));

            numeros.add(numero);
        }

        int aciertos = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(keys[numeros.get(i-1)] + ":");
            palabra = sc.next();

            if(palabra.equals(dictionary.get(keys[numeros.get(i-1)]))){
                System.out.println("Acierto");
                aciertos++;
            }else{
                System.out.println("Fallo");
            }
        }

        sc.close();

        System.out.println("Has tenido " + aciertos + " aciertos");

    }
    
}
