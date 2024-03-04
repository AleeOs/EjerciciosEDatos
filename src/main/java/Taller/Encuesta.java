/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author Alexis
 */
public class Encuesta {
    private int calificacion;
    private Persona persona;

    public Encuesta(Persona persona, int calificacion) {
        this.persona = persona;
        this.calificacion = calificacion;
    }

    public void mostrarResultados() {
        System.out.println("\n--- Resultados de la encuesta ---");
        System.out.println("Calificación de la materia: " + calificacion);
        System.out.println("Edad: " + persona.getEdad() + " años");
        System.out.println("Estado civil: " + persona.getEstadoCivil());
    }
}


