/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author ingmi
 */

public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombres []={"Johana","jhon", "Nicolas","Valentina","Deisy", "Danna"};
        System.out.println("El tamaño del Array es: " + nombres.length);
        for (int i = 0; i < nombres.length; i++){
            System.out.println("El nombre es: " + nombres[i]);
        }
       
     
    }
    
}
