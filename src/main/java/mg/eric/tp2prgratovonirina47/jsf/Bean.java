/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.eric.tp2prgratovonirina47.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ratovonirina
 */
@Named(value = "bean")
@RequestScoped
public class Bean {
    
    private int nombre;
    
    public int getNombre(){
        return this.nombre;
    }
    
    public void setNombre(int nombre){
        this.nombre = nombre;
    }
    
    public String afficher(){
       return "affichage_3?nb="+ nombre + "&amp;faces-redirect=true";
    }
    
    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }
}
