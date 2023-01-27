import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {

        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        String palabra = "";
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Diga una palabra y te dire sus sinonimos");
            palabra = sc.nextLine();

            if(!sinonimo(palabra,diccionario)){

                System.out.println("No hay sinonimos");
            }else{
                System.out.print("Los sinonimos son: ");

                String sinonim = diccionario.get(palabra);
                ArrayList<String> sinonimos = new ArrayList<>();

                for (Map.Entry entrada : diccionario.entrySet()) {
                    if (!entrada.getKey().equals(palabra) && entrada.getValue().equals(sinonim)) {
                      sinonimos.add((String) entrada.getKey());
                    }
                }

                for(String s : sinonimos){
                    System.out.print(" " + s);
                }
                System.out.println();

            }

        }while(!palabra.equals("fin"));

        sc.close();
    }

    public static boolean sinonimo(String palabra, HashMap<String,String> h){

        String sinonim = h.get(palabra);
        int contador = 0;

        for (Map.Entry entrada : h.entrySet()) {
          if (entrada.getValue().equals(sinonim)) {
            contador++;
          }
        }
    
        return contador > 1;
    }
   
}
