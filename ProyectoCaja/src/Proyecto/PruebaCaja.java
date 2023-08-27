
package Proyecto;


public class PruebaCaja {
    
    public static void main(String args []){

        //Creamos las variables
        
        int mediaAncho = 3;
        int mediaAlto = 2;
        int mediaProfundo = 6;
        
        Caja caja1 = new Caja();
        caja1.alto = mediaAlto;
        caja1.ancho = mediaAncho;
        caja1.profundidad = mediaProfundo;
        int resultado = caja1.volumen();
        System.out.println("El resultado de la caja1 es:"+ resultado);
        
       Caja caja2 = new Caja(2,5,6);
        System.out.println("El resultado de la caja2 es:" + caja2.volumen());
        
    }
    
}
