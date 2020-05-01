package utils;

/**
 * @author fernando
 *
 */
import zapateria.*;
public class alta {
/**
     * Da de alta un calzado
     * @param altacalzado - da de alta un calzado
     */
    public static void altacalzado() {
        //inicializo el objeto
       Calzado  nuevoCalzado  = new Calzado();
       nuevoCalzado.setCodigo(123459);
       nuevoCalzado.setUrlFoto("hsajhs");
       nuevoCalzado.setGenero("Mujer");
       nuevoCalzado.setModelo("smd54");
       nuevoCalzado.setTalla(35);
        System.out.println("hola");
        
    }

}
