import java.util.ArrayList;

class Estacion {
    String nombre;
    public Estacion(String nombre) {
        this.nombre = nombre;
    }
}

class Bus {
    String ruta; 
    public Bus(String ruta) {
        this.ruta = ruta;
    }
}
class Transmilenio {
    ArrayList<Estacion> estaciones = new ArrayList<>();
    ArrayList<Bus> buses = new ArrayList<>();

    public void agregarEstacion(String nombre) {
        Estacion estacion = new Estacion(nombre);
        estaciones.add(estacion);
    }

    public void agregarBus(String ruta) {
        Bus bus = new Bus(ruta);
        buses.add(bus);
    }

    public void eliminarEstacion() {
        estaciones.remove(estaciones.size() - 1);
    }

    public Bus obtenerProximoBus() {
        return buses.get(0);
    }

    public void eliminarBus() {
        buses.remove(0);
    }

    public void imprimirRutaActual() {
        System.out.println("Ruta actual:");
        for (Bus bus : buses) {
            System.out.println("- " + bus.ruta);
        }
    }
}

public class Trasmilenio {
    public static void main(String[] args) {
        Transmilenio transmilenio = new Transmilenio();
        transmilenio.agregarEstacion("Portal 80");
        transmilenio.agregarEstacion("Ciudad Universitaria");
        transmilenio.agregarEstacion("NQS - Calle 75");
        transmilenio.agregarBus("T11");
        transmilenio.agregarBus("E27");
        transmilenio.agregarBus("L82");
        System.out.println("Primer bus en salir: " + transmilenio.obtenerProximoBus().ruta);
        transmilenio.imprimirRutaActual();
        transmilenio.eliminarEstacion();
        transmilenio.eliminarBus();
        System.out.println("Segundo bus en salir: " + transmilenio.obtenerProximoBus().ruta);
        transmilenio.imprimirRutaActual();
    }
}
