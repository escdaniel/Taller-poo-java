public class Empleado extends Persona{

    private int idEmpleado;
    private double Salario;

    public Empleado(String nombre, double edad, int idEmpleado, double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        Salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalario() {
        return Salario;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", Salario=" + Salario +
                '}';
    }
}
