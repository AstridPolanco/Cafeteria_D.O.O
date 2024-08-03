package gt.edu.miumg.cafeteria;

public class Leche implements Ingrediente{

    private String tipo;
    private int cantidad;

    public Leche(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Leche" + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Leche{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
