package proyectoestructurasdatos;

/**
 *
 * @author Alonso Muñoz Aguilar
 */
public class NodoC {

    //Nodo Cola
    private Dato elemento;
    private NodoC siguiente;

    public NodoC() {
        this.siguiente = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoC siguiente) {
        this.siguiente = siguiente;
    }
}
