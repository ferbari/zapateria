package utils;

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
        //nuevaZapatillaHogar
        ZapatillasHogar nuevaZapatillaHogar = new ZapatillasHogar();
        nuevaZapatillaHogar.setCodigo("9874");
        nuevaZapatillaHogar.setTalla(38);
        nuevaZapatillaHogar.setGenero("mujer");
        nuevaZapatillaHogar.setModelo("RRRT567");
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
                
        //llamar metodo escribir o RANDOMACCESSFILE
        System.out.println("hola " + nuevoCalzado.getTalla());
        System.out.println("Zapato " + nuevoZapato.getColor() + " El material es: " + nuevoZapato.getMaterial());
        System.out.println("Zapatilla de hogar " + nuevaZapatillaHogar.getCodigo());
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
