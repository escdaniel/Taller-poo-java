import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner objScan = new Scanner(System.in);
        GestionCurso objGestion =new GestionCurso();

        int option =0;
        do {
            System.out.println("""
                    MENU DE OPCIONES
                    1. Administrar Estudiantes
                    2. Administrar Cursos
                    3. Salir
                    
                    Ingrese una opcion:
                    """);
            option = objScan.nextInt();

            switch (option){

                case 1:
                    int option3 =0;
                do {
                    System.out.println("""
                            MENU DE ESTUDIANTES
                            1. Agregar estudiantes al curso
                            2. Listar todos los estudiantes de un curso
                            3. Eliminar estudiantes de un curso
                            4. Salir
                            
                            Ingrece aluna opcion:
                            """);
                    option3 = objScan.nextInt();
                    switch (option3){
                        case 1:
                            objGestion.listarTodosLosCursos();
                            System.out.println("Ingresa el codigo del curso donde "+
                                    "Ingresaras el nuevo estudiante");
                            String codigo = objScan.next();

                            Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);

                            if (objCurso==null){
                                System.out.println("El codigo ingresado no es valido");
                            }else {
                                objCurso.agregarEstudiantes(objScan);
                            }
                            break;
                        case 2:
                            objGestion.listarTodosLosCursos();
                            System.out.println("Ingresa el codigo del curso donde "+
                                    "Ingresaras el nuevo estudiante");
                            codigo = objScan.next();

                            objCurso = objGestion.buscarCursoPorCodigo(codigo);

                            if (objCurso==null){
                                System.out.println("El codigo ingresado no es valido");
                            }else {
                                objCurso.listarEstudiantes();
                            }
                            break;

                        case 3:// Eliminar estudiante de un curso
                            //1. Listar el curso
                            objGestion.listarTodosLosCursos();
                            //2. Preguntar el codigo del curso
                            System.out.println("Ingresa el codigo donde deseas eliminar al estudiante");
                            codigo = objScan.next();
                            //3. Buscar el curso que tenga el codigo
                            Curso objcurso = objGestion.buscarCursoPorCodigo(codigo);
                            if (objcurso == null){
                                System.out.println("El codigo ingresado no coincide con ningun estudiante");
                            }else {
                                //4. Eliminar el estudiante del curso encontrado
                                objcurso.elkminarEstudiante(objScan);
                            }
                            break;
                    }


                }while (option !=4);
                    break;
                case 2:
                    int option2 =0;
                    do {
                        System.out.println("""
                               MENU DE CURSO
                                1. Agregar Curso
                                2. Listar Curso
                                3. Buscar codigo
                                4. salir
                                INGRESES UNA OPCION:
                                """);
                        option2 = objScan.nextInt();
                        switch (option2){
                            case 1:
                                objGestion.agregarCurso(objScan);
                                break;
                            case 2:
                                objGestion.listarTodosLosCursos();
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del curso a buscar ");
                                String codigo = objScan.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objCurso == null){
                                    System.out.println("No existe ninigun curso con ese codigo");
                                }else {
                                    System.out.println(objScan.toString());
                                }
                                break;
                        }
                    }while (option2 !=4);
                    break;
            }

        }while (option !=3);
    }
}