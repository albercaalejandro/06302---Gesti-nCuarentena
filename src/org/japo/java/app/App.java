/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;
import org.japo.java.entities.Reikiavik;
/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class App {
     public final void launchApp(){
         
         Reikiavik n1 = new Reikiavik();
         System.out.println("Gestión Cuarentena Reikiavik");
         System.out.println("============================");
         System.out.print("Datos sobre la gestión de su animal: ");
         n1.setCuarentena(false);
         System.out.println(n1 + ".");

         
     }
}
