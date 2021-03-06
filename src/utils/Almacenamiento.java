package utils;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import zapateria.Calzado.*;
import zapateria.Zapato;
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
//variables

    private static String tipo;
    private static String codigo;
    private static String genero;
    private static String modelo;
    private static String fabricante;
    private static String urlFoto;
    private static String material;
    private static String color;
    private static int talla;
    private static double precio;

    /**
     *
     */
    public static void altacalzado() {

        //menu con las opciones 
        Scanner sc = new Scanner(System.in);
        int opciones;//Variable de opcion de menu

        do {
            
            System.out.println("Menu de alta");
            System.out.println("0.Salir");
            System.out.println("1.Alta nuevo zapato");
            System.out.println("2.Alta nueva zapatilla hogar");
            System.out.println("3.Alta nueva changleta o sandalia");
            System.out.println("Introduce una opción");
            opciones = sc.nextInt();//

            switch (opciones) {
                case 1:
                    Zapato nuevoZapato = new Zapato();
                    System.out.println("Vas a dar de alta un nuevo Zapato");
                    tipo = "Zapato";
                    nuevoZapato.setTipo(tipo);
                    System.out.println("Introduce el codigo del zapato");
                    codigo = sc.nextLine();
                    nuevoZapato.setCodigo(codigo);
                    System.out.println("Introduce el modelo del zapato");
                    modelo = sc.nextLine();
                    nuevoZapato.setModelo(modelo);
                    System.out.println("Introduce el Genero");
                    genero = sc.nextLine();
                    nuevoZapato.setGenero(genero);
                    System.out.println("Introduce la talla");
                    talla = sc.nextInt();
                    nuevoZapato.setTalla(talla);
                    GrabarCalzado(nuevoZapato);
                    break;
                
                case 2:
                    //nuevaZapatillaHogar
                    ZapatillasHogar nuevaZapatillaHogar = new ZapatillasHogar();
                    System.out.println("Vas a dar de alta una Zaptilla de hogar");
                    tipo = "Zapatilla";
                    nuevaZapatillaHogar.setTipo(tipo);
                    System.out.println("Introduce el codigo de la zapatilla de hogar");
                    codigo = sc.nextLine();
                    nuevaZapatillaHogar.setCodigo(codigo);
                    System.out.println("Introduce el modelo");
                    modelo = sc.nextLine();
                    nuevaZapatillaHogar.setModelo(modelo);
                    System.out.println("Introduce el Genero");
                    genero = sc.nextLine();
                    nuevaZapatillaHogar.setGenero(genero);
                    System.out.println("Introduce la talla");
                    int talla = sc.nextInt();
                    nuevaZapatillaHogar.setTalla(talla);
                    GrabarCalzado(nuevaZapatillaHogar);
                    // System.out.println("Zapatilla de hogar modelo : " + nuevaZapatillaHogar.getModelo() + " El código es: " + nuevaZapatillaHogar.getCodigo());
                    break;
                case 3:
                    //ChangletaSandalias
                    ChangletaSandalias nuevaChangletaSandalia = new ChangletaSandalias();
                    System.out.println("Introduce el tipo de calzado Changleta o Sandalia");
                    tipo = sc.nextLine();
                    nuevaChangletaSandalia.setTipo(tipo);
                    System.out.println("Introduce el codigo ");
                    codigo = sc.nextLine();
                    nuevaChangletaSandalia.setCodigo(codigo);
                    System.out.println("Introduce el modelo");
                    modelo = sc.nextLine();
                    nuevaChangletaSandalia.setModelo(modelo);
                    System.out.println("Introduce el material");
                    material = sc.nextLine();
                    nuevaChangletaSandalia.setMaterial(material);
                    System.out.println("Introduce el Genero");
                    genero = sc.nextLine();
                    nuevaChangletaSandalia.setGenero(genero);
                    System.out.println("Introduce la talla");
                    talla = sc.nextInt();
                    nuevaChangletaSandalia.setTalla(talla);
                    System.out.println("Introduce el precio");
                    precio = sc.nextInt();
                    nuevaChangletaSandalia.setPrecio(precio);
                    System.out.println("Introduce la foto");
                    urlFoto = sc.nextLine();
                    nuevaChangletaSandalia.setUrlFoto(urlFoto);
                    System.out.println("Introduce el fabricante");
                    fabricante = sc.nextLine();
                    nuevaChangletaSandalia.setFabricante(fabricante);
                    GrabarCalzado(nuevaChangletaSandalia);
                    break;
            }
        } while (opciones != 0);

        /**
         * try{ archivo=new RandoAccessFile("Calzado.dat","rw");
         * }catch(IOException e){
         *
         * }
         */
    }

    /**
     * consultacalzado Metodo para introducir los datos para hacer una Consulta
     * param Consulta --valor de la Consulta
     *
     */
    public static void consultacalzado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dato");
        Scanner buscar = new Scanner(System.in);
        String consulta = buscar.nextLine();
        
    }
    //retorna 

    public static void LeerCalzado() {
        
    }

    /**
     * Metodo que grava en Randomaccessfile
     *
     * @param objeto --Pasamos el valor de los diferentes objetos segun su
     * creación
     */
    static void GrabarCalzado(Object objeto)throws FileNotFoundException,IOException {
         //meter datos en randomaccessfile
        RandomAccessFile f = new RandomAccessFile("datos.txt", "rw");
        f.seek(f.length());
        if (objeto instanceof ChangletaSandalias) {
            
            ChangletaSandalias p = (ChangletaSandalias) objeto;
            // material;
            f.writeInt(p.getCodigo());
        }
        if (objeto instanceof ZapatillasHogar) {
            //atributos de calzado
            ZapatillasHogar p = (ZapatillasHogar) objeto;
        }
        if (objeto instanceof Zapato) {
            
            Zapato p = (Zapato) objeto;
            /*
             private String material;
             private String color;*/
        }
        
        if (objeto instanceof CalzadoDeportivo) {
            //calzado CalzadoDeportivo actividad
            CalzadoDeportivo p = (CalzadoDeportivo) objeto;
            
        }


        /* Comun
    codigo;
    talla; f.writeInt(p.getCodigo());
    urlFoto;
    modelo;
    genero;
    precio;
    fabricante;
    tipo;*/
    }
    
    public static void BorrarCalzado() {
    }

    /**
     * metodo listadocalzado lISTADO CALZADO POR TIPO(DEPORTIVO,HOGAR,ZAPATOS)
     */
    public static void listadocalzado() {
        //deportivo hogar zapatos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ver listados.");
        System.out.println("1.Listado de clazado deportivo.");
        System.out.println("2.Listado de zapatillas hogar.");
        System.out.println("3.Listado de zapatos.");
        System.out.println("Introduce una opción.");
        int opciones = sc.nextInt();
        do {
            switch (opciones) {
                
            }
            
        } while (opciones != 0);
    }
    
}
