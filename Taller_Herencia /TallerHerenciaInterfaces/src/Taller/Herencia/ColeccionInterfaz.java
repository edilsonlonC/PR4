/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller.Herencia;

/**
 *
 * @author edilson
 */
public interface ColeccionInterfaz {
    
    public boolean estaVacia ();
    public Object extraer ();
    public Object primero ();
    public void añadir (Object n);
    public int get_size ();
    
}
