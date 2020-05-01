
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
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                utils.alta.altacalzado();
                break;
            case 2:
                utils.baja.bajacalzado();
                break;
            case 3:
                utils.listado.listadocalzado();
                break;
            case 4:
                utils.consulta.consultacalzado();
                break;
            case 5:
                break;

        }
    }

}
