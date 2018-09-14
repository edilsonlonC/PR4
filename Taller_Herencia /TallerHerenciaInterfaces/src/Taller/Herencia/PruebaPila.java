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
public class PruebaPila {
    public  void Rellenar (ColeccionInterfaz c)
    {
        for (int i=0; i< 10 ; i++)
            c.añadir(i);
            
    }
    
    public void imprimirYVaciar (ColeccionInterfaz c)
    {
       
        for (int i = 0; i<10;i++)
            
        {
            if (c.get_size() > 0 )
            {
            System.out.println(c.extraer());
            }
            else System.out.println("NO hay elementos ");
        }
    }
    
}
