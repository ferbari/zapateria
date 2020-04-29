/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;
import utils.*;
import java.util.Scanner;

/**
 *
 * @author desarrollorrtrtr
 */
public class Zapateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        // debian lite
        // TODO code application logic here
        //menu
        /*
         Alta de calzadogrgrgr
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
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

        }
    }

}
