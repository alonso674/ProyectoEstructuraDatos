package proyectoestructurasdatos;

/**
 *
 * @author Alonso Muñoz Aguilar
 */
public class NodoA {

    //Nodo Arbol
    private Dato elemento;
    private NodoA enlaceIzq;
    private NodoA enlaceDer;

    public NodoA() {
        this.enlaceDer = null;
        this.enlaceIzq = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public NodoA getEnlaceIzq() {
        return enlaceIzq;
    }

    public NodoA getEnlaceDer() {
        return enlaceDer;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public void setEnlaceIzq(NodoA enlaceIzq) {
        this.enlaceIzq = enlaceIzq;
    }

    public void setEnlaceDer(NodoA enlaceDer) {
        this.enlaceDer = enlaceDer;
    }
}
