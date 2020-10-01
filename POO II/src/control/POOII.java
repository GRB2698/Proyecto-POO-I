/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Armas;
import modelo.Tienda;

/**
 *
 * @author Gerson
 */
public class POOII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda lol = new Tienda("LOL");
        Armas espada = new Armas ("Espada", 20000, 100, 75);
        lol.Agregar_Catalogo(espada);
        System.out.println(lol.toString());
    }
    
}
