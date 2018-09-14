/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller.Herencia;
//import java.util.Hashtable;
/**
 *
 * @author edilson
 */
public class Multimedia {
    
    protected String titulo, autor,formato;
    protected Double duracion;
    
    public Multimedia (String titulo,String autor,String formato,Double duracion)
    {
       
        this.autor=autor;
        this.formato=formato;
        this.duracion=duracion;
        this.titulo=titulo;
        
    }
    
    public String get_autor (){return this.autor;}
    public String get_formato (){return this.formato;}
    public double get_duracion (){return this.duracion;}
    public String get_titulo (){return this.titulo;}
    public boolean equals (Multimedia m ){return m.autor.equals(m.titulo);}
   @Override
    public String toString ()
    {
    return " Titulo : " + this.titulo + 
            "\n Autor :" + this.autor + 
            "\n Formato :" + this.formato +
            "\n Duracion : " + this.duracion ;
    }
}