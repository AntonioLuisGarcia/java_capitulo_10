/*
* Ejercicio 3
*
* Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados en un objeto de la clase ArrayList.
* 
* @author Antonio Luis Garcia
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class ejercicio3{
    public static void main(String[] args) {

        ArrayList <Integer> numeros = new ArrayList <Integer>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 10 ; i++){
            System.out.println("INtrdoduzca un numero");
            numeros.add(sc.nextInt());
        }

        sc.close();

        Collections.sort(numeros);

        for(int i = 0 ; i < 10 ; i++){
            System.out.println(numeros.get(i) + " ");
        }
    

    }
}
