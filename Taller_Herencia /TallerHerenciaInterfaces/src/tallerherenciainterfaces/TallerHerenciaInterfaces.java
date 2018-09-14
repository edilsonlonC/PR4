/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerherenciainterfaces;
import Taller.Herencia.Pila;
import Taller.Herencia.PruebaPila;
/**
 *
 * @author edilson
 */
public class TallerHerenciaInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila p = new Pila();
        PruebaPila pp = new PruebaPila ();
        pp.Rellenar(p);
        pp.imprimirYVaciar(p);
        pp.imprimirYVaciar(p);
        
        
    }
    
}
