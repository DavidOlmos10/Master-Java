
package operaciones;


public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        //Se comenta el codigo para hacer una prueba con el metodo constructor
         Aritmetica aritmetica1 = new Aritmetica();
         System.out.println("aritmetica1 a: "+ aritmetica1.a);
         System.out.println("aritmetica1 b: "+ aritmetica1.b);
         
         //Creamos otro objeto para mandar a llamar el segundo conostructor
         Aritmetica aritmetica2 = new Aritmetica(5,10);
         System.out.println("aritmerica2 a:"+ aritmetica2.a);
         System.out.println("aritmetica2 b:" + aritmetica2.b);

        //Creamos el objeto llamado Aritmetica
        /*
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 5;
        aritmetica1.b = 10;
        
        //Mandamos a llamar el metodo suma, de la clase Aritmetica
        aritmetica1.sumar();
        
        //Creamos una variable de tipo int llamda resultado
        //Mandamos llamar el metodo sumar con retorno dentro de una variable de tipo int
        
        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la clase de prueba = " + resultado);
        
        //Mandamos a llamr el metodo sumar con argumentos
        
         resultado = aritmetica1.sumarConArgumentos(5, 8);
         System.out.println("resultado usando argumentos = " + resultado);
         */
         
    }
}
