import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String codigo;
    private String nombre;

    private ArrayList<Estudiante>listaEstudiantes;

    public static int index = 1;
    public Curso(String nombre,String codigo){
        this.nombre = nombre;
        this. codigo = codigo;
        this. listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiantes(Scanner objScan){
        System.out.println("Ingresa el nombre del estudiante");
        String nombre = objScan.nextLine();
        System.out.println("Ingresa el email del estudiante");
        String email = objScan.nextLine();

        Estudiante objEstudiante = new Estudiante(1,nombre,email);
        index++;

        this.listaEstudiantes.add(objEstudiante);
        System.out.println("Estudiantes agregados correctamente");
    }
    public String getCodigo() {
        return codigo;
    }

    public void listarEstudiantes() {
        if (this.listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en el curso".concat(this.nombre));
        } else {
            System.out.println("Lisya de estudiantes del curso".concat(this.nombre));

            System.out.println("Lista de estudiantes del curso".concat(this.nombre));

            for (Estudiante temporal : this.listaEstudiantes) {
                System.out.println(temporal.toString());
            }
        }
    }

    public void elkminarEstudiante(Scanner objScan){
        this.listarEstudiantes();

        System.out.println("Ingrese el id de estudiante a elminar");
        int idEliminar = objScan.nextInt();

        boolean eliminado = this.listaEstudiantes.removeIf(estudiante -> estudiante.getId()==idEliminar);
        if (eliminado);
    }
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
