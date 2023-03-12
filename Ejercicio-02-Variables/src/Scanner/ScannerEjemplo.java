
package Scanner;

import java.util.Scanner;



public class ScannerEjemplo {
    public static void main(String args[]){
        /*
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe un titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado:" + titulo + " " + usuario);
*/
        System.out.println("Escribe el titulo del libro que quieres leer");
        Scanner console = new Scanner(System.in);
        var titulo = console.nextLine();
        System.out.println("titulo = " + titulo);
        System.out.println("Ingresa tu autor favorito");
        var autor = console.nextLine();
        System.out.println(titulo + "Fue escrito por" + autor);
    }
}
