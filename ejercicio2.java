/*
*Ejercicio 2
*
* Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego calcule la suma, 
* la media, el máximo y el mínimo de esos números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
* y 20 elementos ambos inclusive.
*
* @author Antonio Luis Garcia
*/

import java.util.ArrayList;

public class ejercicio2{
    public static void main(String[] args) {

        ArrayList <Integer> numerosAleatorios = new ArrayList<Integer>(); 

        int suma = 0;
        int minimo = 100;
        int maximo = 0;
        int longitudArray = (int)(Math.random()*10+11);

        for(int i = 0 ; i < longitudArray ; i++){
            numerosAleatorios.add((int)(Math.random()*101));
            System.out.print(numerosAleatorios.get(i) + " ");
        }


        for(int n : numerosAleatorios) {
            suma += n;
        
            if(n < minimo) {
                minimo = n;
            }
            
            if(n > maximo) {
                maximo = n;
            }
        }

    System.out.println("\nLa suma total es : " + suma);
    System.out.println("La media es : " + suma / longitudArray);
    System.out.println("El mínimo es : " + minimo);
    System.out.println("El máximo es : " + maximo);


    }
}
