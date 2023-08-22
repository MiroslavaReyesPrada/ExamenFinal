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
public class NewClass {
    
    public static void main(String[] args){
       List<String> names = new ArrayList<String>();
       names.add("Juan");
       names.add("16");
       names.add("Delantero");
       
       names.add("Pedro");
       names.add("16");
       names.add("Defensa");
       
       names.add("Luis");
       names.add("17");
       names.add("Arquero");
       
       names.forEach(n-> System.out.println(n + "\t"));

    } 
            
    
}
