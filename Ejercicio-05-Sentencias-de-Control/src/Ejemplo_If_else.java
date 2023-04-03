
import java.util.Scanner;

public class Ejemplo_If_else {

    public static void main(String args[]) {

        System.out.println("Escribe el numero del mes para saber su estacion");
        Scanner console = new Scanner(System.in);
        var mes = console.nextLine();
        var etapa = 13;
        var estacion = "Desconocida";
        if (etapa == 1 || etapa == 2 || etapa == 12) {
            System.out.println("La estacion del año es Invierno: " + etapa);
        } else if (etapa == 3 || etapa == 4 || etapa == 5) {
            System.out.println("La estacion es primavera");
        } else if (etapa == 6 || etapa == 7 || etapa == 8) {
            System.out.println("La estacion es Verano");
        } else if (etapa == 9 || etapa == 10 || etapa == 11) {
            System.out.println("La estacion del año es Otoño");
        } 
            System.out.println("estacion = " + estacion);
    }
}
