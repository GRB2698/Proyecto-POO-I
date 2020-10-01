/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author Gerson
 */
public class Tienda {
    private String Nombre;
    ArrayList<Articulo> Catalogo = new ArrayList<Articulo>();

    public Tienda(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Articulo> getCatálogo() {
        return Catalogo;
    }

    public void setCatálogo(ArrayList<Articulo> Catálogo) {
        this.Catalogo = Catálogo;
    }
    
    public void Agregar_Catalogo (Articulo item){
        this.Catalogo.add(item);
        
    }

    @Override
    public String toString() {
        return "Tienda{" + "Nombre=" + Nombre + ", Catalogo=" + Catalogo + '}';
    }
    
    
    
}
