import java.util.ArrayList;
import java.util.Scanner;

    public class GestionCurso {
        private ArrayList<Curso> listaCurso;


    public GestionCurso(){
        this.listaCurso = new ArrayList<>();
    }

    public void  agregarCurso(Scanner objScan){
        System.out.println("Ingresa el nombre del nuevo curso");
        String nombre = objScan.next();

        System.out.println("Ingresa el codigo del nuevo curso");
        String codigo = objScan.next();

        if (this.buscarCursoPorCodigo(codigo) != null){
            System.out.println("\n Ya existe un curso con este codigo");
        }else {
            Curso objCurso = new Curso(codigo,nombre);
           if  (this.listaCurso.add(objCurso)){
               System.out.println("Curso agregado correctamente");
           }else {
               System.out.println("No se pudo agregar curso.");
           }
        }
    }

    public void listarTodosLosCursos() {
        if (this.listaCurso.isEmpty()) {
            System.out.println("No hay cursos listados");
        } else {

            for (Curso i : this.listaCurso) {
                System.out.println(i.toString());
            }
        }
    }
    public Curso buscarCursoPorCodigo(String codigoBuscar){
        for (Curso temporal:this.listaCurso){
            if (temporal.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return temporal;
            }
        }
        return null;
    }
}
