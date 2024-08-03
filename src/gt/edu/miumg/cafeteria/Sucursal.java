package gt.edu.miumg.cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private Cafe cafe;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public void agregarEmpleado(Empleado empleado) {
        System.out.println("Agregando empleado");
        empleados.add(empleado);
    }
    public void agregarEquipo(Equipo equipo) {
        System.out.println("Agregando equipo");
        equipos.add(equipo);
    }
    public void agregarIngrediente(Ingrediente ingrediente) {
        System.out.println("Agregando ingrediente");
        ingredientes.add(ingrediente);
    }

    public void agregarEspecialidad(Cafe cafe) {
        System.out.println("Agregando cafe");
        this.cafe = cafe;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                ", equipos=" + equipos +
                ", ingredientes=" + ingredientes +
                ", cafe=" + cafe +
                '}';
    }
}
