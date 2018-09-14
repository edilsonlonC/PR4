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
public class Revista extends Items {
    int  nro=0;
    public Revista(String codigo,String titulo,int anio,int nro)
    {
        super(codigo,titulo,anio);
        this.nro=nro;
    }
    
    @Override 
    public String toString ()
    {
        return "Codigo : " + this.codigo +
                "\nTitulo : " + this.titulo +
                "\nAnio de publicacion : " + this.anio + 
                "\nNro : " + this.nro;
    }
    
}
