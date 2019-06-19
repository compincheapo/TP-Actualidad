package modelo;

import java.util.Date;

/**
 *
 * @author Gabriel Britez, Fernando Nahirñak
 */
public class NoDocente extends Empleado {
    
    private String titulo;
    
    public NoDocente(String nombre, String email, int telefono,String direccion, double salario, Date fecha, String titulo){
        super(nombre, email, telefono,direccion, salario, fecha);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "NoDocente: " + super.getNombre()+"Telefono"+super.getTelefono()+"Salario"+super.getSalario();
    }
}
