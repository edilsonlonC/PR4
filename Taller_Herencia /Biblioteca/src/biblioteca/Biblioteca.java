/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import biblioteca.principal.MainLibro;
/**
 *
 * @author edilson
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainLibro main= new MainLibro();
        Libro l0 = new  Libro("12344","Laperla",2000);
        Libro l1 = new  Libro("1234433","El perfume",1994);
        Libro l2 = new  Libro("12344444","La iliada",1994);
        Revista R0 = new Revista ("1111","dwdw",34,3);
        l2.prestar();
        main.set_Libro(l0);
        main.set_Libro(l1);
        main.set_Libro(l2);
        main.set_Libro(R0);
        System.out.println(l2.prestado + " "  + l0.prestado + " " + l1.prestado);
        System.out.println(main.cuentaPrestados());
        System.out.println(main.publicacionesanteriores(1999));
    }
    
}
