package proyectoestructurasdatos;

/**
 *
 * @author Alonso Muñoz Aguilar
 */
public class Cliente {

    private String nombre;
    private int id;
    private String correo;

    public Cliente(String nombre, int id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
