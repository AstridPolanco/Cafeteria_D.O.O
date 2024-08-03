package gt.edu.miumg.cafeteria;

public class Vainilla implements Ingrediente{

    private int cantidad;

    public Vainilla(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Vainilla";
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Vainilla{" +
                "cantidad=" + cantidad +
                '}';
    }
}
