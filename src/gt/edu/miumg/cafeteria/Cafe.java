package gt.edu.miumg.cafeteria;

import java.util.ArrayList;
import java.util.List;

public abstract class Cafe {
    private String nombre;
    private int tamano;
    private double precio;
    protected List<Ingrediente> ingredientes = new ArrayList<>();

    public Cafe(String nombre, int tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "nombre='" + nombre + '\'' +
                ", tamano=" + tamano +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
