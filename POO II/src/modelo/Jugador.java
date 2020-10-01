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
public class Jugador {
    private String nombre;
    private int dinero;
    private int defensa;
    private int ataque;
    private int vida;
    private int velocidad;
    private int magia;
    ArrayList<Articulo> inventario= new ArrayList<>();
    ArrayList<Articulo> equipado= new ArrayList<>();

    
    public Jugador() {
    }

    public Jugador(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.defensa = 0;
        this.ataque = 0;
        this.magia = 0;
        this.velocidad = 0;
        this.vida = 50;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        return "Jugador:\n" + "Nombre: " + nombre + "\ndinero: " + dinero + "\ndefensa: " + defensa + "\nataque: " + ataque 
                + "\nvida: " + vida + "\nvelocidad: " + velocidad + "\nmagia: " + magia + '\n';
    }
    
    
}
