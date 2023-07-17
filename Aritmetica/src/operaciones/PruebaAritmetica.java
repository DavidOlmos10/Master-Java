
package operaciones;


public class PruebaAritmetica {
    
    public static void main(String[] args) {
        //Creamos el objeto llamado Aritmetica
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 5;
        aritmetica1.b = 10;
        
        //Mandamos a llamar el metodo suma, de la clase Aritmetica
        aritmetica1.sumar();
        
        //Creamos una variable de tipo int llamda resultado
        //Mandamos llamar el metodo sumar con retorno dentro de una variable de tipo int
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la clase de prueba = " + resultado);
        
        //Mandamos a llamr el metodo sumar con argumentos
        
         resultado = aritmetica1.sumarConArgumentos(5, 8);
         System.out.println("resultado usando argumentos = " + resultado);
         
    }
}
