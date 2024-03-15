
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
GestionEmpleados gestionEmpleados = new GestionEmpleados();
    Empleado empleado1 = new EmpleadoPermanente("juan perez", 30,1,3000);
    Empleado empleado2 = new EmpleadoTemporal("lucero martinez",25,2,2500);

        gestionEmpleados.agregarEmpleado(empleado1);
        gestionEmpleados.agregarEmpleado(empleado2);

        gestionEmpleados.mostrarEmpleados();

        gestionEmpleados.eliminarEmpleado(1);

        System.out.println("\nDespues de eliminar");
        gestionEmpleados.mostrarEmpleados();
    }
}