package proyectoestructurasdatos;

/**
 *
 * @author Alonso Muñoz Aguilar
 */
public class NodoES {

    //Nodo Lista Enlazada Simple
    private Cliente dato;
    private NodoES siguiente;

    public NodoES() {
        this.siguiente = null;
    }

    public Cliente getDato() {
        return dato;
    }

    public NodoES getSiguiente() {
        return siguiente;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public void setSiguiente(NodoES siguiente) {
        this.siguiente = siguiente;
    }
}

