package modelo;

import java.util.Date;

/**
 *
 * @author Gabriel Britez, Fernando Nahirñak
 */
public class Docente extends Empleado{
    
    private String cargo;
    
    public Docente(String nombre, String email, int telefono,String direccion, double salario, Date fecha, String cargo){
        super(nombre, email, telefono,direccion, salario, fecha);
      
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Docente: " + super.getNombre()+"Telefono"+super.getTelefono()+"Salario"+super.getSalario();
    }
    
}
