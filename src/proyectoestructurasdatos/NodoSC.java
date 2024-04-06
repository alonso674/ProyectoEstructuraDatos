package proyectoestructurasdatos;

/**
 *
 * @author Alonso Muñoz Aguilar
 */
public class NodoSC {

    //Nodo Lista Simple Circular
    private Dato elemento;
    private NodoSC siguiente;

    public NodoSC() {
        this.siguiente = null;
    }

    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSC siguiente) {
        this.siguiente = siguiente;
    }
}
