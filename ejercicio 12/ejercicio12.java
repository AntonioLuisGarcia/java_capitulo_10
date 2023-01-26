import java.util.HashMap;

/*
 * Ejercicio 12
 * 
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que sume los puntos según el juego
 * de la brisca. El valor de las cartas se debe guardar en una estructura HashMap que debe contener parejas (figura, valor), 
 * por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de 
 * la clase Carta. El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale nada.
 * 
 * @author Antonio Luis Garcia
 */

public class ejercicio12 {
    public static void main(String[] args) {
       HashMap <String,Integer> puntuajes = new HashMap<>();
       Carta[] baraja = new Carta[5];
       int puntos = 0;

       puntuajes.put("as", 11);
       puntuajes.put("dos", 0);
       puntuajes.put("tres", 10);
       puntuajes.put("cuatro", 0);
       puntuajes.put("cinco", 0);
       puntuajes.put("seis", 0);
       puntuajes.put("siete", 0);
       puntuajes.put("sota", 2);
       puntuajes.put("caballo", 3);
       puntuajes.put("rey", 4);

        for(int i = 0 ; i < 5 ; i++){
            baraja[i] = new Carta();
            puntos += puntuajes.get(baraja[i].getNumero());
            System.out.println(baraja[i]);
        }

        System.out.println("Tienes " + puntos + " puntos.");

    }    
}
