
package Ejmplos_Clases;


public class PruebaPersona {
    
    public static void main(String[] args) {
        
        //Creamos el objeto llamado persona
        
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Ramos";
        persona1.despelgarInformacion();
        
        //Se agrega una nueva instancia
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        
        //Insertamos nuevos nombres a nuestro nuevo objeto
        persona2.nombre = "Adhara";
        persona2.apellido = "Olmos";
        persona2.despelgarInformacion();
    }
}
