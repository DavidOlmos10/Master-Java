
package ejercicio.pkg03.tipos.de.datos;


public class Ejercicio03TiposDeDatos {

    public static void main(String[] args) {
         /*
            tipos primitivos enteros: byte, short,int, long
            
        */
         
         byte numeroByte = (byte)129; //Convertir el valor numerico de tipo entero a tipo byte
         System.out.println("Valor byte:" + numeroByte);
         System.out.println("Valor minimo del byte:" + Byte.MIN_VALUE);
         System.out.println("Valor maximo del byte:" + Byte.MAX_VALUE);
         
         short numeroShort = 10; //
         System.out.println("numeroShort = " + numeroShort);
         System.out.println("Valor mminimo del short:" + Short.MIN_VALUE);
         System.out.println("Valor maximo del shor:" + Short.MAX_VALUE);
         
         int numeroInt = (int) 2147483648L;
         System.out.println("numeroInt = " + numeroInt);
         System.out.println("El valor minimo de int:" + Integer.MIN_VALUE);
         System.out.println("El valor maximo de int: " + Integer.MAX_VALUE);
         
         long numeroLong = 20;
         System.out.println("numeroLong = " + numeroLong);
         System.out.println("El valor minimo de Long:" + Long.MIN_VALUE);
         System.out.println("El valor maximo de Long:" + Long.MAX_VALUE);
    }
    
}
