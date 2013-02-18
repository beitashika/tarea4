/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Alumno
 */
public class Alumno {
    
     /**
     * Datos que se piden:
     * nombre nombre del alumno <br>
     * edad edad del alumno <br>
     *  altura altura del alumno
    */
   
    String nombre;
    int edad;
    float altura;
    /**
     * Introducimos los datos del alumno
     */
    Alumno(){
        nombre=Pantalla.pideCadena("\t\tIntroduce tu nombre: ");
        edad=Pantalla.pideInt("\t\tIntroduce tu edad: ");
        altura=Pantalla.pideFloat("\t\tIntroduce tu altura: ");
    }
    /**
     * Muestra los datos del alumno
     */
    void muestraAlumno (){
        System.out.println("\t\tNombre: " + nombre);
        System.out.println("\t\tEdad: " + edad);
        System.out.println("\t\tAltura: " + altura);
    }
}
