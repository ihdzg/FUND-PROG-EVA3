/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_factorial;

/**
 *
 * @author ihdzg
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = " + calcularFactorial(5));
        //CREAR METODO calcularPotencia(int base, int potencia) ---> regresa entero
        System.out.println("El resultado de 5 con exponente 2 es: " + calcularPotencia(5, 2));
    }
    public static int calcularFactorial(int valor){
        int guardar = 1;
        for (int i = 1; i <= valor; i++) {
            guardar *= i;//guardar = guardar * i 
        }
        return guardar;
    }
    public static int calcularPotencia(int base, int potencia){
        int resultado = 1;
        for (int i = 1; i <= potencia; i++) {
            resultado = (resultado * base);    
        }
        return resultado;
    } 
}
