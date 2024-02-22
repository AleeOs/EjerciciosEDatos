
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexis
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese las 5 notas
        System.out.println("Ingrese las 5 notas:");
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
        }
        
        // Calcular el promedio
        double promedio = suma / 5;
        
        // Mostrar el promedio
        System.out.println("El promedio de las notas es: " + promedio);
        
        
        
        
        
        
    }
    
}
