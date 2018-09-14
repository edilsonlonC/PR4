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
public class Disco extends Multimedia {
    
    private String genero = "";
    public Disco(String titulo, String autor, String formato, Double duracion,String genero) {
        super(titulo, autor, formato, duracion);
        this.genero=genero;
    }
    
    public String get_genero (){return this.genero;}
    
    @Override 
    public String toString  ()
    {
         return " Titulo : " + this.titulo + 
            "\n Autor :" + this.autor + 
            "\n Formato :" + this.formato +
            "\n Duracion : " + this.duracion + 
            "\n genero : "  + this.genero ;
    }
    
 /*  public String get_titulo (){return this.titulo;}
   public String get_autor (){return this.autor;}*/
}
