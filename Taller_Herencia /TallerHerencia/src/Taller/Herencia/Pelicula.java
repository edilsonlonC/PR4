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
public class Pelicula extends Multimedia{
    protected String actor_principal = "";
    protected String actriz_principal = "";
    public Pelicula(String titulo, String autor, String formato, Double duracion, String actor_principal, String actriz_principal ) 
    {
        super(titulo, autor, formato, duracion);
        this.actor_principal = actor_principal;
        this.actriz_principal = actriz_principal;
    }
    @Override
    public String toString ()
    {
    return " Titulo : " + this.titulo + 
            "\n Autor :" + this.autor + 
            "\n Formato :" + this.formato +
            "\n Duracion : " + this.duracion + 
            "\n Actriz_principal : " + this.actriz_principal + 
            "\n Actor_principal : "  + this.actor_principal;
    }
    
}
