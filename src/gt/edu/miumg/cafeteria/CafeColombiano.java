package gt.edu.miumg.cafeteria;

public class CafeColombiano extends Cafe{

    private String tipoGrano;

    public CafeColombiano(String tipoGrano, int tamano, double precio) {
        super("Cafe Colombiano", tamano, precio);
        this.tipoGrano = tipoGrano;
        ingredientes.add(new Grano("Robusta"));
        ingredientes.add(new Agua(70));
        ingredientes.add(new Vainilla(5));
    }

    @Override
    public String toString() {
        return "CafeColombiano{" +
                "tipoGrano='" + tipoGrano + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
