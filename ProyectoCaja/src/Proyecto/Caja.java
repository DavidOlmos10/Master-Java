
package Proyecto;


public  class Caja {
    
    //Definimos los atributos
        
        int ancho;
        int alto;
        int profundidad;
        
        // Agregamos el primer constructor
        
        public Caja(){
            System.out.println("Ejecutando constructor de prueba");
        }
        
        //Agregagamos el segundo constructor
        
        public Caja(int ancho, int alto, int profuncidad){
            this.alto = alto;
            this.ancho = ancho;
            this.profundidad = profuncidad;
        }
        
        public int volumen(){
            return ancho * alto * profundidad;
            
        }

}
