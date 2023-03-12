package Concatenacion;

public class Concatenacion {

    public static void main(String args[]) {
        var usuario = "David";
        var titulo = "Engineer";
        var union = titulo + " " + usuario;

        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println( i + j); // se realiza la suma de numeros
        System.out.println(i + j + usuario); // Evaluacion de izquierda a derecha
        System.out.println(usuario + (i + j)); //uso de parentesis modifican en la evaluacion
        
    }

}
