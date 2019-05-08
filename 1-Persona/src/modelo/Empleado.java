package modelo;

import java.util.Date;
/**
 *
 * @author Gabriel Britez, Fernando Nahirñak
 */
public abstract class Empleado extends Persona {
    private double salario;
    private Date fechaContrato;
    
    protected Empleado(String nombre, String email, int telefono, double salario, Date fecha){
        super(nombre, email, telefono);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        return "Empleado: " + super.getNombre();
    }
}
