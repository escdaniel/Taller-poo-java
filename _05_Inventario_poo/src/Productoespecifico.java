public class Productoespecifico extends Producto {

    private String categoria;
    private String marca;

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Productoespecifico{" +
                "categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public Productoespecifico (int id, String nombre, double precio,
                               String categoria, String marca) {
        super(id, nombre, precio);
        this.marca = marca;
        this.categoria = categoria;

    }

}

