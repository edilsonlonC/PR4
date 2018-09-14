/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author edilson
 */
public class Libro extends Items implements Prestable{
    protected boolean prestado=false;
    public Libro (String codigo,String titulo,int anio)
    {
        super(codigo,titulo,anio);
       
    }
    
    
    @Override 
    public String toString ()
    {
        return "Codigo : " + this.codigo +
                "\nTitulo : " + this.titulo +
                "\nAnio de publicacion : " + this.anio + 
                "\n ¿prestado? : " + this.prestado;
    }

    @Override
    public void prestar() {

        this.prestado = true;
    }

    @Override
    public boolean prestado() {
        return this.prestado; 
    }

    @Override
    public void devolver() {
        this.prestado=false;    
        }
    
}
