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
public class Magia extends Articulo{
    private int magia;

    public Magia(int magia, String nombre, int precio) {
        super(nombre, precio);
        this.magia = magia;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        return "Magia{" + "magia=" + magia + '}';
    }
    
    
}
