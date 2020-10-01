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
public class Proteccion extends Articulo {

private int proteccion;    

    public Proteccion(String nombre, int precio,int proteccion) {
        super(nombre, precio);
        this.proteccion=proteccion;
    }

    public int getProteccion() {
        return proteccion;
    }

    public void setProteccion(int proteccion) {
        this.proteccion = proteccion;
    }

    @Override
    public String toString() {
        return "Proteccion{" + "proteccion=" + proteccion + '}';
    }
    
    
}
