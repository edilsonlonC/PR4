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
public class ListaMultimedia {
    List <Multimedia> MultimediaObjetos = new ArrayList <Multimedia>();
    int n_elements=0;
    // constructor 
    public ListaMultimedia (int n_elementos){this.n_elements=n_elementos;}
    
    public int  size (){return this.MultimediaObjetos.size();}
    
    public boolean add (Multimedia m)
    {
        if (this.MultimediaObjetos.size() >= this.n_elements)
            return false;
        else
        {
            this.MultimediaObjetos.add(m);
            return true;
        }
    }
    
    public Multimedia get(int position){return this.MultimediaObjetos.get(position);}
    
    @Override
    public String toString()
    {
      String info_objetos="";
      /*for (int i=0;i<this.MultimediaObjetos.size();i++)
          info_objetos   =info_objetos + MultimediaObjetos.get(i).toString();*/
      for (Multimedia m : this.MultimediaObjetos)
          info_objetos =  info_objetos + m.toString();
      return info_objetos;
    }
    
    public boolean search (String autor, String titulo)
    {
        boolean encontrado=false;
        for  (Multimedia m : this.MultimediaObjetos)
        {
           
            if  (m.autor.equals(autor) && m.titulo.equals(titulo) )
               encontrado=true;
            
               
        }
        return encontrado;
        
            
    }
 }
    

