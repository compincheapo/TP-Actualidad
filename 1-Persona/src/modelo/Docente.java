package modelo;

import java.util.Date;

/**
 *
 * @author Gabriel Britez, Fernando Nahirñak
 */
public class Docente extends Empleado{
    
    private String cargo;
    
    public Docente(String nombre, String email, int telefono, double salario, Date fecha, String cargo){
        super(nombre, email, telefono, salario, fecha);
      
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Docente: " + super.getNombre();
    }
    
}