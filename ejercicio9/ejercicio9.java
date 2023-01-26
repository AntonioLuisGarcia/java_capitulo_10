/*
* Ejercicio 9.
* 
* Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán por palo: bastos, 
* copas, espadas, oros. Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
*
* @author Antonio Luis Garcia
*/

package ejercicio9;
import java.util.ArrayList;
import java.util.Collections;

public class ejercicio9{
    public static void main(String[] args) {
        ArrayList<Carta> c = new ArrayList<>();
        Carta cartaAux;

        for(int i = 0 ; i < 10 ; i++){
            do{
                cartaAux = new Carta();
            }while(c.contains(cartaAux));
            c.add(cartaAux);
        }

        Collections.sort(c);

        for(Carta d : c){
            System.out.println(d);
        }
    }
}

