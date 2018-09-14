/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.principal;
import biblioteca.Items;
import biblioteca.Libro;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author edilson
 */
public class MainLibro {
    
   private List  <Items> Libros = new ArrayList <Items>();
   public void set_Libro(Items l){this.Libros.add(l);}
   public int cuentaPrestados ()
   {
       int n=0;
       for (Items l : this.Libros)
       {
           if (l instanceof Libro )
           {
               if (((Libro) l).prestado())
                   n++;
           }
                   
       }
       return n;
   }
   public int publicacionesanteriores (int anio)
   {
       int n=0;
       for (Items l : this.Libros)
       {
           if (anio > (int)l.anio)
               n++;
       }
       return n;
   }
   
    
}
