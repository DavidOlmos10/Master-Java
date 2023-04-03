
public class Sentencia_If {
    public static void main(String args[]){
        var condicion = false;
        
        if(condicion == true){
            System.out.println("Esto es verdad");
           
        }else{
            System.out.println("Condicion falsa");
        }
        
        var numero = 1;
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1){
            numeroTexto = "Numero uno";
        }
        else if(numero == 2){
            numeroTexto = "Numero dos";
        }
        else if(numero == 3){
            numeroTexto = "Numero tres";
        }
        else if(numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else{
            numeroTexto = "Numero no encontradp";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
