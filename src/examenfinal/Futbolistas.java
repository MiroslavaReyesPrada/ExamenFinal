/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author ingmi
 */
public class Futbolistas {
    
    public static void main(String[] args) {
    
       Scanner Scanner = new Scanner(System.in);
    
    
    
       
        Object[][] futbolista = {
            {"juan", 15, "Delantero"}, 
            {"Pedro", 16, "Defensa"}, 
            {"Luis", 17, "Arquero"}};
        
        System.out.println("Nombre de persona 1: " + futbolista[0][0] + " Edad:" + futbolista[0][1] + 
                " posición:" + futbolista[0][2]);
        System.out.println("-----------");
        System.out.println("Posición 2,2 es: " +futbolista[2][2]);
        System.out.println("Posición 1,1 es: " +futbolista[1][1]);
        System.out.println("-----------");
        
            for(int i = 0; i< futbolista.length; i++){
                for(int j = 0; j< futbolista[i].length; j++){
                    System.out.print(futbolista[i][j] + "\t");
                }
                 System.out.println("");
                 
            }
    }
}
