package modelo;

/**
 *
 * @author Gabriel Britez, Fernando Nahirñak
 */
public abstract class Persona {
    private String nombre;
    private String direccion;
    private String email;
    private int telefono;
    
    protected Persona(String nombre, String email, int telefono){
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre;
    }
    
    
    
}
