
package operaciones;


public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando prueba de constructor");
    }
    
    // Agregamos el segundo constructor
    public Aritmetica(int a, int b){
       this.a = a;
       this.b = b;
        System.out.println("Ejecutando segundo constructor");
    }
    
    //Definimos el metodo
    
    public void sumar(){
        int resultado = a +b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    //Agregamos un metodo para definir argumentos o parametros
    public int sumarConArgumentos(int a, int b){
        //Agregamos la palabra this para los argumentos
        
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b; //El argumento b se asigna al atributo this.b
        
        //Mandamos llamar el metodo sumar con retorno para que regrese la misma operacion
        return sumarConRetorno();
    }
}
