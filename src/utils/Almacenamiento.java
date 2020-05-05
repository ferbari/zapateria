package utils;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
//
import java.util.Scanner;
import zapateria.Calzado;
import zapateria.Zapatos;
import zapateria.ZapatillasHogar;
import zapateria.ChangletaSandalias;
import zapateria.CalzadoDeportivo;

/**
 * Da de Alta ,baja,consulta y listado
 *
 * @author Fernando Barreiro
 * @author desinweb.com
 * @version 1.0
 * @since 1.0
 *
 */
public class Almacenamiento {

    public static void altacalzado() {
        //inicializo el objeto
        //menu con las opciones 
        Scanner sc = new Scanner(System.in);
          int opciones;//Variable de opcion de menu
        do{
      
        System.out.println("Menu de alta");
        System.out.println("0.Salir");
        System.out.println("1.Alta nuevo zapato");
        System.out.println("2.Alta nueva zapatilla hogar");
        System.out.println("Alta nueva changleta o sandalia");
        System.out.println("Introduce una opción");
        opciones = sc.nextInt();//
        switch(opciones){
            case 1:
                break;
                
            case 2:
        //nuevaZapatillaHogar
        ZapatillasHogar nuevaZapatillaHogar = new ZapatillasHogar();
        System.out.println("Introduce el codigo de la zapatilla de hogar");
        String codigo=sc.nextLine();
        nuevaZapatillaHogar.setCodigo(codigo);
         System.out.println("Introduce el modelo");
        String modelo=sc.nextLine();
        nuevaZapatillaHogar.setModelo(modelo);
        System.out.println("Introduce el Genero");
        String genero=sc.nextLine();
        nuevaZapatillaHogar.setGenero(genero);
       
        System.out.println("Introduce la talla");
        int talla=sc.nextInt();
        nuevaZapatillaHogar.setTalla(talla);
        break;
        
        }
        }while(opciones!=0);
        Calzado nuevoCalzado = new Calzado() {
        };
        nuevoCalzado.setCodigo("8787hh");
        nuevoCalzado.setUrlFoto("hsajhs");
        nuevoCalzado.setGenero("Mujer");
        nuevoCalzado.setModelo("smd54");
        nuevoCalzado.setTalla(35);

        //Nuevozapato
        Zapatos nuevoZapato = new Zapatos();
        nuevoZapato.setColor("Rojo");
        nuevoZapato.setMaterial("Piel");
        //case :
        
        //ChangletaSandalias
        ChangletaSandalias nuevaChangletaSandalia = new ChangletaSandalias();
        nuevaChangletaSandalia.getCodigo();
        nuevaChangletaSandalia.getModelo();
        nuevaChangletaSandalia.getMaterial();
        nuevaChangletaSandalia.getGenero();
        nuevaChangletaSandalia.getTalla();
        nuevaChangletaSandalia.getPrecio();
        nuevaChangletaSandalia.getUrlFoto();
        nuevaChangletaSandalia.getFabricante();
        nuevaChangletaSandalia.getTipo();
 /**       
try{
archivo=new RandoAccessFile("Calzado.dat","rw");
}catch(IOException e){

}*/
  

        System.out.println("hola " + nuevoCalzado.getTalla());
        System.out.println("Zapato " + nuevoZapato.getColor() + " El material es: " + nuevoZapato.getMaterial());
      
    }

    /**
     * consultacalzado Metodo para introducir los datos para hacer una Consulta
     * param Consulta --valor de la Consulta
     *
     */
    public static void consultacalzado() {

        System.out.println("Introduce un dato");
        Scanner buscar = new Scanner(System.in);
        String consulta = buscar.nextLine();

    }
    //retorna 

    public static void LeerCalzado() {

    }

    public static void GrabarCalzado() {
    }

    public static void BorrarCalzado() {
    }

    /**
     * metodo listadocalzado lISTADO CALZADO POR TIPO(DEPORTIVO,HOGAR,ZAPATOS)
     */
    public static void listadocalzado() {

    }

}
