
import java.util.Scanner;

public class Ejemplo_Calificaciones {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un valor entre 0 y 10:");
        int calificacion = Integer.parseInt(scanner.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } //Si esta entre 8 y menos a 9 imprimir: B
        else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } //Si esta entre 7 y menos a 8 imprimir: c
        else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } //Si esta entre 6 y menos a 7 imprimir: D
        else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } //Si esta entre 0 y menos a 6 imprimir: F
        else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } //Si no esta en el rango, imprimir: Valor desconocido
        else {
            System.out.println("Valor desconocido");
        }
    }
}
