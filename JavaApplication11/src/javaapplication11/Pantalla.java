/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Alumno
 */
public class Pantalla {
    /**
     * Comprueba que la edad introducida sea numerica, si no lo es muestra 
     * un mensaje de error, y volvera a pedir un numero
     */
    public static int pideInt(String texto) {
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        String cadnum;
        int numero=0;
        boolean correcto;
        do {
                try {
                    correcto=true;
                    System.out.print(texto);
                    cadnum=teclado.readLine();
                    numero=Integer.parseInt(cadnum);
                }
                catch (NumberFormatException e) {
                    System.out.println("\t\tTienes que introducir un nº: " + e);
                    correcto=false;
                }
                catch (IOException e) {
                    System.out.println("\t\tSe ha producido un error: " + e);
                    correcto=false;
                }
        }while (!correcto);
        return numero;
    }
    /**
     *Comprueba que la altura sea numerica, puede tener decimales. Si se 
     * introducen mal los datos los volvera a pedir
     */
    public static float pideFloat(String texto) {
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        String cadnum;
        float numero=0;
        boolean correcto;
        do {
                try {
                    correcto=true;
                    System.out.print(texto);
                    cadnum=teclado.readLine();
                    numero=Float.parseFloat(cadnum);
                }
                catch (NumberFormatException e) {
                    System.out.println("\t\tTienes que introducir un nº: " + e);
                    correcto=false;
                }
                catch (IOException e) {
                    System.out.println("\t\tSe ha producido un error: " + e);
                    correcto=false;
                }
        }while (!correcto);
        return numero;
    }
    public static String pideCadena(String texto) {
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        String cadnum = null;
        System.out.print(texto);
        try {
            cadnum=teclado.readLine();
        } catch (IOException ex) {
            System.out.println("\tHay errores: "+ex);
        }
        return cadnum;
    }
}
