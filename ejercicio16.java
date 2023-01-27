import java.util.HashMap;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("Espana","Madrid");
        capitales.put("Francia","Paris");
        capitales.put("Portugal","Porto");
        capitales.put("Italia","Roma");

        String pais = "";
        String capital = "";
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = sc.nextLine();
            
            if(capitales.containsKey(pais)){
                System.out.println("La capital es: " + capitales.get(pais));
            }else{
                System.out.print("No conozco esa pais, dime cual es su capital:");
                capital = sc.nextLine();
                capitales.put(pais,capital);
            }
        }while(!pais.equals("fin"));

        sc.close();
    }
}
