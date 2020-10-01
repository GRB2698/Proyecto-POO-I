/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gerson
 */
public class Armas extends Articulo {
    private int daño;
    private int velocidad;

    public Armas(String Nombre, int precio,int daño, int velocidad) {
        super (Nombre,precio);
        this.daño = daño;
        this.velocidad = velocidad;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    

    
}
