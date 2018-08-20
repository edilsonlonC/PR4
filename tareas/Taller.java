metodo /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import java.lang.Math; 


/**
 *
 * @author edilson
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=5;
        int elemento=179;
        int aux=elemento;
        int m=20;
        double semanas,dias,nuevas_horas,minutos;
        double horas=1000;
        // ejercicio 6
        int parte_entera=0;
        double parte_decimal=0;
        //variable fibo 
        int z,y=1,x=0;
        // variables numero primo 
        int divi=0,contador=0;
        double a=1,b=-3,c=1,xs1,xs2;
        switch (opc)
        {
            case 1: 
                if (elemento % 2 == 0)
                    System.out.println("par");
                else 
                    System.out.println("impar");
                break;
                   
            case 2: 
                 for (int i=elemento;i>0;i--)
                    {   
                        
                        elemento*=i;
                        aux=elemento;
                        System.out.println(elemento);
                    } 
                break;
                
            case 3:
                  
              
                for (int cont=0;cont<=elemento;cont=cont+1)
                    {
                        z=x+y;
                        System.out.println(z);
                        x=y;
                        y=z;
                    }
                break;
            case 4:
                m=elemento;
                for (int i=2;i<=m;i++)
                {
                    elemento+=aux;
                     System.out.println(elemento);
                }
               
                
                break;
            case 5: 
                for (int i=1; i<=elemento;i++)
                {
                    if ((elemento % i) == 0)
                        contador+=1;
                }
                if  (contador == 2)
                    System.out.println("es primo");
                else 
                    System.out.println("no es  primo");
                break;
            case 6:
                semanas=horas/168;
                parte_entera=(int) semanas/1;
                parte_decimal=semanas- (double) parte_entera;
                System.out.println("semanas " + (int) semanas);
                dias=parte_decimal*7;
                System.out.println("dias : " + (int) dias);
                parte_entera=(int) dias/1;
                parte_decimal=dias-(double) parte_entera;
                nuevas_horas=parte_decimal*24;
                System.out.println("horas " + (int) nuevas_horas);
                break;
            case 7:
               
                xs1= (b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
                xs2= (b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
                System.out.println(xs1);
                System.out.println(xs1);
                break;
        }
    }
    
}
