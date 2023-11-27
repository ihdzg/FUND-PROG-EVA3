/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_objetos;

/**
 *
 * @author ihdzg
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Ivan";
        perso1.apellido = "Hernandez";
        perso1.edad = 10;
        imprimirPersonas(perso1);

        
        Persona perso2 = new Persona();
        System.out.println(perso2);
        perso2.nombre = "Sergio";
        perso2.apellido = "Olague";
        perso2.edad = 100;
        imprimirPersonas(perso2);
    }
    
   public static void imprimirPersonas(Persona perso){
       System.out.println("Direccion: " + perso);
       System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
       System.out.println("Edad: " + perso.edad);
   }
    
}


//definen una plantilla para crear objetos
//crean un nuevo tipo de dato
class Persona{
    String nombre, apellido;
    int edad;
}
