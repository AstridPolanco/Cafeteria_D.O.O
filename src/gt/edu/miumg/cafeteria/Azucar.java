package gt.edu.miumg.cafeteria;

public class Azucar implements Ingrediente{
    private int cantidad;

    public Azucar(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Azucar";
    }
    public int obtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Azucar{" +
                "cantidad=" + cantidad +
                '}';
    }
}
