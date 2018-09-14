/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller.Herencia;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author edilson
 */
public class Pila implements ColeccionInterfaz {
   private static  int n=0;
 public List <Object> MultimediaObjetos = new ArrayList <Object>();
    @Override
    public boolean estaVacia() {
       return MultimediaObjetos.isEmpty();
    }

    @Override
    public Object extraer() {
       Object aux =this.MultimediaObjetos.get(this.MultimediaObjetos.size() -1 );
        this.MultimediaObjetos.remove(this.MultimediaObjetos.size() -1 );
         if (this.n > 0)
            this.n --;
        return aux;
       
    }

    @Override
    public Object primero() {
        return this.MultimediaObjetos.get(0);
    }

    @Override
    public void añadir(Object c) {
        this.MultimediaObjetos.add( c);
        this.n ++;
    }
        
    

    public int get_size (){ return this.MultimediaObjetos.size();}
    
}
