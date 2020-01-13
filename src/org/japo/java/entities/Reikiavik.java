/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import java.util.Locale;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class Reikiavik {
    
    private boolean cuarentena;

    public Reikiavik() {        
    }
    

    public boolean isCuarentena() {
        return cuarentena;
    }

    public void setCuarentena(boolean cuarentena) {
        this.cuarentena = cuarentena;
    }

      @Override    
    public final String toString(){
    return String.format(Locale.ENGLISH,"%b",cuarentena);
    }

}
