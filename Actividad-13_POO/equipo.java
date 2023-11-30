import java.util.ArrayList;
import java.util.List;

public class equipo {

    public String nombre;
    public int fundacion;
    public int ganados;
    public int empatados;
    public int perdidios;
    public List<jugador> jugadores;

    public equipo(String nombre, int fundacion) {
        this.nombre = nombre; // Utiliza "this" para referenciar el atributo de la clase
        this.fundacion = fundacion; // Utiliza "this" para referenciar el atributo de la clase
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(jugador jugador) {
        jugadores.remove(jugador);
    }

    public void listaNombreJugadores() {
        System.out.println("Nombre de los jugadores del equipo: " + nombre);
        for (jugador jugador : jugadores) {
            System.err.println("Cedula: " + jugador.getCedula());
            System.out.println("Nombre: " + jugador.getNombre());
            System.out.println("Edad: " + jugador.getEdad());
            System.out.println("Posicion: " + jugador.getPosicion());
        }
    }
}
