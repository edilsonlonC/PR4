/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller.Herencia;
import java.util.LinkedList;
/**
 *
 * @author edilson
 */
public class Cola implements  ColeccionInterfaz  {
    LinkedList  <Object> cola = new  LinkedList <Object> ();
    @Override
    public boolean estaVacia() {
    return this.cola.isEmpty();
    
    }

    @Override
    public Object extraer() {
       Object aux=this.cola.getFirst();
       this.cola.removeFirst();
       return aux;
    }

    @Override
    public Object primero() {
        return this.cola.removeFirst();
    }

    @Override
    public void añadir(Object n) {
         this.cola.add(n);
    }

    @Override
    public int get_size() {
        return this.cola.size();
    }
    
    
}
