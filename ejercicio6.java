import java.util.Scanner;

/**
* Ejercicio 6
*
* Implementa el control de acceso al área restringida de un programa. Se debe pedir un nombre de usuario y una contraseña. 
* Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. El usuario tendrá 
* un máximo de 3 oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. 
* Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase HashMap.
*
* @author Antonio Luis Garcia
*/

import java.util.HashMap;

public class ejercicio6{
    public static void main(String[] args) {

        String usuario;
        int clave;
        boolean salir = false;
        int intentos = 3;


        HashMap <String, Integer> datos = new HashMap<>();
        datos.put("Antonio",1234);
        datos.put("Jose",1111);
        datos.put("Sergio",4040);

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los datos y comprobaremos si son correctors");

        do{

            System.out.println("Tienes " + intentos + " intentos");
            System.out.println("Diga el nombre:");
            usuario = sc.next();
            System.out.println("Diga la clave:");
            clave = sc.nextInt();

            if(datos.containsKey(usuario)){
                if(datos.get(usuario).equals(clave)){
                    System.out.println("Ha accedido al área restringida");
                    salir = true;
                    intentos++;
                }else{
                    System.out.println("La contraseña es incorrecta");

                }
            }else { 
                System.out.println("El usuario introducido no existe");
            }

            intentos--;

            if(intentos < 0){
                salir = true;
                System.out.println("Lo siento, no tiene acceso");
            }

        }while(!salir);

        sc.close();
    }
}