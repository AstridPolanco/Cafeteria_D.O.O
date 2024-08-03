import gt.edu.miumg.cafeteria.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crear nuevo cafe
        Cafe colombiano = new CafeColombiano("Robusta", 16, 7.50);
        System.out.println("colombiano = " + colombiano);
        Cafe italiano = new EspressoItaliano(8, 10, 5.00);
        System.out.println("italiano = " + italiano);

        // Crear Empleados
        Empleado empleado1 = new Empleado("Lusvin Aragón", "Barista", 1400);
        System.out.println("empleado1 = " + empleado1);
        Empleado empleado2 = new Empleado("Sofia Lima", "Gerente", 2500);
        System.out.println("empleado2 = " + empleado2);
        Empleado empleado3 = new Empleado("Carlos Martínez", "Mesero", 1000);
        System.out.println("empleado3 = " + empleado3);
        Empleado empleado4 = new Empleado("Ana", "Cajera", 1250);
        System.out.println("empleado4 = " + empleado4);

        // Crear equipos
        Equipo maquinaCafe1 = new Equipo("Maquina de Cafe", "Encendido");
        System.out.println("maquinaCafe1 = " + maquinaCafe1);
        Equipo molino = new Equipo("Molino", "Apagado");
        System.out.println("molino = " + molino);
        Equipo maquinaCafe2 = new Equipo("Máquina de Espresso", "Reparado");
        System.out.println("maquinaCafe2 = " + maquinaCafe2);
        Equipo molino2 = new Equipo("Molino de Café", "Encendido");
        System.out.println("molino2 = " + molino2);


        //agregar ingrediente
        Ingrediente ingrediente1 = new Leche("Entera", 10);
        System.out.println("ingrediente1 = " + ingrediente1);

        // Crear sucursal
        Sucursal sucursalBogota = new Sucursal("Sucursal Market", "Calle 24 A # 57 – 60, Bogotá");
        System.out.println("sucursalBogota = " + sucursalBogota);

        // Agregar empleados a la sucursal
        sucursalBogota.agregarEmpleado(empleado1);
        sucursalBogota.agregarEmpleado(empleado2);

        // Agregar equipos a la sucursal
        sucursalBogota.agregarEquipo(maquinaCafe1);
        sucursalBogota.agregarEquipo(molino);

        // Agregar especialidades a la sucursal
        sucursalBogota.agregarEspecialidad(colombiano);
        System.out.println("sucursalBogota = " + sucursalBogota);

        // Crear segunda sucursal
        Sucursal sucursalCentro = new Sucursal("Sucursal Centro", "Carretera 7 # 32-16, Medellín");
        System.out.println("sucursalCentro = " + sucursalCentro);

        // Agregar empleados a la segunda sucursal
        sucursalCentro.agregarEmpleado(empleado3);
        sucursalCentro.agregarEmpleado(empleado4);

        // Agregar equipos a la segunda sucursal
        sucursalCentro.agregarEquipo(maquinaCafe2);
        sucursalCentro.agregarEquipo(molino2);

        // Agregar especialidades a la segunda sucursal
        sucursalCentro.agregarEspecialidad(italiano);
        System.out.println("sucursalCentro = " + sucursalCentro);
        }
}