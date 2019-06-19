package modelo;

/**
 * Modificación aquí.
 * @author Gabriel Britez, Fernando Nahirñak
 */
public class Estudiante extends Persona {
    private int SituacionClase;

    public Estudiante(String nombre, String email, int telefono,String direccion, int Situacion) {
        super(nombre, email, telefono, direccion);
        
    }

    public int getSituacionClase() {
        return SituacionClase;
    }

    public void setSituacionClase(int SituacionClase) {
        this.SituacionClase = SituacionClase;
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.getNombre()+"Telefono"+ super.getTelefono()+"Direccion"+super.getDireccion();
    }
}
