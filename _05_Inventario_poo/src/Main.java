
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Productoespecifico objProducto1 = new Productoespecifico(1,"lapiz",2000,
                "papeleria","bif");

        Productoespecifico objProducto2 = new Productoespecifico(2,"cuaderno",
                6000,"cuaderno","Norma");

        Inventario objInventario = new Inventario();
        objInventario.agregarProducto(objProducto1);
        objInventario.agregarProducto(objProducto2);

        objInventario.listarProductos();

    }
}