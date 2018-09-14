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
public class Items {
    protected String codigo , titulo ;
    public  int anio;
    public Items (String codigo,String titulo,int anio)
    {
        this.anio=anio;
        this.codigo=codigo;
        this.titulo=titulo;
    }
    
}
