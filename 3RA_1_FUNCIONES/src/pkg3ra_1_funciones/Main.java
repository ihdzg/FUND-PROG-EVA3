/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3ra_1_funciones;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamada funcion o procedimiento
        imprimirMensaje("Hola mundo!!", 5);
    }
    
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) {
            System.out.println(mensaje);
        }
    }
    
}
