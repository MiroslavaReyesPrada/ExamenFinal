/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinal;

/**
 *
 * @author ingmi
 */
import java.util.Scanner;
import static javafx.beans.binding.Bindings.length;
public class Matriz {
    

    public static void main(String[] args) {
        
     
        
        Scanner Scanner = new Scanner(System.in);
        

        int[][] edades = {{11, 26, 27}, {35, 45, 34}, {11, 13, 07}};
        System.out.println("El tamaño de la matriz es: " + edades.length);

        System.out.println("Posición 1,3 es: " + edades[1][2]);

        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++){     
            
               
            System.out.print(edades[i][j] + "\t");

            }
            System.out.println("");
        }
    }

}
