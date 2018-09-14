/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerherencia;
import Taller.Herencia.Pelicula;
import Taller.Herencia.ListaMultimedia;
import Taller.Herencia.Disco;




/**
 *
 * @author edilson
 */
public class TallerHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // punto D
    ListaMultimedia listaD = new ListaMultimedia(10);
     Pelicula  P0 = new Pelicula("Titanic","No se ","Mp3",1.543,"Leonardo D","Ni idea");
     Pelicula  P1 = new Pelicula("Naruto","Kishimoto ","Mp3",1.543,"Naruto","Hinata");
     Pelicula  P2 = new Pelicula("Dragon ball","Akira  Totiyama ","Mp3",1.543,"Goku","Bulma");
     listaD.add(P0);
     listaD.add(P1);
     listaD.add(P2);
     System.out.println(listaD.toString());
     // punto F
     ListaMultimedia listaF = new ListaMultimedia (20);
     Disco D0= new Disco ("El dia de mi suerte","Hector Lavoe","mp3" ,4.55,"Salsa");
     Disco D1= new Disco ("Amor y control","Ruben Blades","mp3" ,4.55,"Salsa");
     Disco D2= new Disco ("Luz","Lil supa","mp3" ,4.55,"Rap");
     listaF.add(D0);
     listaF.add(D1);
     listaF.add(D2);
     System.out.println(listaF.toString());
     //falta punto 4
     String autor="Lil supa", titulo ="Luz";
     if (listaF.search(autor, titulo))
     {
         Disco D3 = new Disco(titulo,"mp5",autor,4.3,"Rap");
         listaF.add(D3);
     }
        
     System.out.println(listaF.toString());
     System.out.println(listaF.search(autor, titulo));
     
     
     
     
     
     
   
    }   
    
}
