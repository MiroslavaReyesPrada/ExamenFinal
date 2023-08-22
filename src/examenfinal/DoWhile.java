/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinal;
import java.util.*;
/**
 *
 * @author ingmi
 */
public class DoWhile {
    
    public static void main(String[] args){
         List<Integer> lista = new ArrayList<Integer>();
         
         
         int num = 8;
         int i = 1;
         do{
           lista.add(i);
           System.out.println(lista.get(i-1));

           i++;

         }while(i < num);
    }
    
}
