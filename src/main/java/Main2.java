
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexis
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        
        // Mostrar letra por letra y calcular la suma de caracteres
        int sumaCaracteres = 0;
        System.out.println("Letra por letra:");
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            System.out.println(letra);
            sumaCaracteres += 1; // Sumar 1 por cada letra
        }
        
        // Mostrar la suma de caracteres
        System.out.println("La suma de caracteres es: " + sumaCaracteres);
    }
    
}
