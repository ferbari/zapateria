
package zapateria;

import utils.*;
import java.util.Scanner;

/**
 *
 * @author fernando
 * 
 * 
 */
public class Zapateria {
/**
     * Método Principal.
     * @param args 
     */
    
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
       
        //menu
        /*
         Alta de calzado
         Baixa de calzado
         Listado de calzado por tipo (deportivo, hogar, zapatos)
         Consulta de calzado
         Saír
         */
        System.out.println("Menu de la tienda");
        System.out.println("0.Sair.");
        System.out.println("1. Alta de calzado.");
        System.out.println("2.Baixa de calzado.");
        System.out.println("3.Listado de calzado.");
        System.out.println("4.Consulta calzado.");
        System.out.println("Introduzca una opción.");
        opcion = sc.nextInt();//
        //switch para el menu
        switch (opcion) {
            case 1:
                utils.Alta.altacalzado();
                break;
            case 2:
                utils.Baja.bajacalzado();
                break;
            case 3:
                utils.Listado.listadocalzado();
                break;
            case 4:
                utils.Consulta.consultacalzado();
                break;
            case 5:
                break;

        }
    }

}
