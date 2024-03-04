/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller;

import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicitar la calificación de la materia
        System.out.println("Por favor, califique la materia del 1 al 10:");
        int calificacion = scanner.nextInt();

        // Validar la calificación dentro del rango de 1 a 10
        while (calificacion < 1 || calificacion > 10) {
            System.out.println("La calificación debe estar en el rango de 1 a 10. Inténtelo nuevamente:");
            calificacion = scanner.nextInt();
        }

        // Solicitar la edad
        System.out.println("Por favor, ingrese su edad (0 a 55 años):");
        int edad = scanner.nextInt();

        // Validar la edad dentro del rango de 0 a 55 años
        while (edad < 0 || edad > 55) {
            System.out.println("La edad debe estar en el rango de 0 a 55 años. Inténtelo nuevamente:");
            edad = scanner.nextInt();
        }

        // Limpiar el buffer del scanner
        scanner.nextLine();

        // Solicitar el estado civil
        System.out.println("Por favor, ingrese su estado civil (soltero o casado):");
        String estadoCivil = scanner.nextLine();

        // Verificar si el estado civil es soltero o casado
        while (!estadoCivil.equalsIgnoreCase("soltero") && !estadoCivil.equalsIgnoreCase("casado")) {
            System.out.println("El estado civil debe ser 'soltero' o 'casado'. Inténtelo nuevamente:");
            estadoCivil = scanner.nextLine();
        }

        // Crear una instancia de la clase Persona
        Persona persona = new Persona(edad, estadoCivil);

        // Crear una instancia de la clase Encuesta y mostrar los resultados
        Encuesta encuesta = new Encuesta(persona, calificacion);
        encuesta.mostrarResultados();

        // Cerrar el scanner
        scanner.close();
    }
}
        
        
        
    
    

