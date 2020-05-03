package utils;

/**
 * @author fernando
 *
 */
import zapateria.*;

public class Alta {

    /**
     * Da de Alta un tipo de calzado
     * @author Fernando Barreiro
     * @author desinweb.com
     * @version 1.0
     * @since 1.0
     * @param altacalzado da de Alta un calzado
     */
    public static void altacalzado() {
        //inicializo el objeto
        Calzado nuevoCalzado = new Calzado();
        nuevoCalzado.setCodigo(123459);
        nuevoCalzado.setUrlFoto("hsajhs");
        nuevoCalzado.setGenero("Mujer");
        nuevoCalzado.setModelo("smd54");
        nuevoCalzado.setTalla(35);
        Zapatos nuevoZapato =new Zapatos();
        //llamar metodo escribir o RANDOMACCESSFILE
        System.out.println("hola "+nuevoCalzado.getTalla());

    }

}
