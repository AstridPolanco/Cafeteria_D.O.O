package gt.edu.miumg.cafeteria;

public class EspressoItaliano extends Cafe{

    private int intensidad;

    public EspressoItaliano(int intensidad, int tamano, double precio) {
        super("Espresso Italiano", tamano, precio);
        this.intensidad = intensidad;
        ingredientes.add(new Grano("Arabica"));
        ingredientes.add(new Agua(100));
        ingredientes.add(new Leche("Entera", 8));
        ingredientes.add(new Azucar(10));

    }

    @Override
    public String toString() {
        return "EspressoItaliano{" +
                "intensidad=" + intensidad +
                "ingredientes=" + ingredientes +
                '}';
    }
}
