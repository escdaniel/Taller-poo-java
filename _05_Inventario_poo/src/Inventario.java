import java.util.ArrayList;

public class Inventario {

    private ArrayList<Productoespecifico> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Productoespecifico producto) {
        this.listaProductos.add(producto);
    }

    public boolean eliminarProducto(int id) {
        return this.listaProductos.removeIf(producto -> producto.getId() == id);
    }

    public void listarProductos() {
        for (Productoespecifico iterador : this.listaProductos)
            System.out.println(iterador.toString());
    }

    public Productoespecifico bucarPorNombre(String nombreBuscar) {
        for (Productoespecifico iterador : this.listaProductos) {
            if (iterador.getNombre().equalsIgnoreCase(nombreBuscar)) {
                return iterador;
            }
        }
        return null;
    }
    public Productoespecifico bucarPorCategoria(String categoriaBuscar) {
        for (Productoespecifico iterador : this.listaProductos) {
            if (iterador.getNombre().equalsIgnoreCase(categoriaBuscar)) {
                return iterador;
                }
            }
            return null;
        }
    }
