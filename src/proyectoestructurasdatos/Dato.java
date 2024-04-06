package proyectoestructurasdatos;

/**
 *
 * @author Alonso Muñoz Aguilar
 */
public class Dato {

    private String libro;
    private String articulo;
    private String revista;

    public void Dato() {
        this.setLibro("");
        this.setArticulo("");
        this.setRevista("");
    }

    public String getLibro() {
        return libro;
    }

    public String getArticulo() {
        return articulo;
    }

    public String getRevista() {
        return revista;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setRevista(String revista) {
        this.revista = revista;
    }
}
