package zapateria;

/**
 * Clase generica calzado
 *
 * @author Fernando Barreiro
 * @author desinweb.com
 * @version 1.0
 * @since 1.0
 */
public class Calzado {

   private int codigo;
   private int talla;
   private String urlFoto;
   private String modelo;
   private String genero;

    public Calzado() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
